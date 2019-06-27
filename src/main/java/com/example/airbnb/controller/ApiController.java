package com.example.airbnb.controller;

import com.example.airbnb.entities.Property;
import com.example.airbnb.entities.Review;
import com.example.airbnb.entities.Amenity;
import com.example.airbnb.entities.Info;
import com.example.airbnb.entities.Language;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(path = "/api")
public class ApiController {

    @GetMapping(value="/", produces = "application/json")
    public Property getProperty(@RequestParam int id) {
        Property property = new Property(id, null, null, null, null);
        property.addInfo(new Info("https://a0.muscache.com/im/pictures/174db9b0-52f1-4611-a49e-50c160b80534.jpg?aki_policy=xx_large", "Little house in Paris, Loft, Canal",
                                "Paris, France", "RM", 2286, 4, 9, 2, 11, "An ancient industrial building, converted into a loft. A lot of charm for family or friends vacations!",
                                "Segire", "May 2012", true, 94, "6/27/2019", "8/22/2019", false, true
                        ));
        property.addLanguage(new Language("English"));
        property.addLanguage(new Language("Francais"));
        property.addAmenity(new Amenity("wifi", true));
        property.addAmenity(new Amenity("kitchen", true));
        property.addAmenity(new Amenity("bathtub", false));
        property.addAmenity(new Amenity("dryer", true));
        property.addReview(new Review("accuracy", 5));
        property.addReview(new Review("location", 4));
        property.addReview(new Review("communication", 5));
        property.addReview(new Review("checkIn", 5));
        property.addReview(new Review("clealiness", 5));
        property.addReview(new Review("value", 4));

        return property;
    }

}
