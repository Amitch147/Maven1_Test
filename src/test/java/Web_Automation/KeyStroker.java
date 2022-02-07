package Web_Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyStroker {
    public static void main (String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Inputs")).click();
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys(Keys.NUMPAD1);
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys(Keys.NUMPAD2);
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys(Keys.NUMPAD3);
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys(Keys.NUMPAD0);
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys(Keys.NUMPAD3);
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys(Keys.NUMPAD2);

        Thread.sleep(2000);
        driver.close();
    }

}
