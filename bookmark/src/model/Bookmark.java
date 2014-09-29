package model;

/**
 * project_name:java_demo
 * package_name:model
 * user: youzipi
 * date: 2014/8/26
 */
public class Bookmark {
    private String url;
    private String title;
    private String category;

    public Bookmark() {
    }

    public Bookmark(String url, String title, String category) {
        this.url = url;
        this.title = title;
        this.category = category;
    }
}
