package com.plugshare;

public class Network {
    public Integer id;
    public String name;
    public String description;
    public String action_name;
    public String action_url;
    public String url;
    public String phone;
    public String image;
    @Override
    public String toString() {
        return "Network [action_name=" + action_name + ", action_url=" + action_url + ", description=" + description
                + ", id=" + id + ", image=" + image + ", name=" + name + ", phone=" + phone + ", url=" + url + "]";
    }

    
}
