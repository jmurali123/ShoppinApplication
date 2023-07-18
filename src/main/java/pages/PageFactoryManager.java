package pages;

import org.openqa.selenium.WebDriver;

public class PageFactoryManager {
    private static LoginPage loginPage;
    private static ShoppingCartPage shoppingCartPage;

    public static LoginPage getLoginPage(WebDriver driver){
        return loginPage==null? new LoginPage(driver):loginPage;
    }

    public static ShoppingCartPage getShoppingCartPage(WebDriver driver){
        return shoppingCartPage==null? new ShoppingCartPage(driver):shoppingCartPage;
    }

}
