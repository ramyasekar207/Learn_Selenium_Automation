package SeleniumAdvanced;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import com.google.common.base.Function;

import org.apache.commons.io.FileUtils;
import org.assertj.core.util.Arrays;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import SeleniumBasics.InvokeBrowser;

public class Wait extends InvokeBrowser   {
    static WebDriver driver;
    @BeforeMethod
    public void setup()
    {
        driver = browser();
        driver.get("http://www.leafground.com/pages/Link.html");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
          
    }
    @AfterMethod
    public void teraDown()
    {
        driver.quit();
          
    }

    @Test()
    public void dimension() throws IOException
    {
        //Window dimension
    driver.manage().window().getSize();
    System.out.println(driver.manage().window().getSize());
    
    //Webelement dimension
    driver.findElement(By.id("id")).getSize();
    }
  
    @Test(enabled =  false)
    public void test() throws IOException
    {
        //Explicit Wait
        WebDriverWait ex_wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        ex_wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("id"))));

        //Fluet Wait
        FluentWait<WebDriver> wait = new FluentWait <WebDriver>(driver)
        .withTimeout(Duration.ofSeconds(30))
        .pollingEvery(Duration.ofSeconds(30))
        .ignoring(Exception.class);

        wait.until(new Function<WebDriver, WebElement>() {
                @Override
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("xpathExpression"));
                
            }

    }); 
}

      
    @Test(enabled =  false)
    public void robot_Image() throws IOException
    {
    // Robot robot = new robot();
    // Dimesntion rec = new Rectangle(Toolkit.getDefaultTollkit().getScreendimension());
    // BufferedImage source = robot.CreateScreencapture(rec);
    // Imageio.write(source,"jpg", new File("C:\\Download\\image.jpg"));
    
    }
}
    



