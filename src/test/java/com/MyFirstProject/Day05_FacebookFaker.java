package com.MyFirstProject;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Day05_FacebookFaker {
    Faker faker = new Faker();

    //Go to https://www.facebook.com
    //click on Create and Account button
    //Locate the elements of radio buttons
    //Then click on the radio buttons for your gender if they are not selected
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.facebook.com");


    }

    @Test
    public void radioButton() {


        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//button[@data-cookiebanner='accept_button']")).click();
        driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(faker.name().firstName() + Keys.ENTER);
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(faker.name().lastName() + Keys.ENTER);
        driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(faker.phoneNumber().cellPhone() + Keys.ENTER);
        driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys(faker.internet().password() + Keys.ENTER);
        driver.findElement(By.xpath("//input[@name='birthday_age']")).sendKeys("26" + Keys.ENTER);
        WebElement femaleButton = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
        if (!femaleButton.isSelected()) {
            femaleButton.click();
        }
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
