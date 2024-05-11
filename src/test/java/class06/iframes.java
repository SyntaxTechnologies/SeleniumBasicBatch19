package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iframes {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/handle-iframe.php");


        driver.switchTo().frame(0);

        WebElement input = driver.findElement(By.xpath("//input[@name='Topic']"));
        input.sendKeys("abracadabra willy");


        driver.switchTo().defaultContent();

        driver.switchTo().frame("dropdownIframe");

        WebElement dropdown = driver.findElement(By.xpath("//select[@id='animals']"));

        Select sel=new Select(dropdown);
        sel.selectByIndex(2);

//        switch to main window
        driver.switchTo().defaultContent();
//        switch to the main 0 frame in which nested frame is present
        driver.switchTo().frame(0);

//finding the frame as a webelement
        WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='checkboxIframe']"));
        driver.switchTo().frame(frame3);
//checkbox
        WebElement checkbox = driver.findElement(By.xpath("//input[@class='cb1-element']"));
        checkbox.click();




    }
}
