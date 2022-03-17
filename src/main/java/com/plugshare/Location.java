package com.plugshare;

import java.util.List;

public class Location {
    public Integer id;
    public String name;
    public Double Latitude;
    public Double Longitude;
    public String description;
    public List<Station> stations;
    public List<Review> reviews;
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Latitude == null) ? 0 : Latitude.hashCode());
        result = prime * result + ((Longitude == null) ? 0 : Longitude.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((reviews == null) ? 0 : reviews.hashCode());
        result = prime * result + ((stations == null) ? 0 : stations.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Location other = (Location) obj;
        if (Latitude == null) {
            if (other.Latitude != null)
                return false;
        } else if (!Latitude.equals(other.Latitude))
            return false;
        if (Longitude == null) {
            if (other.Longitude != null)
                return false;
        } else if (!Longitude.equals(other.Longitude))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (reviews == null) {
            if (other.reviews != null)
                return false;
        } else if (!reviews.equals(other.reviews))
            return false;
        if (stations == null) {
            if (other.stations != null)
                return false;
        } else if (!stations.equals(other.stations))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Location [Latitude=" + Latitude + ", Longitude=" + Longitude + ", description=" + description + ", id="
                + id + ", name=" + name + ", reviews=" + reviews + ", stations=" + stations + "]";
    }

    
}
