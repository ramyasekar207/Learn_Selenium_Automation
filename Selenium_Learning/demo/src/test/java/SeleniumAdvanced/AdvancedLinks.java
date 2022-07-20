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

public class AdvancedLinks extends InvokeBrowser {
  static WebDriver driver;

  public static void main(String[] args) {
    driver = browser();
    driver.get("http://www.leafground.com/pages/Link.html");
    // goToHomePage();
    // find_URL_LinkWithoutClickIt();
    // brokenLink();
    //linkCount();
    anotherlinkwithSameName();

  }

  

  public static void anotherlinkwithSameName() {
    WebElement link = driver.findElement(By.xpath("//label[contains(text(),'same link name)')]/../a"));
    link.click();

    

  }

  public static void linkCount() {
    List<WebElement> links = driver.findElements(By.tagName("a"));

    System.out.println("Links available: " + links.size());

  }

  public static void brokenLink() {
    WebElement homePage = driver.findElement(By.xpath("//a[contains(text(),'broken')]"));
    homePage.click();
    if (driver.getTitle().equals("HTTP Status 404 – Not Found")) {
      System.out.println("BrokenLink");
      driver.navigate().back();

    }
  }

  public static void find_URL_LinkWithoutClickIt() {
    WebElement homePage = driver.findElement(By.xpath("//a[contains(text(),'supposed to go without clicking me')]"));

    System.out.println("The URL is : " + homePage.getAttribute("href"));

  }

  public static void goToHomePage() {
    WebElement homePage = driver.findElement(By.xpath("//a[text()='Go to Home Page']"));
    homePage.click();
    if (driver.getTitle().equals("TestLeaf - Selenium Playground")) {
      System.out.println("We are in Home page");
      driver.navigate().back();
    }

  }

}
