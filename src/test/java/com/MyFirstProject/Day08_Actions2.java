package com.MyFirstProject;

import com.MyFirstProject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Actions2 extends TestBase {
    @Test
    public void hoverOver() {
        //Given user on yhe https://www.amazon.com
        driver.get(" https://www.amazon.com");
        //When use click on "Account"link
        WebElement box=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(box).perform();
        driver.findElement(By.linkText("Account")).click();
        //Then verify the page title contains "Your Account"
        Assert.assertTrue(driver.getTitle().contains("Your Account"));


    }
}
