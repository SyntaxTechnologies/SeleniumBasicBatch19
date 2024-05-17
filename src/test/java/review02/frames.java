package review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/handle-iframe.php");


        WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='textfield-iframe']"));

        driver.switchTo().frame(frame1);
        driver.findElement(By.name("Topic")).sendKeys("barkat king");
    }
}
