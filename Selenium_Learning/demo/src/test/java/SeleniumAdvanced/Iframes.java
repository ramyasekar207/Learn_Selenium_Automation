package SeleniumAdvanced;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.assertj.core.api.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import SeleniumBasics.*;

public class Iframes extends InvokeBrowser{
    static WebDriver driver;
    public static void main(String[] args) {
        driver = browser();
        driver.get("http://www.leafground.com/pages/frame.html");
        //frame();
        frameCount();
    }

    public static void frameCount()
    {  
      List<WebElement> frame_count = driver.findElements(By.tagName("iframe"));
      int count = frame_count.size();
      for(int i =0; i<=count; i++)
      {
        driver.switchTo().frame(i);
        List<WebElement> innerframe_count = driver.findElements(By.tagName("iframe"));
        if(innerframe_count.size()>0)
        {
          for(int j =0; j < innerframe_count.size(); j++)
          {
          driver.switchTo().frame(j);
          }
          driver.switchTo().parentFrame();
        }
        
        driver.switchTo().defaultContent();
        count = count + innerframe_count.size();

      }
      System.out.println(count);

      
    }

    public static void frame()
    {   
      driver.switchTo().frame(0);
      WebElement button= driver.findElement(By.id("Click"));
      button.click();
      org.testng.Assert.assertTrue(button.getText().equalsIgnoreCase("Hurray! You Clicked Me."));
      System.out.println(button.getText());
      driver.switchTo().defaultContent();
    
    }
    
    
    
}
