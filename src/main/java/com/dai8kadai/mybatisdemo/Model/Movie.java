package com.dai8kadai.mybatisdemo.Model;

public class Movie {
    private int id;
    private String title;
    private int publishedYear;

    public Movie(int id, String title, int publishedYear) {
        this.id = id;
        this.title = title;
        this.publishedYear = publishedYear;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getPublishedYear() {
        return publishedYear;
    }
}
