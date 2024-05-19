package review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class tables {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
//
        driver.manage().window().maximize();
//        goto hrms
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
//        login
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");

        driver.findElement(By.id("btnLogin")).click();

//click on PIm option
        driver.findElement(By.id("menu_pim_viewPimModule")).click();

//        click on the checkbox for the person who has id 58949955

    boolean isfound=false;
    while(!isfound) {
            List<WebElement> allIds = driver.findElements(By.xpath(" //table[@id='resultTable']/tbody/tr/td[2]"));

            for (int i = 0; i < allIds.size(); i++) {
                String id = allIds.get(i).getText();
                if (id.equals("58949955")) {
                    System.out.println("the row number of the id is " + (i + 1));
//                row number is found
//                click on checkbox on row (i+1)
                    String xpath = "//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]";
                    WebElement checkbox = driver.findElement(By.xpath(xpath));
                    checkbox.click();
                    isfound=true;
                    break;
                }

            }
            if(!isfound) {
               WebElement nextBtn = driver.findElement(By.xpath("//a[text()='Next']"));
               nextBtn.click();
            }
    }



















    }
}
