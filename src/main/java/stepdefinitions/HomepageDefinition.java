package stepdefinitions;

import context.DriverContext;
import io.cucumber.java.en.Given;
import pages.LoginPage;
import pages.PageFactoryManager;
import utils.ConfigLoader;
import utils.PropertyUtils;

public class HomepageDefinition {

    private final LoginPage loginPage;

    public HomepageDefinition(DriverContext context){
        loginPage= PageFactoryManager.getLoginPage(context.driver);
    }

    @Given("I'm an user on the Demo shopping application")
    public void enteringCredentials(){
        loginPage.load(ConfigLoader.getInstance().getUrl());
        loginPage.login(ConfigLoader.getInstance().getUsername(), ConfigLoader.getInstance().getPassword());
    }
}
