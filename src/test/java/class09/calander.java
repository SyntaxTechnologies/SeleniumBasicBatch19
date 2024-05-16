package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class calander {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
//
        driver.manage().window().maximize();
//        goto the syntax projects.com
        driver.get("https://syntaxprojects.com/bootstrap-date-picker-demo.php");

//       click on the calander
        WebElement calander1 = driver.findElement(By.xpath("//input[@id='start_date']"));
        calander1.click();

        WebElement month = driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[2]"));
//        check if the month is august
        boolean found=false;
        while(!found) {
            if (month.getText().equals("August 2024")) {
                //click date
                List<WebElement> dates = driver.findElements(By.xpath("//table[@id='table-day']/tbody/tr/td"));
                  for(WebElement date:dates){
                      if(date.getText().equals("5")){
                          date.click();
                          break;
                      }
                  }
                  found=true;

            } else {
                WebElement nxtBtn = driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[3]"));
                nxtBtn.click();
            }
        }

    }
}
