package com.MyFirstProject;

import com.MyFirstProject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.WindowType;

public class Day07_NewTabs_Se14 extends TestBase {
    @Test
    public void newTabs() throws InterruptedException {

        //Open google on TAB1
        driver.get("https://www.google.com");
        String googleWindowHandle = driver.getWindowHandle();
        System.out.println("Google title: " + driver.getTitle());

        //Open amazon on TAB2
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.amazon.com");
        String amazonWindowHandle = driver.getWindowHandle();
        System.out.println("Amazon title: " + driver.getTitle());

        //Open Linkedin on TAB3
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.linkedin.com");
        String linkedinWindowHandle = driver.getWindowHandle();
        System.out.println("Linkedin title: " + driver.getTitle());

        //switch between windows//
        Thread.sleep(3000);
        driver.switchTo().window(amazonWindowHandle);
        System.out.println("AMAZON" + driver.getTitle());
        Thread.sleep(3000);
        driver.switchTo().window(googleWindowHandle);
        System.out.println("GOOGLE"+driver.getTitle()); Thread.sleep(3000);
        driver.switchTo().window(linkedinWindowHandle);
        System.out.println("LINKEDIN"+driver.getTitle());
    }
}
