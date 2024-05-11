package class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");

        WebElement button1 = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        button1.click();
//        to observe
        Thread.sleep(2000);
//        switch the focus of the driver to alert
        Alert alert = driver.switchTo().alert();
        alert.accept();
//        .............................................
        WebElement button2 = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        button2.click();
        Thread.sleep(2000);
        alert.dismiss();
//        -----------------------------------
        WebElement button3 = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        button3.click();
        Thread.sleep(2000);
        alert.sendKeys("sunday morning");
        alert.accept();

    }
}
