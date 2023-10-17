package com.manar.books;

public class Book {
    private String title;
    private String auother;
    private String category;

    public Book(String title, String auother, String category) {
        this.title = title;
        this.auother = auother;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuother() {
        return auother;
    }

    public void setAuother(String auother) {
        this.auother = auother;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
