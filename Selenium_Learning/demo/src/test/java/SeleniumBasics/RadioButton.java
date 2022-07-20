package SeleniumBasics;



import java.util.List;

import org.openqa.selenium.*;
import org.openxml4j.samples.opc.ListAllParts;


public class RadioButton extends InvokeBrowser {
    public static void main(String[] args) {
        browser();
        driver.get("http://www.leafground.com/pages/radio.html");
        //radioButton("no");
        defaultRadiobutton();
        driver.quit();
    }

public static void defaultRadiobutton() {
    List<WebElement> Lst_radio =  driver.findElements(By.xpath("//label[contains(text(),'Find default selected radio button')]//following::input[@name='news']"));
    
    for (WebElement ele : Lst_radio) {
        if(ele.isSelected())
        {
            System.out.println("Default value is : "+ele.findElement(By.xpath("./..")).getText());
        }
    }
}

    public static void radioButton(String value) {
        WebElement ele_radio = driver.findElement(By.xpath("//input[@type='radio' and @id = '"+value+"']"));
        ele_radio.click();
        
    }

    

}
