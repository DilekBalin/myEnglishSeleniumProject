package com.MyFirstProject;

import com.MyFirstProject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Set;

public class Day07_NewWindows extends TestBase {

    @Test
    public void windowHandlesWindows() throws Exception {
        //Given user is on the https://the-internet.herokuapp.com/windows
        driver.get("https://the-internet.herokuapp.com/windows");
        String window1Handle = driver.getWindowHandle();
        System.out.println(window1Handle);

        //Then user verifies the text:"Opening a new window"
        String window1 = driver.findElement(By.xpath("//*[text()='Opening a new window']")).getText();
        Assert.assertEquals("Opening a new window", window1);

        //   //Then user verifies the title of the page is "The Internet"
        Assert.assertEquals("The Internet", driver.getTitle());

        //When user clicks on the click "Click Here"
        driver.findElement(By.xpath("(//a[@target='_blank'])[1]")).click();

        //Then user verifies the window title is "New Window"
        Set<String> allWindowHandles = driver.getWindowHandles();
        driver.findElement(By.xpath("(//a[@target='_blank'])[1]"));
        for (String eachHandle : allWindowHandles
        ) {
            if (!eachHandle.equals(window1Handle)) {
                driver.switchTo().window(eachHandle);
            }
        }

        String window2Handle =driver.getWindowHandle();
        String window2Title = driver.getTitle();
        Assert.assertEquals("New Window", window2Title);

        //Then uer verifies the text is: "New Window"
        String window2Text=driver.findElement(By.xpath("//div[@class='example']//h3")).getText();
        Assert.assertEquals("New Window", window2Text);

        //when user goes back to previous window and then verifies the title:"The Internet"
        Thread.sleep(3000);
        driver.switchTo().window(window1Handle);
        Assert.assertEquals("The Internet",driver.getTitle());
        Thread.sleep(3000);

        driver.switchTo().window(window2Handle);
        Thread.sleep(3000);

        driver.switchTo().window(window1Handle);
        Thread.sleep(3000);

        driver.switchTo().window(window2Handle);
    }

}
