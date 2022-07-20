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

public class Images extends InvokeBrowser {
  static WebDriver driver;

  public static void main(String[] args) {
    driver = browser();
    driver.get("http://www.leafground.com/pages/Image.html");
    //clickImage();
    brokenImage();

  }
public static void brokenImage()
{
  WebElement brokenImage = driver.findElement(By.xpath("//label[contains(text(),'Broken Image')]/../img"));
  if(brokenImage.getAttribute("naturalWidth").equals("0"))
  {
    System.out.println("It is a Broken Image");
  }
  
}

  public static void clickImage() {
   WebElement ele = driver.findElement(By.xpath("//label[contains(text(),'image to go home page')]/../img"));
   ele.click();
   if(driver.getTitle().equalsIgnoreCase("TestLeaf - Selenium Playground"))
   {
     System.out.println("Image is clicked and moved to Home page");
   }

  }

}
