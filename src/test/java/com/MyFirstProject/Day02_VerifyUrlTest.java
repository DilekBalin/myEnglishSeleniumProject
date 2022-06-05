package com.MyFirstProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_VerifyUrlTest {


    //Create a new class: VerifyUrlTest
    //Navigate to google homepage
    // Verify if google homepage url is "https://www.gogle.com"


    public static void main(String[] args) {
        //Create a new class: VerifyUrlTest
        //Navigate to google homepage
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        //2. Navigate to google homepage
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        // Verify if google homepage url is "www.google.com"
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="www.google.com";
        if(actualUrl.equals(expectedUrl)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
            System.out.println("Actual Url is "+actualUrl);
            System.out.println("Expected Url is "+expectedUrl);

        }

    }

}
