package com.MyFirstProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day04_CheckBox {
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
       driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/checkboxes");


    }
    @Test
    public void checkBox() throws InterruptedException {
        //go to https://the-internet.herokuapp.com/checkboxes

        //Locate the elements of chechbox
        WebElement checkbox1=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkbox2=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        // Then click on checkbox1 if box is not selected
        Thread.sleep(3000);
        if(!checkbox1.isSelected()) {
            checkbox1.click();
        }
        // then click on checkbox2 box is not selected
        if(!checkbox2.isSelected()) {
            checkbox2.click();
        }
        Thread.sleep(3000);
        // homewor: Then verify that checkbox1 is checked

        //go to https://the-internet.herokuapp.com/checkboxes

        //Locate the elements of chechbox
        // Then click on checkbox1 if box is not selected
        // then click on checkbox2 box is not selected
        // homework: Then verify that checkbox1 is checked
        Assert.assertTrue(checkbox1.isSelected());
    }


    @After
    public void tearDown() {
      driver.quit();
    }



}
