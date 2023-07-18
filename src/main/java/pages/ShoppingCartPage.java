package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

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

}
