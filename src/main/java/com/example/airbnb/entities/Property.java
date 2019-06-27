package com.example.airbnb.entities;
import java.util.ArrayList;

public class Property {
    int id;
    ArrayList<Info> info;
    ArrayList<Language> languages;
    ArrayList<Amenity> amenities;
    ArrayList<Review> reviews;
    
    public Property(int id, ArrayList<Info> info,  ArrayList<Language> languages, ArrayList<Amenity> amenities, ArrayList<Review> reviews) {
        this.id = id;
        this.info = new ArrayList<>();
        this.languages = new ArrayList<>();
        this.amenities = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }

    public void addInfo(Info info) {
        this.info.add(info);
    }

    public void addLanguage(Language languages) {
        this.languages.add(languages);
    }

    public void addAmenity(Amenity amenities) {
        this.amenities.add(amenities);
    }

    public void addReview(Review reviews) {
        this.reviews.add(reviews);
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Info> getInfo() {
        return this.info;
    }

    public void setInfo(ArrayList<Info> info) {
        this.info = info;
    }

    public ArrayList<Language> getLanguages() {
        return this.languages;
    }

    public void setLanguages(ArrayList<Language> languages) {
        this.languages = languages;
    }

    public ArrayList<Amenity> getAmenities() {
        return this.amenities;
    }

    public void setAmenities(ArrayList<Amenity> amenities) {
        this.amenities = amenities;
    }

    public ArrayList<Review> getReviews() {
        return this.reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }    
}