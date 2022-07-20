package Interview;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import SeleniumBasics.InvokeBrowser;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Ass extends InvokeBrowser {
    static WebDriver driver;
    @BeforeMethod
    public void setup()
    {
        // driver = browser();
        // driver.get("http://www.google.com");
        // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
          
    }
    @AfterMethod
    public void teraDown()
    {
        // driver.quit();
          
    }

    @Test
    public void dimension() throws IOException
    {
        driver.manage().window().getSize();
        System.out.println(driver.manage().window().getSize());

        driver.findElement(By.id("id")).getSize();
    
    }

    @Test 
    public void arrangeArrayValueToRight()
    {
        int[] t = { 2, 1, 0, 6, 0, 4, 5, 0, -1 };

        int[] count = new int[9];
        int c = 0;

        for (int i = 0; i < t.length; i++) {
            if (t[i] != 0) {
                count[c] = t[i];
                c++;

            }

        }
        System.out.println(Arrays.toString(count));

    }
    
    @Test 
    public void removeDuplicateValue_Array()
    {
        int[] arr1 = {1,1,2,2,3,3,1,4,5,5};
        int[] arr2 = new int[10];
        int count =0;
        for(int i=0; i< arr1.length;i++)
        {
          for(int j=1; j<arr1.length;j++)
          {
            if(arr1[i]!=arr1[j])
            {
arr2[count]=arr1[j];
            }
            else{
            arr2[count] = arr1[i];
            count++;}
          }
           
        }

    }
    
}
