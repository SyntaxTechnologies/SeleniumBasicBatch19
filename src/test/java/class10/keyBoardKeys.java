package class10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class keyBoardKeys {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
//
        driver.manage().window().maximize();
//        goto the syntax projects.com
        driver.get("https://syntaxprojects.com/keypress.php");

        WebElement inputKeys = driver.findElement(By.xpath("//input[@class='form-control']"));

        inputKeys.sendKeys(Keys.ENTER);
// for observation
        Thread.sleep(2000);
        inputKeys.sendKeys(Keys.END);
    }
}
