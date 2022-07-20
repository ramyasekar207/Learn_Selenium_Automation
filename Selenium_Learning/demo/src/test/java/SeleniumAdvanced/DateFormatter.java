package SeleniumAdvanced;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import java.text.SimpleDateFormat;  
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


import SeleniumBasics.*;


public class DateFormatter extends InvokeBrowser {
  static WebDriver driver;

  @BeforeTest
  public void setup()
  {
    // driver = browser();
    // driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
  }

  @AfterTest
  public void tearDown()
  {
    // driver.quit();
  }
@Test
public void calendar_Handling()
{
// Date date = new Date();
// SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
// String f_date = formatter.format(date);
// System.out.println(f_date);

//LocalDate localDate = LocalDate.now();
Date date = new Date();
SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-YYYY hh:mm");
String f_date = formatter.format(date);
System.out.println(f_date);


}

}
