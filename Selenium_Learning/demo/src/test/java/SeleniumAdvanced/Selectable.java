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

public class Selectable extends InvokeBrowser {
  static WebDriver driver;

  public static void main(String[] args) {
    driver = browser();
    driver.get("http://www.leafground.com/pages/selectable.html");
    
    //selectSingleItem();
    selectAllItems();
   
     
    
  }

  public static void selectAllItems()
  {
    List<WebElement> items = driver.findElements(By.xpath("//*[@id='selectable']/li"));
    Actions action = new Actions(driver);
    
    for(int i=1;i<=items.size();i++)
    {
    WebElement item = driver.findElement(By.xpath("//*[@id='selectable']/li["+i+"]"));
    action.clickAndHold(item).build().perform();
    //item.click();
  }
  }

  public static void selectSingleItem()
  {
    List<WebElement> items = driver.findElements(By.xpath("//*[@id='selectable']/li"));
    for (WebElement item : items) {
      
      item.click();
    }
  }

}
