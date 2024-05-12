package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWait {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

//        implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://syntaxprojects.com/synchronization-waits.php");
//click the button and get the text
        WebElement button1 = driver.findElement(By.xpath("//button[@id='show_text_synchronize']"));
        button1.click();
        WebElement textElement1 = driver.findElement(By.xpath("//p[text()='Hello, this message appeared after you clicked the button']"));
        System.out.println(textElement1.getText());
//        click on the button 2 and select the option male

        WebElement button2 = driver.findElement(By.xpath("//button[@id='show_text_synchronize_02']"));
        button2.click();

        WebElement text2 = driver.findElement(By.xpath("//input[@value='Male']"));
        text2.click();


    }
}
