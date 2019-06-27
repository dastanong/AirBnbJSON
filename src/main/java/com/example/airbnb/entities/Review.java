package com.example.airbnb.entities;

public class Review {
    String type;
    int rating;

    public Review(String type, int rating) {
        this.type = type;
        this.rating = rating;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRating() {
        return this.rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    
}