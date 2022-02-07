package Web_Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShotCapture {

    public static void main (String args[]) throws IOException, InterruptedException {

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.googles.co.in");
            driver.manage().window().maximize();

            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src, new File("C:\\Users\\amitc\\OneDrive\\Desktop\\Google.png"));
            Thread.sleep(2000);
            System.out.println("Screernshot captured");
            driver.close();
        }
    }

