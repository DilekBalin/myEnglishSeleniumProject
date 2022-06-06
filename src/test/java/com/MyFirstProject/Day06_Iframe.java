package com.MyFirstProject;

import com.MyFirstProject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day06_Iframe extends TestBase {
    @Test
            public void testIfrmae() throws InterruptedException {
        //go to "https://the-internet.herokuapp.com/iframe"
        driver.get("https://the-internet.herokuapp.com/iframe");
        //verify the Bolded text contains "Editor";
     String boldedText=  driver.findElement(By.xpath("//h3")).getText();
   Assert.assertTrue(boldedText.contains("Editor"));

   //Locate the text box// the text box in the iframe

    /*1.Waay: by using index

      driver.switchTo().frame(0);
       Thread.sleep(3000);
       driver.findElement(By.xpath("//p")).clear();
              Thread.sleep(3000);

       */



        /*2.Way: by using id
         driver.switchTo().frame("mce_0_ifr");
                Thread.sleep(3000);
                 driver.findElement(By.xpath("//p")).clear();
                                 Thread.sleep(3000);

                 */
         //3.Way: WebElement
      WebElement iframe=  driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(iframe);
        Thread.sleep(3000);
      WebElement textBox=  driver.findElement(By.xpath("//p"));
      textBox.clear();


      //Type "This text box is inside the iframe"
        textBox.sendKeys("This text box is inside the iframe");

    //verify the text Elemental Selenium text is displayed on the page
//driver.switchTo().parentFrame();//get 1 upper level
driver.switchTo().defaultContent();// get us to default level
WebElement elementalSelenium=driver.findElement(By.linkText("Elemental Selenium"));
Assert.assertTrue(elementalSelenium.isDisplayed());

    }
    }

