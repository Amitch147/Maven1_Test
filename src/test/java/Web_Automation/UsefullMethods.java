package Web_Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsefullMethods {
    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/login");    // naviagte to url
        driver.manage().window().maximize();
        Boolean bol = driver.findElement(By.name("email")).isDisplayed();    // value is displayed or not
        if(bol)
        {
            System.out.println("test case is passed and username is visible on the web page");
        }
        else
        {
            System.out.println("test case failed as username is not visible on tyhe web page");
        }
         Thread.sleep(1000);    // wait time
        driver.findElement(By.name("email")).sendKeys("Amit@qwe.com");                // send values
        String ActualValue = driver.findElement(By.name("email")).getAttribute("value");  // get attribute
        System.out.println(ActualValue);

        Thread.sleep(1000);
        driver.findElement(By.name("email")).clear();   // clear values

        Thread.sleep(2000);
        driver.close();     //close driver
    }
}
