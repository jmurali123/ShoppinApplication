package stepdefinitions;

import context.DriverContext;
//import dev.failsafe.internal.util.Assert;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.PageFactoryManager;
import pages.ShoppingCartPage;
import org.junit.Assert;
import java.util.List;
import java.util.Map;

public class shoppingCartstepDefinition {
    private final ShoppingCartPage shoppingCartPage;

    public shoppingCartstepDefinition(DriverContext context){
        shoppingCartPage= PageFactoryManager.getShoppingCartPage(context.driver);
    }

    @When("I add a product with quantity to the cart")
    public void addProduct(DataTable productdetails){
        List<Map<String,String>> data=productdetails.asMaps(String.class,String.class);
        if(!(shoppingCartPage.getCartqty().equals("(0)"))){
            shoppingCartPage.navToShoppingCart();
            shoppingCartPage.clearCart();
            System.out.println(shoppingCartPage.getSummaryContent());
            Assert.assertEquals(shoppingCartPage.getSummaryContent(), "Your Shopping Cart is empty!");
        }

        shoppingCartPage.navToProductcategory();
        shoppingCartPage.selProduct(data.get(0).get("product"));
        shoppingCartPage.setQuantity(data.get(0).get("quantity"));
        shoppingCartPage.addToCart();
    }
    @Then("I should see successmsg")
    public void notificationVal(DataTable successMsgtbl){
        List<Map<String,String>> data=successMsgtbl.asMaps(String.class,String.class);
       Assert.assertEquals(shoppingCartPage.getNotificationmsg(),data.get(0).get("successMsg"));
    }
}
