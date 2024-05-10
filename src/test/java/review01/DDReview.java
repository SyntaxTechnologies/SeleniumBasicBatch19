package review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DDReview {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo.php");

        WebElement DD = driver.findElement(By.xpath("//div[@data-toggle='dropdown']"));
        DD.click();

        List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));

        for(WebElement option:allOptions){
            String text = option.getText();
            if(text.equals("Greece")){
                option.click();
                break;
            }


        }



    }
}
