package com.example.jesus.kothilapp;

/**
 * Created by jesus on 8/05/17.
 */

public class Craft {

    private String name;
    private String ImageUrl;
    private String creator;

    public Craft(String name, String imageUrl, String creator) {
        this.name = name;
        ImageUrl = imageUrl;
        this.creator = creator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
}
