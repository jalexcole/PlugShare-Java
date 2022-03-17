package com.plugshare;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class PlugShareTest{
    String ApiKey = "";

    PlugShare plugShare;

    @Before
    public void setup() throws Exception {
        plugShare = new PlugShare(ApiKey);
    }

    @Test
    public void getLocation() {
        int location = 3806;
        plugShare.getLocation(0);
        
        assertNotNull(plugShare.getLocation(location));
    }
}
