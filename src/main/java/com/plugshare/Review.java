package com.plugshare;

public class Review {
    Integer id;
    String start;
    
    String end = "";
    Short count;
    
    @Override
    public String toString() {
        return "Review [count=" + count + ", end=" + end + ", id=" + id + ", start=" + start + "]";
    }

    
}
