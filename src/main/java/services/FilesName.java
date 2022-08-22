package services;

public enum FilesName {

    CONFIG("config.properties"),
    TEST_DATA("testData.properties");

    private String fileName;

    FilesName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}
