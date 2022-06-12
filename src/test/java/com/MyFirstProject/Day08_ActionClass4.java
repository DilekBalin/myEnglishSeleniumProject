package com.MyFirstProject;

import com.MyFirstProject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Day08_ActionClass4 extends TestBase {
    @Test
    public void dragAndDropTest() {
        //Given user is on https://jqueryui.com/droppable/

        driver.get("https://jqueryui.com/droppable/");
        //And user moves the target element (Drop me to my target) in to destination(Drop here)
        WebElement iframe=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(iframe);
       // driver.switchTo().frame(0);---> same solution with the iframe  index(0) because there is just one iframe here
        WebElement dragMe=driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement dropped=driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions actions=new Actions(driver);
       actions.dragAndDrop(dragMe,dropped).perform();
    }
}
