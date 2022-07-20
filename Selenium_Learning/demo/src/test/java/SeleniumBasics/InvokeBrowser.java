package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.browser.Browser;

import ch.qos.logback.core.util.Duration;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

public class InvokeBrowser  {
    static WebDriver driver;
    public static void main(String[] args) {
        browser();
        //googleSearch();
        hyperlink();
        driver.quit();
       
    }

    

    public static void hyperlink()
    {
        driver.get("http://www.leafground.com/pages/Link.html");
        driver.findElement(By.linkText("Verify am I broken?")).click();
        if(driver.getTitle().equalsIgnoreCase("HTTP Status 404 – Not Found"))
        {
            System.out.println(driver.getTitle());
        }
    }

    public static void googleSearch()
    {
        driver.get("http://www.google.co.in");
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).sendKeys("Chennai");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        System.out.println("Entered chennai in search engine");

    }

    public static WebDriver browser()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
        return driver;
        
    }
}
       
    
