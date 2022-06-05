package com.MyFirstProject;

import org.junit.Assert;
import org.junit.Test;

public class Day03_Assertions {
    @Test
    public void assertions(){

        Assert.assertEquals("TEST FAILED","java","java");


       // Assert.assertEquals("TEST FAILED","java","javascript");---> we can see on the concole:

        //org.junit.ComparisonFailure: TEST FAILED
        //Expected :java
        //Actual   :javascript



    }
}
