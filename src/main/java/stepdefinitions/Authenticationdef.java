package stepdefinitions;

import com.jayway.jsonpath.JsonPath;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class Authenticationdef {
    
    @Given("a registered user with the email \"(.*)\" and password \"(.*)\"$")
    public void loginintoApp(String userName, String password){
        System.out.println(userName);
        System.out.println(password);
    }

    @When("the user enters the credentials and clicks on the login")
    public void theUserEntersTheCredentialsAndClicksOnTheLogin() {
        System.out.println("step2");
    }

    @Then("the system should authenticate the user")
    public void theSystemShouldAuthenticateTheUser() {
        System.out.println("step3");
    }


    @Given("I have a product \"(.*)\" with quantity \"(.*)\" to the cart$")
    public void addProduct(String product, String quantity){
        System.out.println("Product is "+product);
        System.out.println("Quantity selected is "+quantity);
    }

    @Then("the product is added successfully")
    public void theProductIsAddedSuccessfully() {
        System.out.println("Product added successfully");
    }

    @Given("the user is on the landing page")
    public void theUserIsOnTheLandingPage(DataTable userCreds) {
        List<List<String>>data=userCreds.asLists();
        System.out.println(data.get(0).get(0));
        System.out.println(data.get(0).get(1));
        System.out.println(data.get(1).get(0));
        System.out.println(data.get(1).get(1));
    }

    @Given("the user entered the creds")
    public void theUserlogin(DataTable usercredentials){
        List<Map<String,String>> data=usercredentials.asMaps(String.class,String.class);
        System.out.println("Username is "+ data.get(0).get("username"));
        System.out.println("Username is "+ data.get(0).get("password"));
        System.out.println("Username is "+ data.get(1).get("username"));
        System.out.println("Username is "+ data.get(1).get("password"));
    }

    @Given("I have the below test data")
    public void jsondata(String jsonData){

        String name=JsonPath.parse(jsonData).read("$.users[1].name");
        System.out.println(name);
    }

    @Given("this is background step")
    public void initialStep() {
        System.out.println("Background step");
    }


}
