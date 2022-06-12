package com.MyFirstProject;

import com.MyFirstProject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class Day07_Cookies extends TestBase {

    @Test
    public void cookies() {
        //go to amazon and automate the tasks:
        driver.get("https://www.amazon.com");
        //Find the total number of cookies
        Set<Cookie> allCookies = driver.manage().getCookies();
        int numberOfCookies = allCookies.size();
        System.out.println("Number of cookies: " + numberOfCookies);


        //Print all the cookies
        for (Cookie eachCokie : allCookies) {
            System.out.println("Each cookie: " + eachCokie);
            System.out.println("Each cookie naame: " + eachCokie.getName());
            System.out.println("Each cookie value: " + eachCokie.getValue());
        }
        //Get the cookies by their name
        System.out.println(driver.manage().getCookieNamed("ubid-maain"));
        //Add new cookie
        Cookie myCookie = new Cookie("My favorite cookie", "WhiteChocolate");
        driver.manage().addCookie(myCookie);
        //Check if cookie size increased
        System.out.println(driver.manage().getCookies().size());
        //Delete cookie by name
        driver.manage().deleteCookieNamed("session-id");
        //delete all of cookies
        driver.manage().deleteAllCookies();
        allCookies=  driver.manage().getCookies();
        System.out.println("Cookie number after delete all: "+allCookies.size());


    }
}
