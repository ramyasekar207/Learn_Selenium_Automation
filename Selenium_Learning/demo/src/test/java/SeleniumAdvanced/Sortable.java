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

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import SeleniumBasics.*;

public class Sortable extends InvokeBrowser {
  static WebDriver driver;

  public static void main(String[] args)  {
    driver = browser();
    driver.get("http://www.leafground.com/pages/sortable.html");
    try {
      sortAllItems();
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

  public static void sortAllItems() throws InterruptedException {
    List<WebElement> items = driver.findElements(By.xpath("//*[@id='sortable']/li"));
    Actions action = new Actions(driver);

    for (int i = 1; i <= items.size(); i++) {
      WebElement item_Drag = driver.findElement(By.xpath("//*[@id='sortable']/li[text()='Item " + i + "']"));
      WebElement item_Drop = driver.findElement(By.xpath("//*[@id='sortable']/li[text()='Item " +items.size()+ "']"));
      action.clickAndHold(item_Drag).dragAndDrop(item_Drag, item_Drop).build().perform();
      Thread.sleep(1000);
     
      // item.click();
    }
  }

  

}
