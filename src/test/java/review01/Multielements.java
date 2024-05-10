package review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Multielements {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");

//        select all th radio buttons that have male as option
        List<WebElement> rbMale = driver.findElements(By.xpath("//input[@value='Male']"));
        for(WebElement rb:rbMale){
            rb.click();
        }
    }
}
