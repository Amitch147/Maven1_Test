package Web_Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Input_WaitTest {
    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Dynamic Loading")).click();
//        Thread.sleep(10000);
        driver.findElement(By.linkText("Example 2: Element rendered after the fact")).click();
//        driver.findElement(By.xpath("//button[@value='start']")).click();
             driver.close();

    }

}
