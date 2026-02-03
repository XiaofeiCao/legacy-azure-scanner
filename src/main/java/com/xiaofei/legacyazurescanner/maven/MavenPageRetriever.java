package com.xiaofei.legacyazurescanner.maven;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * @author xiaofeicao
 */
public class MavenPageRetriever {
    private final HttpClient httpClient;

    public MavenPageRetriever() {
        this.httpClient = HttpClient.newHttpClient();
    }

    public MavenPage retrieve(String url) throws Exception {
        HttpResponse<String> response = httpClient.send(
            HttpRequest.newBuilder()
                .GET()
                .header("User-Agent", "azure-sdk-for-java")
                .header("Content-Signal", "search=yes,ai-train=no")
                .uri(new URI(url))
                .build(),
            HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() == 404) {
            return UnknownPage.getInstance();
        }
        if (response.statusCode() != 200) {
            throw new IllegalStateException(String.format("Url: %s returns %d", url, response.statusCode()));
        }
        return MavenPage.parse(url, response.body());
    }
}
