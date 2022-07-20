package SeleniumAdvanced;

import java.io.File;
import java.rmi.server.RemoteObject;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import SeleniumBasics.*;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class DownloadFile extends InvokeBrowser {
  static WebDriver driver;

  public static void main(String[] args) {
    driver = browser();
    driver.get("http://www.leafground.com/pages/download.html");
    //downloadExcel();
    downloadPDF();

  }
  public static void downloadPDF()
    {
      try {
      WebElement pdfLink = driver.findElement(By.linkText("Download PDF"));
      pdfLink.click();
     
        Thread.sleep(2000);
        WebElement pdf = driver.findElement(By.id("download"));
        pdf.click();
        Thread.sleep(2000);

        StringSelection ss = new StringSelection("C:\\Users\\ramya.s\\Downloads");

        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        Robot robot;
       
          robot = new Robot();
      
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);





        File filepath = new File("C:\\Users\\ramya.s\\Downloads");
        File[] files = filepath.listFiles();
        for (File file : files) {
          if(file.getName().equalsIgnoreCase(""))
          {
            file.delete();
            System.out.println("PDF File Found");

          }
        }
      } 
      catch (InterruptedException e) {
        e.printStackTrace();
      }
      catch (AWTException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      

    }
  public static void downloadExcel() {
    //WebElement link = driver.findElement(By.xpath("//a[text()='Download Excel']"));
    WebElement link = driver.findElement(By.linkText("Download Excel"));
    link.click();
    try {
      Thread.sleep(3000);
      File filepath = new File("C:\\Users\\ramya.s\\Downloads");
      File[] allFiles = filepath.listFiles();
      for (File file : allFiles) {
        if(file.getName().equalsIgnoreCase("testleaf.xlsx"))
        {
          file.delete();
          System.out.println("Found File and delete it");
          break;
        }

      }
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
   

  }



}
