package SeleniumAdvanced;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SeleniumBasics.*;

public class Window extends InvokeBrowser{
    static WebDriver driver;
    public static void main(String[] args) {
        driver = browser();
        driver.get("http://www.leafground.com/pages/Window.html");
        WaitforWindows();
        //CountOpenWindows();
        // switchToChildWindow();
        // switchToParentWindow();
    }
    public static void WaitforWindows()
    {      
      driver.findElement(By.xpath("//button[@onclick='openWindowsWithWait();']")).click();
      driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
      Set<String> windows = driver.getWindowHandles();
      System.out.println(windows.size());
    
    }
    
    public static void CountOpenWindows()
    {      
      driver.findElement(By.xpath("//button[@onclick='openWindows()']")).click();
      Set<String> windows = driver.getWindowHandles();
      System.out.println(windows.size());
    
    }
    public static void switchToParentWindow()
    {
       String parentwindow = driver.getWindowHandle();
       driver.switchTo().window(parentwindow);
    }

    public static void switchToChildWindow()
    {
        driver.findElement(By.id("home")).click();
        Set<String> windows = driver.getWindowHandles();
        for (String child_Win : windows) {
            driver.switchTo().window(child_Win);
            
        }
    }

}
