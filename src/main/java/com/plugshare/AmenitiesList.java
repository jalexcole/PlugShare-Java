package com.plugshare;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonValue;

public class AmenitiesList {
    public final Map<Integer, String> amenities = new HashMap<>();

    AmenitiesList() {
        amenities.put(1, "Lodging");
        amenities.put(2, "Dining");
        amenities.put(3, "Restrooms");
        amenities.put(4, "EV Parking");
        amenities.put(5, "Valet Parking");
        amenities.put(6, "Park");
        amenities.put(7, "WiFi");
        amenities.put(8, "Shopping");
        amenities.put(9, "Grocery");
    }
}

