package com.app.uevents.Models;

public class Event {
    private String category;

    /* renamed from: id */
    private String id;
    private int image;
    private boolean isFeatured;
    private String name;
    private String organizer;
    private String prce;
    private String price;

    public Event() {
    }

    public Event(String name2, int image2, String category2, String price2,
                 String organizer2, String prce2, boolean isFeatured2) {
        this.name = name2;
        this.image = image2;
        this.category = category2;
        this.price = price2;
        this.organizer = organizer2;
        this.prce = prce2;
        this.isFeatured = isFeatured2;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name2) {
        this.name = name2;
    }

    public int getImage() {
        return this.image;
    }

    public void setImage(int image2) {
        this.image = image2;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category2) {
        this.category = category2;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price2) {
        this.price = price2;
    }

    public String getOrganizer() {
        return this.organizer;
    }

    public void setOrganizer(String organizer2) {
        this.organizer = organizer2;
    }

    public String getPrce() {
        return this.prce;
    }

    public void setPrce(String prce2) {
        this.prce = prce2;
    }

    public boolean isFeatured() {
        return this.isFeatured;
    }

    public void setFeatured(boolean featured) {
        this.isFeatured = featured;
    }
}
