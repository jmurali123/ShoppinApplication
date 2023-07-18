package hooks;

import context.DriverContext;
import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class BeforeAfterHook {
    private WebDriver driver;

    private final DriverContext context;
    public BeforeAfterHook(DriverContext context){
      this.context=context;
    }

    @Before
    public void before(){
        driver= DriverFactory.initializeDriver(System.getProperty("browser","chrome"));
        context.driver=driver;
    }

    @After
    public void after(){
        driver.quit();
    }

    @AfterStep
    public void addScreenshot(Scenario scenario){
        if(scenario.isFailed()){
          final byte[] screenshot  =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
          scenario.attach(screenshot,"image/png","image");
        }
    }
}
