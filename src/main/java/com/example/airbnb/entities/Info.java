package com.example.airbnb.entities;

import java.util.Date;

public class Info {
    String imageUrl;
    String name;
    String location;
    String currency;
    int price;
    int bedroom;
    int bed;
    int bathroom;
    int maxGuest;
    String shortDescription;
    String ownerName;
    String joinedDate;
    Boolean superhost;
    int responseRate;
    String checkinTime;
    String checkoutTime;
    Boolean smoking;
    Boolean noPets;

    public Info(String imageUrl, String name, String location, String currency, int price, int bedroom, int bed, 
                int bathroom, int maxGuest, String shortDescription, String ownerName, String joinedDate, Boolean superhost, 
                int responseRate, String checkinTime, String checkoutTime, Boolean smoking, Boolean noPets) {
        this.imageUrl = imageUrl;
        this.name = name;
        this.location = location;
        this.currency = currency;
        this.price = price;
        this.bedroom = bedroom;
        this.bed = bed;
        this.bathroom = bathroom;
        this.maxGuest = maxGuest;
        this.shortDescription = shortDescription;
        this.ownerName = ownerName;
        this.joinedDate = joinedDate;
        this.superhost = superhost;
        this.responseRate = responseRate;
        this.checkinTime = checkinTime;
        this.checkoutTime = checkoutTime;
        this.smoking = smoking;
        this.noPets = noPets;
    }
    
    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBedroom() {
        return this.bedroom;
    }

    public void setBedroom(int bedroom) {
        this.bedroom = bedroom;
    }

    public int getBed() {
        return this.bed;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }

    public int getBathroom() {
        return this.bathroom;
    }

    public void setBathroom(int bathroom) {
        this.bathroom = bathroom;
    }

    public int getMaxGuest() {
        return this.maxGuest;
    }

    public void setMaxGuest(int maxGuest) {
        this.maxGuest = maxGuest;
    }

    public String getShortDescription() {
        return this.shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getJoinedDate() {
        return this.joinedDate;
    }

    public void setJoinedDate(String joinedDate) {
        this.joinedDate = joinedDate;
    }

    public Boolean isSuperhost() {
        return this.superhost;
    }

    public Boolean getSuperhost() {
        return this.superhost;
    }

    public void setSuperhost(Boolean superhost) {
        this.superhost = superhost;
    }

    public int getResponseRate() {
        return this.responseRate;
    }

    public void setResponseRate(int responseRate) {
        this.responseRate = responseRate;
    }

    public String getCheckinTime() {
        return this.checkinTime;
    }

    public void setCheckinTime(String checkinTime) {
        this.checkinTime = checkinTime;
    }

    public String getCheckoutTime() {
        return this.checkoutTime;
    }

    public void setCheckoutTime(String checkoutTime) {
        this.checkoutTime = checkoutTime;
    }

    public Boolean isSmoking() {
        return this.smoking;
    }

    public Boolean getSmoking() {
        return this.smoking;
    }

    public void setSmoking(Boolean smoking) {
        this.smoking = smoking;
    }

    public Boolean isNoPets() {
        return this.noPets;
    }

    public Boolean getNoPets() {
        return this.noPets;
    }

    public void setNoPets(Boolean noPets) {
        this.noPets = noPets;
    }
}