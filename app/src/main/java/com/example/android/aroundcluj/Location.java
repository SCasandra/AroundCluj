package com.example.android.aroundcluj;

/**
 * Created by Casi on 09.07.2017.
 */

public class Location {
    private int title;
    private int description = NO_IMAGE_PROVIDED;
    private int imageResourceId = NO_IMAGE_PROVIDED;
    private int rating;
    private int address;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Location(int title, int address, int rating) {
        super();
        this.title = title;
        this.address = address;
        this.rating = rating;
    }

    public Location(int title, int address, int rating, int description) {
        this(title, address, rating);
        this.rating = rating;
        this.description = description;

    }

    public Location(int title, int address, int rating, int description, int imageId) {
        this(title, address, rating, description);
        this.imageResourceId = imageId;
    }

    public int getTitle() {
        return title;
    }

    public int getDescription() {
        return description;
    }

    public int getImageId() {
        return imageResourceId;
    }

    public int getRating() {
        return rating;
    }

    public int getAddress() {
        return address;
    }

    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

    public boolean hasDescription() {
        return description != NO_IMAGE_PROVIDED;

    }
}
