package com.plugshare;

public class Outlet {
    public Integer id;
    public Integer connector;
    public Integer power;
    @Deprecated
    public String available;
    public String status;
    public String status_changed_up;
    @Override
    public String toString() {
        return "Outlet [available=" + available + ", connector=" + connector + ", id=" + id + ", power=" + power
                + ", status=" + status + ", status_changed_up=" + status_changed_up + "]";
    }

    
}
