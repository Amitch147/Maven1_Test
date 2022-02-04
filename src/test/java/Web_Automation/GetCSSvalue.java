package Web_Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCSSvalue {
    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
         String CssValue = driver.findElement(By.xpath("//input[@value='Login']")).getCssValue("color");
        System.out.println(CssValue);

        Thread.sleep(1000);
        driver.close();
    }
}
