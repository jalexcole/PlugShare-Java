package com.plugshare;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.http.HttpResponse;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class PlugShare {
    private static final String address = "https://api.plugshare.com/";
    private Logger logger = Logger.getLogger(PlugShare.class.getName());
    private static ObjectMapper objectMapper = new ObjectMapper();
    private String apikey;

    /**
     * PlugShare requires and API key to be provided
     */
    public PlugShare(String apiKey) {
        this.apikey = apiKey;
    }


    private String getJsonString(String url) {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpget = new HttpGet(url);
        Scanner scanner = null;
        StringBuilder output = new StringBuilder();
        try {
            HttpResponse httpresponse = httpclient.execute(httpget);
            scanner = new Scanner(httpresponse.getEntity().getContent());
            while (scanner.hasNext()) {
                output.append(scanner.nextLine());
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            logger.log(Level.WARNING, e.getMessage());
        } finally {
            scanner.close();
        }

        return output.toString();
    }

    private String postJsonString(String url) {


        return "";
    }

    /**
     * Location id of target location
     * 
     * @param id
     * @return
     */
    public Location getLocation(int id) {
        String handle = "locations/" + id;
        try {
            return objectMapper.readValue(getJsonString(address + handle), Location.class);
        } catch (JsonProcessingException e) {
            logger.warning(e.getMessage());
        }
        return null;

    }

    /**
     * 
     * @param latitude
     * @param longitude
     * @param count
     * @return
     */
    public Collection<Location> getNearbyLocations(double latitude, double longitude, int count) {
        String handle = String.format("locations/nearby?latitude=%f&longitude=%f&count=%d", latitude, longitude, count);
        try {
            return objectMapper.readValue(getJsonString(address + handle), new TypeReference<List<Location>>(){});
        } catch (JsonProcessingException e) {
            logger.warning(e.getMessage());
        }
        return null;
    }

    public Collection<Location> getLocationsInRegion(double spanLat, double spanLng, double lat, double lng, int count) {
        String handle = String.format("locations/region?spanLat=%f&spanLng=%f&latitude=%f&longitude=%f&count=%d", spanLat, spanLng, lat, lng, count);
        try {
            return objectMapper.readValue(getJsonString(address + handle), new TypeReference<List<Location>>(){});
        } catch (JsonProcessingException e) {
            logger.warning(e.getMessage());
        }
        
        return null;
    }

    public Collection<Location> searchLocations() {
        return null;
    }

    public Collection<Station> getStationAvailability(String zipcode) {
        String handle = String.format("stations/availability/%s", zipcode);

        try {
            return objectMapper.readValue(getJsonString(address + handle), new TypeReference<List<Station>>(){});
        } catch (JsonProcessingException e) {
            logger.warning(e.getMessage());
        }

        return null;
    }

    public Collection<Photo> getNetworkPhotos() {
        return null;
    }

    public Collection<Review> getNetworkChackins(int id) {
        return null;
        
    }

}
