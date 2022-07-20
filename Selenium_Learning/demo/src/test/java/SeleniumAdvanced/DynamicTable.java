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

public class DynamicTable extends InvokeBrowser {
  static WebDriver driver;

  public static void main(String[] args) {
    driver = browser();
    driver.get("http://www.leafground.com/pages/table.html");
    // coulmnCount();
    // rowCount();
    getValue("Learn XPath");

  }

  public static void getValue(String Name) {
    int row_Count = driver.findElements(By.xpath("//table/tbody/tr")).size();
    int column_Count = driver.findElements(By.xpath("//table/tbody/tr[1]/th")).size();

    for (int i = 2; i < row_Count + 1; i++) {
      WebElement learning = driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[1]"));
      String name = learning.getText();
      if (name.equalsIgnoreCase(Name)) {

        WebElement progress = driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[2]"));
        System.out.println("Progress value of " + progress.getText());

      }

    }
  }

  public static void rowCount() {
    List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr"));
    System.out.println("Row count: " + row.size());

  }

  public static void coulmnCount() {
    List<WebElement> column = driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
    System.out.println("Coulmn Count: " + column.size());

  }

}
