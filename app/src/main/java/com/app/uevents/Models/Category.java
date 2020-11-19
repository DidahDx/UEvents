package com.app.uevents.Models;

public class Category {
    private int color;
    private String title;

    public Category(String title2) {
        setTitle(title2);
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title2) {
        this.title = title2;
    }

    public int getColor() {
        return this.color;
    }

    public void setColor(int color2) {
        this.color = color2;
    }
}
