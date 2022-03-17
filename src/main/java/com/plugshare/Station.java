package com.plugshare;

import java.util.List;

public class Station {
    public Integer id;
    public String name;
    public Object network;
    public Integer network_id;
    public Integer cost;
    public String cost_description;
    public String manufacturer;
    public String model;
    public Integer pwps_version; // The Pay With PlugShare version protocol required to be supported by the client to activate this station
    public Double latitude; // Latitude coorinate for this station
    public Double Longitude; // Longitude coordinate for this station
    public List<Outlet> outlets;
    public Integer available;
    public String hours;
    public Integer location_id; // The id of the station's parent location
    public String pre_charge_instructions; // Optional network provided instruction to display before charging.
    public Boolean qr_enabled; // True if this station is tagged with a QR code for station identification;
    public String created_at; // ISO 860 Format "yyyy-mm-ddThh:mm:ssZ"
    
    @Override
    public String toString() {
        return "Station [Longitude=" + Longitude + ", available=" + available + ", cost=" + cost + ", cost_description="
                + cost_description + ", created_at=" + created_at + ", hours=" + hours + ", id=" + id + ", latitude="
                + latitude + ", location_id=" + location_id + ", manufacturer=" + manufacturer + ", model=" + model
                + ", name=" + name + ", network=" + network + ", network_id=" + network_id + ", outlets=" + outlets
                + ", pre_charge_instructions=" + pre_charge_instructions + ", pwps_version=" + pwps_version
                + ", qr_enabled=" + qr_enabled + "]";
    }

    

}
