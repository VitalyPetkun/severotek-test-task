package services;

public enum Paths {

    MAIN_RESOUCES("src\\main\\resources\\"),
    TEST_RESOURCES("src\\test\\resources\\");

    private String path;

    Paths(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
