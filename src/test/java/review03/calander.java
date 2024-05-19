package review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

import static utils.CommonMethods.driver;

public class calander {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
//
        driver.manage().window().maximize();
//        goto hrms
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
//        login
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");

        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.id("menu_leave_viewLeaveModule")).click();

        driver.findElement(By.id("calFromDate")).click();

        WebElement monthDD = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select sel=new Select(monthDD);
        sel.selectByVisibleText("Aug");

        WebElement yearDd = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select sel2 =new Select(yearDd);
        sel2.selectByValue("2000");


        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for(WebElement date:allDates){
            String dateValue = date.getText();
            if(dateValue.equals("15")){
                date.click();
                break;
            }
        }


    }
}
