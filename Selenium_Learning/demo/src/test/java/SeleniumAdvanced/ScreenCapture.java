package SeleniumAdvanced;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.assertj.core.internal.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.*;


import SeleniumBasics.*;


public class ScreenCapture extends InvokeBrowser {
  static WebDriver driver;

  public static void main(String[] args)  {
    driver = browser();
    driver.get("https://www.softwaretestinghelp.com/take-screenshot-in-selenium/");
    //capture_VisibleScreen();
    robot_captureScreen();
      //capture_FullScreen();

      

  }

  public static void capture_VisibleScreen() {
    File ss_file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    try {
      FileUtils.copyFile(ss_file, new File("C:\\Users\\ramya.s\\Downloads\\visibleImage.jpg"));
    } catch (IOException e) {

      e.printStackTrace();
    }

  }

  //Using Robot Class - Capture the full screen image
  public static void robot_captureScreen() 
  {
    Robot robot;
    try {
      robot = new Robot();
      Rectangle rectangle = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
   BufferedImage IO = robot.createScreenCapture(rectangle);
   ImageIO.write(IO, "jpg", new File("C:\\Users\\ramya.s\\Downloads\\test.jpg"));
    } catch (AWTException e) {
      
      e.printStackTrace();
    }
   catch (IOException e) {
    
    e.printStackTrace();
  }

  }
/*
  public static void capture_FullScreen() {
    Screenshot ss = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
    try {
      ImageIO.write(ss.getImage(), "JPG", new File("C:\\Users\\ramya.s\\Downloads\\FullImage.jpg"));
    } catch (IOException e) {
        e.printStackTrace();
    }
    

  }*/

}
