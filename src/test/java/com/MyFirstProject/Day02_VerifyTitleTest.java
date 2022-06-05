package com.MyFirstProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_VerifyTitleTest {
    //create a new class:   VerifyTitleTest
    //2. Navigate to google homepage
    //3. Verify if google title is "Google"

    public static void main(String[] args) {
        //create a new class:   VerifyTitleTest
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        //2. Navigate to google homepage
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        //3. Verify if google title is "Google"
        String actualTitle=driver.getTitle();
        String expectedTitle="Google";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
            System.out.println("Expected Title is: "+expectedTitle );
            System.out.println("Actual Title is: "+actualTitle );
        }



    }


}
