package SeleniumAdvanced;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SeleniumBasics.*;

public class DragDrop extends InvokeBrowser{
    static WebDriver driver;
    public static void main(String[] args) {
        driver = browser();
        Actions action = new Actions(driver);
        //draggable();      
       // droppable();
       anotherWay();
    }

    public static void anotherWay()
    {
      driver.get("http://www.leafground.com/pages/drop.html");
      WebElement drag = driver.findElement(By.id("draggable"));
      WebElement drop = driver.findElement(By.id("droppable"));
      Actions action = new Actions(driver);
      action.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();

    }
    public static void droppable()
    {
      driver.get("http://www.leafground.com/pages/drop.html");
      WebElement drag = driver.findElement(By.id("draggable"));
      WebElement drop = driver.findElement(By.id("droppable"));
      Actions action = new Actions(driver);
      action.dragAndDrop(drag,drop).build().perform();
    }

    public static void draggable()
    {
      driver.get("http://www.leafground.com/pages/drag.html");
      WebElement drag = driver.findElement(By.xpath("//p[text()='Drag me around']"));
      Actions action = new Actions(driver);
      action.dragAndDropBy(drag, 50, 50).build().perform();
    }
   

}
