package PageObjectModel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01_verifyLoginFunc {

    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        LoginPage lg = new LoginPage(driver);
        driver.get("https://demo.opencart.com/index.php?route=account/login");

        lg.EnterUserName("Amit");
        lg.EnterPassword("qwerty");
        lg.LoginButton();
        Thread.sleep(2000);
        driver.close();
    }
}
