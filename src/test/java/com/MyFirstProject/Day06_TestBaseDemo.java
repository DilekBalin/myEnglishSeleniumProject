package com.MyFirstProject;

import com.MyFirstProject.utilities.TestBase;
import org.junit.Test;

public class Day06_TestBaseDemo extends TestBase {

    @Test
    public void test01() {
        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle());
    }

    @Test
    public void test02() {
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
    }
}
