package review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

//        implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://syntaxprojects.com/synchronization-explicit-wait.php");

//      wait until the checkbox is clicked
        WebElement button = driver.findElement(By.xpath("//button[@id='checkbox_button']"));
        button.click();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@id='checkbox']")));

        WebElement checkBox = driver.findElement(By.xpath("//input[@id='checkbox']"));
        System.out.println(checkBox.isSelected());
    }
}
