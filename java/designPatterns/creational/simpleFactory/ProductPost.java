package designPatterns.creational.simpleFactory;

/**
 * ProductPost
 */
public class ProductPost extends Post {
    private String imgeUrl;
    private String name;

    public String getImgeUrl() {
        return imgeUrl;
    }

    public void setImgeUrl(String imgeUrl) {
        this.imgeUrl = imgeUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
