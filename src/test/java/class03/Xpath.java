package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/Xpath.php");

//        to send the username in the text box
        WebElement userName = driver.findElement(By.xpath("//input[@id='title']"));
        userName.sendKeys("abracadabra");

//       /click the button
        WebElement button = driver.findElement(By.xpath("//button[text()='Click Here']"));
        button.click();

//        write the security question1
        WebElement sq1 = driver.findElement(By.xpath("//input[contains(@name,'securityPartial')]"));
        sq1.sendKeys("is ali from bacth14?");

//        get the text
        WebElement text = driver.findElement(By.xpath(" //label[contains(text(),'ipsum ')]"));
        System.out.println(text.getText());

//        pas api settings
        WebElement apiSettings = driver.findElement(By.xpath("//input[starts-with(@id,'apiSettings')]"));
        apiSettings.sendKeys("abracadraa 12344");

//        send email
        WebElement email = driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        email.sendKeys("hello@gmail.com");
//use of oeprators
        WebElement field2 = driver.findElement(By.xpath("//input[@data-detail='two' and @name='customField']"));
        field2.sendKeys("helloi am here");


    }
}
