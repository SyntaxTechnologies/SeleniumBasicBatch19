package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Explicitwait {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

//        implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://syntaxprojects.com/synchronization-explicit-wait.php");

//        click on the button  click me to display button
//        and then when the button appears up then click on the appeared  button

        WebElement buttonForDisp = driver.findElement(By.xpath("//button[@id='display_button']"));
        buttonForDisp.click();
//declare the explicit wait
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
//        implement the conditon
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Enabled']")));
        WebElement btn = driver.findElement(By.xpath("//button[text()='Enabled']"));
        btn.click();


//        click on the button alert and then wait for the alert to appear and manage it
        WebElement alertBtn = driver.findElement(By.xpath("//button[@id='show_alert']"));
        alertBtn.click();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();


//        find button click on it so button gets enabled and then click the enabled button
        WebElement buttonforEnable = driver.findElement(By.xpath("//button[@id='enable_button']"));
        buttonforEnable.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Button']")));
        WebElement enabledBtn = driver.findElement(By.xpath("//button[text()='Button']"));
        enabledBtn.click();


    }
}
