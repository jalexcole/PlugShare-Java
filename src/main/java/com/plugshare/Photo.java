package com.plugshare;

public class Photo {
    public Integer id;
    public String url;
    public String thumbnale;
    String thumbnail2x;
    String caption;
    Integer order;
    Integer user_id;
    String created_at;
    @Override
    public String toString() {
        return "Photo [caption=" + caption + ", created_at=" + created_at + ", id=" + id + ", order=" + order
                + ", thumbnail2x=" + thumbnail2x + ", thumbnale=" + thumbnale + ", url=" + url + ", user_id=" + user_id
                + "]";
    }

    
}
