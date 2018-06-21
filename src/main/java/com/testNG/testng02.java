package com.testNG;

import org.junit.jupiter.api.Test;
import org.testng.*;
public class testng02 {
    @Test()
    public void testEmailGenerator() {

        RandomEmailGenerator obj = new RandomEmailGenerator();
        String email = obj.generate();

        Assert.assertNotNull(email);
        Assert.assertEquals(email, "feedback@yiibai.com");

    }
}
