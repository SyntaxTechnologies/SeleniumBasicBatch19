package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
goto fb.com
send your username
send your password
click on login button
 */
public class Locators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");
//        find the element email address and send email address to it
        WebElement email = driver.findElement(By.id("email"));
//        send text
        email.sendKeys("moazzamsadiq@gmail.com");

//        pass the password
        WebElement password = driver.findElement(By.name("pass"));
//        send text
        password.sendKeys("abracadbra");

//        find the button
        WebElement button = driver.findElement(By.name("login"));
//        click on the button
//        button.click();
/*
goto fb.com and click on create new account
 */
//using linktext
//        WebElement createAccount = driver.findElement(By.linkText("Create new account"));
//        createAccount.click();

//       using partial link text
        WebElement createAccount = driver.findElement(By.partialLinkText("account"));
        createAccount.click();
  Thread.sleep(2000);
        WebElement name = driver.findElement(By.xpath("//input[@name='firstname']"));
        name.sendKeys("asafdsfds");

    }
}
