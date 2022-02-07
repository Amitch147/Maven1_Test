package Web_Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
    public static void main (String args[]) throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        Properties prop = new Properties();
        FileInputStream fl = new FileInputStream("C:\\Users\\amitc\\IdeaProjects\\Maven1_Test\\TestData.properties");
        prop.load(fl);

        System.out.println(prop.getProperty("url"));
       String vURL;
        vURL = prop.getProperty("url");
        String vUsername;
        vUsername = prop.getProperty("username");
        driver.get(vURL);
      driver.findElement(By.name("email")).sendKeys(vUsername);

      Thread.sleep(2000);
        System.out.println("Test CAse passed");
        driver.close();

    }
}
