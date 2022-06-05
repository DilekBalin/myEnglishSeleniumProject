package com.MyFirstProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise {
    //Create a new class: Practise
    //Using ChromeDriver ,go to facebook and verify if page title is "facebook",if not print the correct title
    //Verify if the page URL contains facebook if not,print the right url
    //Then navigate to https://www.walmart.com/
    //verify if the walmart page title includes "Walmart.com"
    //Navigate back to facebook
    //refresh the page
    //maximize the window
    //close the browser

    public static void main(String[] args) {
        //Using ChromeDriver ,go to facebook and verify if page title is "facebook",if not print the correct title
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        String actualTitle = driver.getTitle();
        String expectedTitle = "facebook";
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
            System.out.println("Actula title is " + actualTitle);
            System.out.println("Expected title is " + expectedTitle);
            System.out.println("********");

        }

        //Verify if the page URL contains facebook if not,print the right url
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "facebook";
        if (actualUrl.contains(expectedUrl)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
            System.out.println("Actual url is " + actualUrl);
            System.out.println("Expected url is " + expectedUrl);
            System.out.println("********");
        }

        //Then navigate to https://www.walmart.com/

        driver.get("https://www.walmart.com/");
        //verify if the walmart page title includes "Walmart.com"
        String actualWalmarttitle = driver.getTitle();
        String expectedWalmartTitle = "Walmart.com";
        if (actualWalmarttitle.contains(expectedWalmartTitle)) {
            System.out.println("PASSED");

        } else {
            System.out.println("FAILED");
            System.out.println("Actual title is " + actualWalmarttitle);
            System.out.println("Expected title is " + expectedWalmartTitle);
            System.out.println("********");

        }
        //Navigate back to facebook
        driver.navigate().back();
        //refresh the page
        driver.navigate().refresh();
        //maximize the window
        driver.manage().window().maximize();
        //close the browser
        driver.quit();
    }
}

