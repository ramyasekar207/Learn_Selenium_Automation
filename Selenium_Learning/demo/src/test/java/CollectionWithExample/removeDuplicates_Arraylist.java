package CollectionWithExample;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.io.FileUtils;
import org.assertj.core.util.Arrays;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import SeleniumBasics.InvokeBrowser;

public class removeDuplicates_Arraylist extends InvokeBrowser   {
    static WebDriver driver;
    @BeforeMethod
    public void setup()
    {
        driver = browser();
        driver.get("http://www.leafground.com/pages/Link.html");
          
    }
    @AfterMethod
    public void teraDown()
    {
        driver.quit();
          
    }
  
    @Test
    public void test()  throws IOException
    {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> newlist = new ArrayList<>();
        for(int i=0;i<10; i++)
        {
            list.add(String.valueOf(i));
        }
        for(int i=0;i<3; i++)
        {
            list.add(String.valueOf(i));
        }
        System.out.println(list);
        //newlist.addAll(list);
        
        for(int i=0;i<13; i++)
        {
            
                for(int j=1;j<13;j++)      
                {
                if(newlist.contains(list.get(j)))
                {continue;}
                else
                newlist.add(list.get(j));
               

               
            }
           
        }
       System.out.println(newlist); 
       FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE), new File("C:\\Users\\ramya.s\\OneDrive\\Desktop\\Demo\\image.jpg"));
    }
      
            
    }
    



