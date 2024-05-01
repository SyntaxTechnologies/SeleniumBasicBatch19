package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com/");

//        goto the url
        driver.navigate().to("https://www.facebook.com");
//        slow down the code
        Thread.sleep(2000);
//        go to google .com back
        driver.navigate().back();

//        slow down the code
        Thread.sleep(2000);

//        go forward to fb
        driver.navigate().forward();
//        slow down the code
        Thread.sleep(2000);
//        refresh
        driver.navigate().refresh();
//        slow down the code
        Thread.sleep(2000);
//        close the browser
        driver.close();


    }
}
