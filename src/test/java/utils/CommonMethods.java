package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class CommonMethods {

    public static  WebDriver driver;
    public static void openBrowserAndLaunchApplication() throws IOException {

        switch (ConfigReader.read("browser")){
            case "Chrome":
                driver=new ChromeDriver();
                break;
            case "FireFox":
                driver=new FirefoxDriver();
                break;
            case "Edge":
                driver=new EdgeDriver();
                break;
            default:
                throw new RuntimeException("Invalid Browser Name");
        }
        driver.manage().window().maximize();
        driver.get(ConfigReader.read("url"));
    }

    public static void closeBrowser(){
        if(driver!=null){
        driver.quit();
        }
    }

    public  static  void selectFromDropDown(WebElement dropDown,int index){
        Select sel=new Select(dropDown);
        sel.selectByIndex(index);
    }
    public  static  void selectFromDropDown(WebElement dropDown,String visibleText){
        Select sel=new Select(dropDown);
        sel.selectByVisibleText(visibleText);
    }

    public  static  void selectFromDropDown(String value, WebElement dropDown){
        Select sel=new Select(dropDown);
        sel.selectByValue(value);
    }



}
