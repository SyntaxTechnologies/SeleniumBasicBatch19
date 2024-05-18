package class10;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class takeScreenshots {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
//
        driver.manage().window().maximize();
//        goto hrms
        driver.get("https://syntaxprojects.com/simple_context_menu.php");

        TakesScreenshot ss=(TakesScreenshot) driver;

//        taking the ss
        File screenshot = ss.getScreenshotAs(OutputType.FILE);
//        save the screenshot
        FileUtils.copyFile(screenshot,new File("screenshot/mistakes.png"));

    }
}
