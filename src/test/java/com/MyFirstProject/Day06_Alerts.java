package com.MyFirstProject;

import com.MyFirstProject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Day06_Alerts extends TestBase {
    //https://the-internet.herokuapp.com/javascript_alerts
    //acceptAlert()--> click on the first alert
    //verify the text " I am a JS Alert",
    //click OK,
    //and verify "You seccessfully clicked an alert",


    //dismissAlert()--> click on the second alert,
    //verify the text " I am a JS Confirm",
//click cancel
    //and verify "You clicked:Cancel"
    //
    //SendKeysAlert()>> click on the third alert,
    //verify text "I am a JS prompt", type "Hello World",
    //Click ok,
    //verify "You entered:Hello World"
    @Test
    public void acceptAlert() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        //acceptAlert()--> click on the first alert
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Thread.sleep(3000);

        //verify the text " I am a JS Alert",
        String actualAlertText = driver.switchTo().alert().getText();
        String expectedAlertText = "I am a JS Alert";
        Assert.assertEquals(expectedAlertText, actualAlertText);


        //click OK,
        driver.switchTo().alert().accept();
        //and verify "You successfully clicked an alert",

        String actualResult = driver.findElement(By.xpath("//p[@id='result']")).getText();
        String expectedResult = "You successfully clicked an alert";
        Assert.assertEquals(expectedResult, actualResult);


    }
    @Test
    public void dismissAlert() {
         //dismissAlert()--> click on the second alert,
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();

        //verify the text "I am a JS Alert",
       String actualTextSecond= driver.switchTo().alert().getText();
       String expectTextSecond="I am a JS Confirm";
       Assert.assertEquals(actualTextSecond, expectTextSecond);
        //click cancel
        driver.switchTo().alert().dismiss();
        //and verify "You clicked: Cancel"

    String actualResul2=driver.findElement(By.xpath("//p[@id='result']")).getText();
    String expectedResult2="You clicked: Cancel";
    Assert.assertEquals(expectedResult2,actualResul2);


    }

    @Test
    public void sendKeysAlert() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
       //SendKeysAlert()>> click on the third alert,
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        //verify text "I am a JS prompt",
        String actualText3=driver.switchTo().alert().getText();
        String expectedText3="I am a JS prompt";
        Assert.assertEquals(expectedText3,actualText3);
      //  type "Hello World",
        driver.switchTo().alert().sendKeys("Hello world");
        Thread.sleep(3000);
        //Click ok,

        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        //verify "You entered:Hello World"
        String actualResultFinal=driver.findElement(By.xpath("//p[@id='result']")).getText();
        String expectedResultFinal="You entered: Hello world";
        Assert.assertEquals(expectedResultFinal,actualResultFinal);
    }
}
