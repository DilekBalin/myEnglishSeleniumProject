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
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Day05_DropDown {

    WebDriver driver;


    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get(" https://the-internet.herokuapp.com/dropdown");

    }

    @Test
    public void selectByIndexTest() throws InterruptedException {
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown']"));//locate dropdown
        Select select = new Select(dropDown);//select object created
        //Go to https://the-internet.herokuapp.com/dropdown

        //Cretae method selectByIndex
        //and Select Option 1 using index
        Thread.sleep(3000);

        select.selectByIndex(1);
        Thread.sleep(3000);
        select.selectByIndex(2);
        Thread.sleep(3000);
        select.selectByIndex(1);
    }

    //Cretae method selectByValueTest Select Option 2 by value
    @Test
    public void selectByValueTest() throws InterruptedException {
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select select = new Select(dropDown);
        select.selectByValue("2");
        Thread.sleep(3000);

        select.selectByValue("1");
        Thread.sleep(3000);
    }

    //Cretae method selectByVisibleText Select Option 1 value by visible text
    @Test
    public void selectByVisibleText() throws InterruptedException {
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select select = new Select(dropDown);
        select.selectByVisibleText("Option 1");
        Thread.sleep(3000);
        select.selectByVisibleText("Option 2");
        Thread.sleep(3000);


    }

    //Create method printAllTest Print all dropdown value
    @Test
    public void printAllTest() throws InterruptedException {
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select select = new Select(dropDown);
        List<WebElement> allOption = select.getOptions();
        for (WebElement each : allOption) {
            System.out.println(each.getText());
        }

        //Verify the dropdown has Option2 text
        boolean flag = false;
        for (WebElement each : allOption) {
            if (each.getText().equals("Option 2")) {
                flag = true;
            }
        }
        Assert.assertTrue(flag);//Pass when flag=true; this fails when
    }


    //Create method printFirstSelectedOptionTest Print first selected option
    @Test
    public void printFirstSelectedOptionTest() throws InterruptedException {
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select select = new Select(dropDown);
        System.out.println();
        System.out.println(select.getFirstSelectedOption().getText());

        //Find the size of the dropdown,Print "Expected Is Not Equal Actual" if there
        //are not 4 elements in the dropdown
    }
        @Test
        public void sizeTest() throws InterruptedException {
            WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown']"));
            Select select = new Select(dropDown);
            List<WebElement> allOption=select.getOptions();
            int numberOfDropDownOptions=allOption.size();
            Assert.assertEquals("Expected Is Not Equal Actual", numberOfDropDownOptions,3);
        }
        @After
            public void tearDown () {
                 driver.quit();
            }
        }
