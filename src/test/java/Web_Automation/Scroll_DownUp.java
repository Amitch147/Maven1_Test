package Web_Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_DownUp {
    public static void main (String argsd[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        driver.get("https://demo.opencart.com");
        driver.manage().window().maximize();
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.location ='https://www.google.co.in'");
        Thread.sleep(3000);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(3000);
        js.executeScript("window.scrollTo(document.body.scrollHeight,0)");

        System.out.println("Script execute sucessfully");

    }
}
