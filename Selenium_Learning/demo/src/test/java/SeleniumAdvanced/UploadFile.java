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

public class UploadFile extends InvokeBrowser {
  static WebDriver driver;

  public static void main(String[] args) {
    driver = browser();
    driver.get("http://www.leafground.com/pages/upload.html");
    
    uploadFile();

  }
  public static void uploadFile()
    {
      try {
      WebElement test = driver.findElement(By.name("filename"));
      test.click();
     
        Thread.sleep(3000);
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





        // File filepath = new File("C:\\Users\\ramya.s\\Downloads");
        // File[] files = filepath.listFiles();
        // for (File file : files) {
        //   if(file.getName().equalsIgnoreCase(""))
        //   {
        //     file.delete();
        //     System.out.println("PDF File Found");

        //   }
        //}
      } 
      catch (InterruptedException e) {
        e.printStackTrace();
      }
      catch (AWTException e) {
        e.printStackTrace();
      }
      

    }
  



}
