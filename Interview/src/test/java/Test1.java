import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.browser.Browser;
import org.openqa.selenium.ie.ElementScrollBehavior;

public class Test1 {
    static WebDriver driver;

    public static WebDriver browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.co.in");
        return driver;
        

    }

    public static void main(String[] args)  {
       
        //browser();
        //System.out.println("Completed");
        // int[] array = {2,12,4,5,8,3,0,9,7,3,1,1,5,11,13,15,6,2,5,21,10};
//         HashMap<Integer, Integer> map = new HashMap<Integer, Integer>() ;
//          int count= 0;
        
//         for(int i=0; i<array.length; i++)
//         {
//             for(int j=1; j<array.length ; j++)
//             {
//                 count = array[i]+array[j];
//                 if(count==12)
//                 {
//                     map.put(array[i], array[j]);
//                     System.out.println(map.entrySet());
//                 }
//             }
//         }


// System.out.println();

//Create two array lists of Strings. each array list should contain 10 strings compare both the array list and create a third array list with unique strings of the 2 array lists




    }

}
