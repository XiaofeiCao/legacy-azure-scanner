package com.xiaofei.legacyazurescanner.maven;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaofeicao
 */
public class MavenBranchPage extends MavenPage {
    private final List<String> artifactLinks = new ArrayList<>();

    public List<String> getArtifactLinks() {
        return artifactLinks;
    }
}
