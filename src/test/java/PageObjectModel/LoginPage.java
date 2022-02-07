package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public WebDriver driver;
    By username =By.name("email");
    By password = By.name("password");
    By loginButton =By.xpath("//input[@value='Login']");

    public LoginPage(WebDriver driver)
    {
        this.driver =driver;

    }
    public  void EnterUserName(String uNamevalue)
    {
        driver.findElement(username).sendKeys(uNamevalue);
    }
    public void EnterPassword(String upassword)
    {
        driver.findElement(password).sendKeys(upassword);
    }

    public void LoginButton()
    {
        driver.findElement(loginButton).click();
    }
}
