package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage{

  //  @FindBy(css="a.ico-login")
  //  private WebElement loginLink;
    @FindBy(how= How.CSS, using="a.ico-login")
    private WebElement loginLink;

  //  @FindBy(id = "foobar") WebElement foobar;
  //  @FindBy(how = How.ID, using = "foobar") WebElement foobar;

    @FindBy(css="input#Email")
    private WebElement emailText;

    @FindBy(css="input#Password")
    private WebElement passwordText;

    @FindBy(css="input.login-button")
    private WebElement loginButton;

    public LoginPage(WebDriver driver){
        super(driver);
    }

    public void login(String email, String password){

        wait.until(ExpectedConditions.visibilityOf(loginLink));
        wait.until(ExpectedConditions.elementToBeClickable(loginLink)).click();
        wait.until(ExpectedConditions.visibilityOf(emailText)).sendKeys(email);
        wait.until(ExpectedConditions.visibilityOf(passwordText)).sendKeys(password);
        wait.until(ExpectedConditions.visibilityOf(loginButton));
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }
}
