package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class radioBtns {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
//
        WebElement maleRb = driver.findElement(By.xpath("//input[@value='Male' and @name='optradio']"));
        maleRb.click();

//        select from 3 options
        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@name='ageGroup']"));

//        iterate
        for(WebElement radioButton:radioButtons){
            String value = radioButton.getAttribute("value");
            if(value.equals("5 - 15")){
                radioButton.click();
                break;
            }
        }
    }
}
