package Web_Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {
    public static void main (String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("file:///C:/Users/amitc/Downloads/SimpleAlert.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/fieldset/button")).click();
        Thread.sleep(3000);
        System.out.println(driver.switchTo().alert().getText());
//        driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();

        Thread.sleep(2000);
        driver.close();
    }
}
