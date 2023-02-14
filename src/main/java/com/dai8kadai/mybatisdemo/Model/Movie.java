package com.dai8kadai.mybatisdemo.Model;

public class Movie {
    private int id;
    private int publishedYear;
    private String Title;

    public Movie(int id, int publishedYear, String title) {
        this.id = id;
        this.publishedYear = publishedYear;
        this.Title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
}