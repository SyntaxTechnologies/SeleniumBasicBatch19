package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBoxes {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");

        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));

        for(WebElement checkBox:checkBoxes){
            String value = checkBox.getAttribute("value");

            if(value.equalsIgnoreCase("Option-2")){
                checkBox.click();
            }
        }
    }
}
