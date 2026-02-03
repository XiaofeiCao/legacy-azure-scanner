package com.xiaofei.legacyazurescanner;

/**
 * @author xiaofeicao
 */
public class Main {
    public static void main(String[] args) {
        LegacyAzureScanner scanner = new LegacyAzureScanner("https://repo1.maven.org/maven2/com/microsoft/azure/", Runtime.getRuntime().availableProcessors() / 2 + 1);
        scanner.start();
    }
}
