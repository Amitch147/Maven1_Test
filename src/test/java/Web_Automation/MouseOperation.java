package Web_Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;


public class MouseOperation {
    public static void main (String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://sellglobal.ebay.in/seller-center/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
//        driver.manage().window().minimize();

        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.linkText("Getting Started"))).build().perform();
        act.moveToElement(driver.findElement(By.linkText("About Us"))).build().perform();
        act.moveToElement(driver.findElement(By.linkText("About Us"))).build().perform();
        act.moveToElement(driver.findElement(By.linkText("About Us"))).build().perform();

        System.out.println("execution completed");
    }
}
