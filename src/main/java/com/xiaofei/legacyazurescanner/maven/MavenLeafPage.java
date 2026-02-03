package com.xiaofei.legacyazurescanner.maven;

/**
 * @author xiaofeicao
 */
public class MavenLeafPage extends MavenPage {
    private boolean active;
    private String result;

    public boolean isActive() {

        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
