package com.MyFirstProject;

import com.MyFirstProject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.sql.Driver;

public class Day08_Actions1 extends TestBase {

    @Test
    public void contextClickTest() {
        //Given user is on the https://the-internet.herokuapp.com/context_menu
       driver.get("https://the-internet.herokuapp.com/context_menu");

        ///when use Right clicks on the box
        WebElement textBox= driver.findElement(By.xpath("//div[@id='hot-spot']"));
        Actions actions=new Actions(driver);
        actions.contextClick(textBox).perform();

        //Then verify the alert mesaage is "You selected a context menu"
      String alertText=  driver.switchTo().alert().getText();
      Assert.assertEquals("You selected a context menu",alertText);

        //Then accept teh alert
        driver.switchTo().alert().accept();
    }
}
