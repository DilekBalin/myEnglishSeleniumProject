package com.MyFirstProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_GetPageSource {

    // Test if amazon contains "Registry" on homepage


    public static void main(String[] args) {
        // Test if amazon contains "Registry" on homepage
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //navigate to amazon page
        driver.get("https://www.amazon.com");

        // Test if amazon contains "Registry" on homepage
        String pagesource = driver.getPageSource();
        System.out.println(pagesource);

        if (pagesource.contains("Registry")) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
        driver.quit();
    }
}
