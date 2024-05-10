package review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://facebook.com");

        WebElement createNewAccount = driver.findElement(By.linkText("Create new account"));
//        check if the button is enabled
        boolean stateOfBtn = createNewAccount.isEnabled();
        if(stateOfBtn){
            createNewAccount.click();
        }

        Thread.sleep(2000);
//        check if the input box is displayed and then send keys
        WebElement fName = driver.findElement(By.xpath("//input[@name='firstname']"));
        boolean displayStatus = fName.isDisplayed();
        if(displayStatus){
            fName.sendKeys("maria");
        }

//        get the text and print on teh console
        WebElement textSignUp = driver.findElement(By.xpath("//div[text()='Sign Up']"));
        System.out.println( textSignUp.getText());

//        select date
        WebElement dateDD = driver.findElement(By.xpath("//select[@id='day']"));

        Select sel=new Select(dateDD);
        sel.selectByValue("8");
//        check if the dropdown is multi select
        System.out.println(sel.isMultiple());


    }
}
