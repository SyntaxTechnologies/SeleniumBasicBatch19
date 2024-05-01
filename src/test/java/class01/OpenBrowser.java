package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
    public static void main(String[] args) throws InterruptedException {
// instance of chromeDriver
        WebDriver driver =new ChromeDriver();

//        open the chrome browser
//        and navigate to a url
        driver.get("https://www.facebook.com/");

//        maximize the window
        driver.manage().window().maximize();
//        enter full screen mode  i comment it cause i want to stay in maximize mode
//         driver.manage().window().fullscreen();

//get the title of the webpage
        String title = driver.getTitle();
        System.out.println("the title of the webpage is "+title);
//        just for observation  delete after u are sure
        Thread.sleep(4000);

        driver.quit();

    }
}
