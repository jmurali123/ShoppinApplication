package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.swing.*;
import java.util.List;

public class ShoppingCartPage extends BasePage {

    @FindBy(css="li#topcartlink>a")
    private WebElement shoppingCartLink;

    @FindBy(css="span.cart-qty")
    private WebElement cartQuantitySpan;

    @FindBy(css="[name='removefromcart']")
    private List<WebElement> removeCartitemsChxbxList;

    @FindBy(css="[name='updatecart']")
    private WebElement updateShoppingCartButton;

    @FindBy(css=".order-summary-content")
    private WebElement orderSummaryContentLabel;

    @FindBy(css="ul.top-menu>li:nth-child(2)>a")
    private WebElement computerLink;

    @FindBy(css="ul.top-menu>li:nth-child(2)>ul>li:nth-child(1)>a")
    private WebElement desktopLink;
    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public ShoppingCartPage clearCart(){
        List<WebElement> cartItems=wait.until(ExpectedConditions.visibilityOfAllElements(removeCartitemsChxbxList));
        for(WebElement chkele:cartItems){
            wait.until(ExpectedConditions.elementToBeClickable(chkele)).click();
        }
        wait.until(ExpectedConditions.elementToBeClickable(updateShoppingCartButton)).click();
        return this;
    }

    public String getCartqty(){
        return wait.until(ExpectedConditions.visibilityOf(cartQuantitySpan)).getText();
    }

    public  void navToShoppingCart(){
        wait.until(ExpectedConditions.visibilityOf(shoppingCartLink));
        wait.until(ExpectedConditions.elementToBeClickable(shoppingCartLink)).click();
    }

    public String getSummaryContent(){
        return wait.until(ExpectedConditions.visibilityOf(orderSummaryContentLabel)).getText();
    }

    public void navToProductcategory(){
        wait.until(ExpectedConditions.visibilityOf(computerLink));
        Actions act=new Actions(driver);
        act.moveToElement(computerLink);
        act.moveToElement(desktopLink);
        act.click().build().perform();
    }

    public void selProduct(String productName){
        String loc="img[alt='Picture of "+productName+"']";
        By prodImgButton= By.cssSelector(loc);
        WebElement e= wait.until(ExpectedConditions.elementToBeClickable(prodImgButton));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",e);
        e.click();
    }

}
