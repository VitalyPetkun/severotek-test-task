package services;

public enum Url {

    MARKET_YANDEX("marketYandexUrl");

    private String url;

    Url(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
