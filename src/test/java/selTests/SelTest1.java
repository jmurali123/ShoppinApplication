package selTests;

import factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SelTest1 {

    public static void main(String args[]){
        WebDriver driver= DriverFactory.initializeDriver("chrome");
      /*  driver.get("http://google.com");
        System.out.println("Title of the page: "+driver.getTitle());
        driver.navigate().to("http://facebook.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh(); */
        driver.get("http://demowebshop.tricentis.com");
//        driver.findElement(By.cssSelector(".ico-login")).click();
//       driver.findElement(By.cssSelector(".email")).sendKeys("planittest78@gmail.com");
//      driver.findElement(By.cssSelector(".password")).sendKeys("123456");
//     driver.findElement(By.cssSelector(".login-button")).click();

              new Actions(driver).sendKeys(driver.findElement(By.cssSelector(".email")),"planittest78@gmail.com")
                        .sendKeys(driver.findElement(By.cssSelector(".email")),"123456")
                                .click(driver.findElement(By.cssSelector(".login-button")))
                                       .perform();
        driver.close();
    }
}
