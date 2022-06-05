package com.MyFirstProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day03_WebDriverManager {
    //verify the Google title
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        //Calling chrome driver and setting it up
        WebDriverManager.chromedriver().setup();

        //Create chrome driver object
        WebDriver driver = new ChromeDriver();

        //maximize the window
        driver.manage().window().maximize();

        //go to Google homepage
        driver.get("https://www.google.com");

        //Assert the title
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";
        Assert.assertEquals(expectedTitle, actualTitle);
        driver.quit();

    }
}
