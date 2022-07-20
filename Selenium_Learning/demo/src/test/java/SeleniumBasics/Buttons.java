package SeleniumBasics;

import org.openqa.selenium.*;
import org.openqa.selenium.support.Color;

public class Buttons extends InvokeBrowser {
    
    public static void main(String[] args) {
        browser();
        driver.get("http://www.leafground.com/pages/Button.html");
        //getPosition();
        //getColor();
        getButtonSize();
        driver.quit();

    }

    public static void getButtonSize()
    {

        WebElement ele_size = driver.findElement(By.id("size"));
        System.out.println("Height of the element: "+ele_size.getSize().getHeight());
        System.out.println("width of the element: "+ele_size.getSize().getWidth());
    }

    public static void getColor()
    {
        WebElement ele_color = driver.findElement(By.id("color"));
        String rgba_color = ele_color.getCssValue("background-color");
        String hex_color = Color.fromString(rgba_color).asHex();
        System.out.println("Color : "+hex_color);


    }

    public static void getPosition()
    {
        
        WebElement ele_position = driver.findElement(By.id("position"));
        Point pnt_position = ele_position.getLocation();
        System.out.println("X position : "+pnt_position.getX());
        System.out.println("Y position : "+pnt_position.getY());

    }
}
