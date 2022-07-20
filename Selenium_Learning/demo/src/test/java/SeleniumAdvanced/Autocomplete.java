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

public class Autocomplete extends InvokeBrowser {
  static WebDriver driver;

  public static void main(String[] args) {
    driver = browser();
    driver.get("http://www.leafground.com/pages/autoComplete.html");
    autoComplete();

  }
  public static void autoComplete_Actions() {

    try {
      Actions action = new Actions(driver);
      WebElement input = driver.findElement(By.id("tags"));
      input.sendKeys("s");
      Thread.sleep(1000);
      List<WebElement> list = driver.findElements(By.xpath("//*[@id='ui-id-1']/li/div"));
      for (int i = 1; i < list.size(); i++) {
        WebElement text = driver.findElement(By.xpath("//*[@id='ui-id-1']/li[" + i + "]/div"));
        if (text.getText().equalsIgnoreCase("Selenium")) {
          
        }

      }
    } catch (InterruptedException e) {
      
      e.printStackTrace();
    }

  }

  public static void autoComplete() {

    try {
      WebElement input = driver.findElement(By.id("tags"));
      input.sendKeys("s");
      Thread.sleep(1000);
      List<WebElement> list = driver.findElements(By.xpath("//*[@id='ui-id-1']/li/div"));
      for (int i = 1; i < list.size(); i++) {
        WebElement text = driver.findElement(By.xpath("//*[@id='ui-id-1']/li[" + i + "]/div"));
        if (text.getText().equalsIgnoreCase("Selenium")) {
          text.click();
        }

      }
    } catch (InterruptedException e) {
      
      e.printStackTrace();
    }

  }

}
