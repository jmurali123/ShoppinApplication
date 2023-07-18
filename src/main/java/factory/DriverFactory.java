package factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Arrays;

public class DriverFactory {

    public static WebDriver initializeDriver(String browser){
        WebDriver driver=null;
        switch (browser){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("start-maximized");
                options.addArguments("--remote-allow-origins=*");
                options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));

                driver= new ChromeDriver(options);
             //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                break;
            default:
                System.out.println("Invalid browser name and please enter valid browser");
        }

       return driver;
    }
}
