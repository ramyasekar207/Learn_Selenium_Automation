package SeleniumBasics;

import java.util.ArrayList;
import java.util.List;

import com.google.inject.Key;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class AlertExample extends InvokeBrowser {
    public static void main(String[] args) {
        browser();
        driver.get("http://www.leafground.com/pages/Alert.html");
        //acceptAlert();
        //dismissAlert();
        alertSendKeys();
        driver.quit();
    }

    public static void alertSendKeys() {
        WebElement ele_alert = driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
        ele_alert.click();
        Alert alert = driver.switchTo().alert();
        
        alert.sendKeys("Ramya");
        alert.accept();
        
    }

    public static void dismissAlert() {
        WebElement ele_alert = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
        ele_alert.click();
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public static void acceptAlert() {
        WebElement ele_alert = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
        ele_alert.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

    }

}
