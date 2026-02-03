package com.xiaofei.legacyazurescanner.maven;

/**
 * @author xiaofeicao
 * @createdAt 2026-02-03 3:26 PM
 */
public class UnknownPage extends MavenPage {
    private static final UnknownPage INSTANCE = new UnknownPage();

    private UnknownPage() {
    }

    public static UnknownPage getInstance() {
        return INSTANCE;
    }
}
