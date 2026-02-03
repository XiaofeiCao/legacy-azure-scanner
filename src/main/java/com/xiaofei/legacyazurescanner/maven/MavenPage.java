package com.xiaofei.legacyazurescanner.maven;

import java.net.URI;
import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author xiaofeicao
 */
public abstract class MavenPage {
    private static final Pattern METADATA_PATTERN = Pattern.compile(
        "=\"maven-metadata\\.xml\">maven-metadata\\.xml</a>\\s+" +
        "(\\d{4}-\\d{2}-\\d{2})\\s+(\\d{2}:\\d{2})\\s+(\\d+)"
        );
    private static final Pattern ARTIFACT_PATTERN = Pattern.compile("<a\\b(?=[^>]*\\bhref\\s*=\\s*\"([^\"]*)\")(?=[^>]*\\btitle\\s*=\\s*\"\\1\")[^>]*>");

    public static MavenPage parse(String url, String pageContent) {
        Matcher metadataMatcher = METADATA_PATTERN.matcher(pageContent);
        if (metadataMatcher.find()
            // Hack, https://repo1.maven.org/maven2/com/microsoft/azure/ actually contains maven-metadata.xml... This is the only exception found so far.
            && !pageContent.contains("synapseml-deep-learning_2.12_1.0/")) {
            // leaf page
            String date = metadataMatcher.group(1);
            LocalDate lastReleased = LocalDate.parse(date);
            LocalDate now = LocalDate.now();

            MavenLeafPage leafPage = new MavenLeafPage();
            leafPage.setActive(now.isBefore(lastReleased.plusYears(2)));
            leafPage.setResult(parseArtifactId(url));
            return leafPage;
        } else {
            // branch page
            boolean matches = false;
            Matcher artifactMatcher = ARTIFACT_PATTERN.matcher(pageContent);
            MavenBranchPage branchPage = new MavenBranchPage();
            while (artifactMatcher.find()) {
                branchPage.getArtifactLinks().add(url + artifactMatcher.group(1));
                matches = true;
            }
            if (matches) {
                return branchPage;
            } else {
                return UnknownPage.getInstance();
            }
        }
    }

    private static String parseArtifactId(String url) {

        URI uri = URI.create(url.trim());

        // Normalize path and split
        String path = uri.getPath();              // e.g. /maven2/com/azure/resourcemanager/azure-resourcemanager-arizeaiobservabilityeval/
        if (path == null) {
            throw new IllegalArgumentException("URL has no path: " + url);
        }

        // Strip trailing slashes
        path = path.replaceAll("/+$", "");

        // Find "/maven2/" marker (works for repo1.maven.org, but also for similar layouts)
        int idx = path.indexOf("/maven2/");
        if (idx < 0) {
            throw new IllegalArgumentException("Not a Maven2-style URL (missing /maven2/): " + url);
        }

        String after = path.substring(idx + "/maven2/".length()); // com/azure/.../artifactId
        String[] parts = after.split("/");

        if (parts.length < 2) {
            throw new IllegalArgumentException("Not enough path segments to determine groupId and artifactId: " + url);
        }

        String artifactId = parts[parts.length - 1];
        StringBuilder groupId = new StringBuilder();
        for (int i = 0; i < parts.length - 1; i++) {
            if (i > 0) groupId.append('.');
            groupId.append(parts[i]);
        }

        return groupId + ":" + artifactId;
    }
}
