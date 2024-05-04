package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/cssSelector.php");

//        find the username text box
        WebElement inputBox = driver.findElement(By.cssSelector("input[id='profileID']"));
        inputBox.sendKeys("helo");
//        find the profile box
        WebElement profileBox = driver.findElement(By.cssSelector("input#profileBox"));
        profileBox.sendKeys("abracadabra");

//        feedback
        WebElement feedbackBox = driver.findElement(By.cssSelector("input.form-control.feedbackBox1"));
        feedbackBox.sendKeys("the website is too slow");


//        coursetopic
        WebElement courseTopic = driver.findElement(By.cssSelector("input[name*='contentInput']"));
        courseTopic.sendKeys("selenium");


//        /        introtoADVANCECSSS
        WebElement intro = driver.findElement(By.cssSelector("input[name^='IntroInput']"));
        intro.sendKeys("easy");

        //
        WebElement conclusion = driver.findElement(By.cssSelector("input[name$='Input']"));
        conclusion.sendKeys("welldone");

    }
}
