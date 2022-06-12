package com.MyFirstProject;

import com.MyFirstProject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Day07_Authentication extends TestBase {
    @Test
    public void basicAuthentication() {
       // driver.get("https://USERNAME:PASSWORD@URL");
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        //verify congratulations text
      String message= driver.findElement(By.xpath("//p")).getText();
        Assert.assertTrue(message.contains("Congratulations!"));
    }
}
