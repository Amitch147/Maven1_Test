package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageUsingPageFactory {

    @FindBy(name="email")
    WebElement username;

    @FindBy(name="password")
    WebElement pwd;

    @FindBy(xpath = "//input[@value='login']")
    WebElement Loginbutton;

    public void EnterUsername(String uname)
    {
        username.sendKeys(uname);
    }
    public void EnterPassword(String password)
    {
        pwd.sendKeys(password);
    }
    public void LoginButton1()
    {
        Loginbutton.click();
    }
}
