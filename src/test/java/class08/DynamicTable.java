package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicTable {
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

//        click on the checkbox that has the id 73420676
        List<WebElement> ids = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
        for(int i=0;i<ids.size();i++){
            String id=ids.get(i).getText();
            if(id.equals("73420676")){
                System.out.println("the row number on which this id is located is "+(i+1));
//                click on the checkbox on that row
//                 find the checkbox on that row
                WebElement checkbox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+(i+1)+"]/td[1]"));
                checkbox.click();
            }
        }
    }
}
