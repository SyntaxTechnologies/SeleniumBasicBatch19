package review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class windowHandles {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AaSxoQy4kLcUiWijJfCQzeB8s0Q3dSPHEksxxa7gW0_XR5Q7dFlndbXsquT2WHbojUDuIT7y7VgPvQ&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-1072932938%3A1715445066972666&ddm=0");


//help
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
//privacy
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));

//        click on help and privacy btn
        helpBtn.click();
        privacyBtn.click();


//        get the handle of the main page
        String mainPageHandle = driver.getWindowHandle();
        System.out.println(mainPageHandle);


        Set<String> allHandles = driver.getWindowHandles();
//        print all the handles along with the title of the page
        for(String handle:allHandles){
            driver.switchTo().window(handle);
            System.out.println("the window handle is "+handle);
            System.out.println("the title of the page is "+driver.getTitle());
        }

    }
}
