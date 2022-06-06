package com.MyFirstProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;



public class Day03_Locators {

    //create test method locators
    //User goes to http://a.testaddressbook.com/sign_in
    //Locate the elements of email textbox,password textbox,and signin button
    //Enter below username and password then click sign in button
    //Username= testtechproed@gmail.com
    //Password: Test1234!
    //Then verify that the expected user id testtechproed@gmail.com (Use getTest() method to
    //     get the text from the page
    // Verify the adresses and sign in out texts are displayed
    // Find the number of total link on the page
    // sign out from the page


    @Test
    public void locators() {

        //create test method locators
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //User goes to http://a.testadressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");
        //Locate the elements of email textbox,password textbox,and signin button
        //Enter below username and password then click sign in button
        //Username= testtechproed@gmail.com
        //Password: Test1234!
        driver.findElement(By.id("session_email")).sendKeys("testtechproed@gmail.com");
        driver.findElement(By.id("session_password")).sendKeys("Test1234!");

        //Then verify that the expected user id testtechproed@gmail.com (Use getTest() method to
        driver.findElement(By.name("commit")).click();
        //     get the text from the page
        WebElement idElement = driver.findElement(By.className("navbar-text"));
        System.out.println(idElement.getText());
        String idElementString = idElement.getText();
        Assert.assertEquals("testtechproed@gmail.com", idElementString);
        // Verify the adresses and sign in out texts are displayed
        WebElement addresses = driver.findElement(By.linkText("Addresses"));
        Assert.assertTrue(addresses.isDisplayed());
       /* System.out.println(driver.findElement(By.partialLinkText("Addresse"));
        System.out.println(driver.findElement(By.partialLinkText("resses"));
        System.out.println(driver.findElement(By.partialLinkText("Add"));
        */

        WebElement signout = driver.findElement(By.linkText("Sign out"));
        Assert.assertTrue(signout.isDisplayed());

        // Find the number of total link on the page--> number of link=number of a tag
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));//returns all elements whose tags a
        int numberOfLinks = allLinks.size();
        System.out.println("Number of Links: " + numberOfLinks);
        // sign out from the page
        driver.findElement(By.linkText("Sign out")).click();

        //after sign out we must do verification to make sure you signed out successfully.
     boolean isSignedOut=driver.getCurrentUrl().equals("http://a.testaddressbook.com/sign_in");
      Assert.assertTrue(isSignedOut);

         // sign out from the page
         //2.way:
        WebElement signinButton=driver.findElement(By.name("commit"));
       Assert.assertTrue(signinButton.isDisplayed());

       driver.close();

    }


}
