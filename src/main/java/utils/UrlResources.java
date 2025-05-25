package utils;

public enum UrlResources {
    AUTHORIZATION("https://restful-booker.herokuapp.com/auth");
    private final String url;
    private UrlResources(String url) {
        this.url = url;
    }
    public String getUrl() {
        return this.url;
    }
}
