package class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
//
        driver.manage().window().maximize();
//        goto the syntax projects.com
        driver.get("https://syntaxprojects.com/simple_context_menu.php");
//  find the hover button
        WebElement hoverBtn = driver.findElement(By.xpath("//button[text()='Hover me!']"));

        Actions action=new Actions(driver);
        action.moveToElement(hoverBtn).perform();
//        observe the hover and click
        Thread.sleep(2000);

//        get the button right click
        WebElement rightClickBtn = driver.findElement(By.xpath("//button[text()='Right Click!']"));
        action.contextClick(rightClickBtn).perform();


//        dragable
        WebElement dragable = driver.findElement(By.id("draggable"));
        //        droplocation
        WebElement dropLoc = driver.findElement(By.id("droppable"));

        action.clickAndHold(dragable).moveToElement(dropLoc).release().build().perform();

//        action.dragAndDrop(dragable,dropLoc).perform();

    }
}
