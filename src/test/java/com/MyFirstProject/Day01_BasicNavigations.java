package com.MyFirstProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_BasicNavigations {

    //create a new class under: BasicNavigation
    //Create main method
    //set Path
    //Create chrome driver
    //Maximize the window
    //open google home page https://www.google.com/.
    //on the same class ,navigate to amazon   home page https://www.amazon.com/
    //navigate back to google
    //navigate forward to amazon
    //refresh the page
    //close/quit the browser



    //create a new class under: BasicNavigation
    //Create main method
    public static void main(String[] args) {

        //set Path
System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        //Create chrome driver
        WebDriver driver=new ChromeDriver();
        //Maximize the window
        driver.manage().window().maximize();
        //open google home page https://www.google.com/.
        driver.get("https://www.google.com/.");
        //on the same class ,navigate to amazon   home page https://www.amazon.com/
        driver.navigate().to("http://www.amazon.com/");
        //navigate back to google
        driver.navigate().back();
        //navigate forward to amazon
        driver.navigate().forward();
        //refresh the page
        driver.navigate().refresh();
        //close/quit the browser
        driver.close();

    }

}
