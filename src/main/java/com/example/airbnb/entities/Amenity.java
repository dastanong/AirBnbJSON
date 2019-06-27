
package com.example.airbnb.entities;

public class Amenity {
    String name;
    Boolean isProvided;

    public Amenity(String name, Boolean isProvided) {
        this.name = name;
        this.isProvided = isProvided;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean isIsProvided() {
        return this.isProvided;
    }

    public Boolean getIsProvided() {
        return this.isProvided;
    }

    public void setIsProvided(Boolean isProvided) {
        this.isProvided = isProvided;
    }
}