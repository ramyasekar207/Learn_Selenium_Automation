package SeleniumBasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class Dropdown extends InvokeBrowser {
    public static void main(String[] args) {
        browser();
        driver.get("http://www.leafground.com/pages/Dropdown.html");
        // dd_selectByIndex();
        // dd_selectByValue();
        // dd_selectByVisibleText();
        //getdropdown_Count();
        //dd_SelectUsingSendKeys();
        dd_multiSelect();
        driver.quit();
    }

    public static void dd_multiSelect() {
    WebElement ele_dd = driver.findElement(By.xpath("//div[@class='example'][6]/select"));
       Select multiSelect = new Select(ele_dd);
       multiSelect.selectByVisibleText("Selenium");
       multiSelect.selectByVisibleText("Appium");


    }
    public static void dd_SelectUsingSendKeys() {
        WebElement ele_dd = driver.findElement(By.xpath("//div[@class='example'][5]/select"));
        ele_dd.sendKeys("Selenium");


    }



    // Retrive all the dropdown option and stored it in List<WebElement>
    public static void getdropdown_Count() {
        WebElement ele_dd = driver.findElement(By.className("dropdown"));
        Select dd_select = new Select(ele_dd);

        List<WebElement> dd_List = dd_select.getOptions();
        System.out.println("Size of List: " + dd_List.size());

    }

    public static void dd_selectByValue() {
        WebElement dd3 = driver.findElement(By.name("dropdown3"));
        Select dd3_select = new Select(dd3);
        dd3_select.selectByValue("1");
        System.out.println("Selected 1st Value");
        dd3_select.selectByValue("2");
        System.out.println("Selected 2nd Value");
        dd3_select.selectByValue("3");
        System.out.println("Selected 3rd Value");
    }

    public static void dd_selectByVisibleText() {
        WebElement dd2 = driver.findElement(By.name("dropdown2"));
        Select dd2_select = new Select(dd2);
        dd2_select.selectByVisibleText("Selenium");
        System.out.println("Selected Vy Visible text");
        dd2_select.selectByVisibleText("Appium");
        System.out.println("Selected Vy Visible text");
        dd2_select.selectByVisibleText("UFT/QTP");
        System.out.println("Selected Vy Visible text");

    }

    public static void dd_selectByIndex() {

        WebElement dd1 = driver.findElement(By.id("dropdown1"));
        Select dd1_select = new Select(dd1);
        dd1_select.selectByIndex(1);
        System.out.println("Dropdown Selected : Index 1");
        dd1_select.selectByIndex(2);
        System.out.println("Dropdown Selected : Index 2");
        dd1_select.selectByIndex(3);
        System.out.println("Dropdown Selected : Index 3");

    }
}
