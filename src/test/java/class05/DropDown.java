package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");

//        find the element with the select tag
        WebElement DD = driver.findElement(By.xpath("//select[@id='select-demo']"));
//        select class
        Select sel=new Select(DD);
//        select by index
        sel.selectByIndex(3);
//for observation
        Thread.sleep(2000);
//        select by value
        sel.selectByValue("Sunday");

        Thread.sleep(3000);
//        select by visble text
        sel.selectByVisibleText("Monday");

//mutiple dd
        WebElement mutlipleDD = driver.findElement(By.xpath("//select[@id='multi-select']"));

//        Select class
        Select select1=new Select(mutlipleDD);

        select1.selectByValue("Florida");

        select1.selectByVisibleText("New York");

        select1.selectByIndex(0);

//        options in multiselect
        select1.deselectByIndex(0);

        System.out.println("the dropdown2 is multiselect " +select1.isMultiple());
        System.out.println("the dropdown 1 is multiselect "+ sel.isMultiple());

//        List<WebElement> allOptions = select1.getOptions();


    }
}
