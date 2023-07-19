package selTests;

import factory.DriverFactory;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.*;
import utils.PropertyUtils;

import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.function.Function;

//import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class WebDriverTest {

    private WebDriver driver;


    @BeforeEach
    public void setUP(){
        driver= DriverFactory.initializeDriver("chrome");
    }
    @AfterEach
    public void tearDown(){
        driver.quit();
    }
    @Test
    @Order(2)
    public void Test1(){
        //Navigating to demo webshop application
        driver.get("http://demowebshop.tricentis.com");

       WebElement ele1=driver.findElement(By.id("topcartlink"));
       String txt= ele1.findElement(By.xpath("//a[@href='/cart'][@class='ico-cart']/span[@class='cart-label']")).getText();
       System.out.println(txt);
      // assertEquals("Shopping cart",txt);
        driver.findElement(By.cssSelector(".ico-login")).click();
        Boolean actualSelval=driver.findElement(By.cssSelector("#RememberMe")).isSelected();
        //checking if the rememberme check box is selected or not
        System.out.println(actualSelval);
      //  assertFalse(actualSelval);

       System.out.println(driver.findElement(By.cssSelector(".reversed a")).getText());

        System.out.println("Next statement");
//        driver.findElement(By.cssSelector(".ico-login")).click();
//        driver.findElement(By.cssSelector(".email")).sendKeys("planittest78@gmail.com");
//
//        driver.findElement(By.cssSelector(".password")).sendKeys("123456");
//        driver.findElement(By.cssSelector(".login-button")).click();

    }

    @Test
    @Order(1)
    public void Test2(){
        System.out.println("I am Test2");
        System.out.println(String.format("wd-cart-item-%d",0));
        System.out.println("wd-cart-item-"+1);

    }
    @Test
    public void Test3(){
        driver.get("http://demowebshop.tricentis.com");

//        for(WebElement ele:lst){
//            System.out.println(ele.getText());
//        }
        driver.findElement(By.partialLinkText("Log in")).click();
        List<WebElement> lst=driver.findElements(By.tagName("a"));
        for(int i=0;i<lst.size();i++){
            System.out.println(lst.get(i).getText());
        }
    }

     @Test
     public void Test4() throws InterruptedException {
//        driver.get("https://demo.guru99.com/test/drag_drop.html");
//        WebElement src=driver.findElement(By.xpath("//*[@id='credit2']/child::a"));
//        WebElement des=driver.findElement(By.xpath("//*[@id='bank']/child::li"));
//        new Actions(driver).dragAndDrop(src,des).build().perform();
         driver.get("https://ps.uci.edu/~franklin/doc/file_upload.html");
         driver.findElement(By.cssSelector("input[name='userfile']")).sendKeys("C:\\Users\\Yashica\\Desktop\\bddscript.txt");
         driver.findElement(By.cssSelector("input[value='Send File']")).click();
//         WebElement ele=driver.findElement(By.cssSelector(".email"));
//         WebElement ele1=driver.findElement(By.cssSelector(".password"));
//         WebElement ele2=driver.findElement(By.cssSelector(".login-button"));
//        JavascriptExecutor js=(JavascriptExecutor) driver;
//        js.executeScript("arguments[0].value='planittest78@gmail.com'; arguments[1].value='123456'; arguments[2].click();",ele,ele1,ele2);
//        js.executeScript("document.getElementsByClassName('ico-logout')[0].click()");
//      //  js.executeScript("arguments[0].value='123456';",ele1);
//     //   js.executeScript("arguments[0].click()",ele2);



     }

     @Test
     public void selTest(){
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        Select sel= new Select(driver.findElement(By.id("course")));
       //  driver.findElement(By.cssSelector("#course");
         Assertions.assertFalse(sel.isMultiple());
       List<WebElement>lst=sel.getOptions();
       System.out.println(lst);
       for(WebElement ele:lst){
           System.out.println(ele.getText());
       }
       Assertions.assertEquals(5,lst.size());

       sel.selectByVisibleText("Java");
       System.out.println(sel.getFirstSelectedOption().getText());
       Assertions.assertEquals("Java",sel.getFirstSelectedOption().getText());



     }
     @Test
     public void selMulti(){
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
       Select sel=new Select(driver.findElement(By.id("ide")));

       Assertions.assertTrue(sel.isMultiple());
       sel.selectByIndex(1);
       sel.selectByIndex(2);
       sel.selectByValue("nb");

       List<WebElement> lst=sel.getAllSelectedOptions();
       for(WebElement e:lst){
           System.out.println(e.getText());
       }
     }

     @Test
     public void alertTest()  {
      // driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
       driver.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html");
       driver.findElement(By.id("alertBox")).click();
       Alert alert= driver.switchTo().alert();
       System.out.println( alert.getText());
       alert.accept();

       driver.findElement(By.id("promptBox")).click();
         alert= driver.switchTo().alert();
         System.out.println( alert.getText());
         alert.sendKeys("Rajesh");
         alert.accept();
         System.out.println(driver.findElement(By.id("output")).getText());
     }


     @Test
     public void windowsHandle() throws InterruptedException {

        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        System.out.println("Parent windows title "+ driver.getTitle());
        String originalWindow=driver.getWindowHandle();
        System.out.println("Parent window "+originalWindow);
        driver.findElement(By.id("newWindowBtn")).click();
      //   Thread.sleep(3000); // Application took 1 secs
        for(String winHandle:driver.getWindowHandles()){
            if(!winHandle.equalsIgnoreCase(originalWindow)){
                driver.switchTo().window(winHandle);
                System.out.println("child window "+winHandle);
                System.out.println("child windows title "+ driver.getTitle());
                break;
            }
        }
        driver.findElement(By.id("firstName")).sendKeys("Testname");
        driver.findElement(By.id("lastName")).sendKeys("Testlastname");
        driver.close();
        driver.switchTo().window(originalWindow);
       // driver.switchTo().defaultContent();
        String txt= driver.findElement(By.id("newWindowBtn")).getText();
        System.out.println(txt);


     }

      @Test
      public void JSTest(){
          driver.get("http://demowebshop.tricentis.com");
          WebElement loginlnk=driver.findElement(By.cssSelector(".ico-login"));

          JavascriptExecutor js=(JavascriptExecutor) driver;
          js.executeScript("arguments[0].click();",loginlnk);
          WebElement username=driver.findElement(By.cssSelector(".email"));
          WebElement password=driver.findElement(By.cssSelector(".password"));
          WebElement loginbtn=driver.findElement(By.className("login-button"));
          js.executeScript("arguments[0].scrollIntoView(true);arguments[0].value='planittest78@gmail.com';arguments[1].value='123456';arguments[2].click();",username,password,loginbtn);
//          js.executeScript("arguments[0].scrollIntoView(true)",username);
//          js.executeScript("arguments[0].value='planittest78@gmail.com';",username);
//          js.executeScript("arguments[0].value='123456';",password);
//          js.executeScript("arguments[0].click();",loginbtn);

      }


      @Test
      public void WaitTest(){

          double starttime = 0;
          double endtime ;
        try {
         //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
            driver.get("http://demowebshop.tricentis.com");
            driver.findElement(By.cssSelector(".ico-login")).click();
            driver.findElement(By.cssSelector(".email")).sendKeys("planittest78@gmail.com");
            driver.findElement(By.cssSelector(".password")).sendKeys("123456");
            starttime = System.currentTimeMillis();
            System.out.println(starttime);
         /*   WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(6));
            WebElement element=wait.until(new Function<WebDriver, WebElement>(){
                public WebElement apply(WebDriver driver){
                    return driver.findElement(By.className("login-button"));
                }
            });*/

            //FluentWait
            Wait<WebDriver> fluentWait= new FluentWait<WebDriver>(driver)
                    .withTimeout(Duration.ofSeconds(30))
                            .pollingEvery(Duration.ofSeconds(2))
                                     .ignoring(NoSuchElementException.class);

            WebElement element=fluentWait.until(new Function<WebDriver, WebElement>(){
                public WebElement apply(WebDriver driver){
                    return driver.findElement(By.className("login-button1"));
                }
            });
            element.click();



        }
        catch(TimeoutException ex){
           System.out.println("exception caught"+ex.getStackTrace());

        }
        catch(NoSuchElementException e){
            System.out.println("No such element present");
        }

        finally{
            endtime = System.currentTimeMillis();
            System.out.println(endtime);
            System.out.println(endtime - starttime); 
        }

      }


  @Test
    public void StaleTest() throws InterruptedException {

        try{
            driver.get("http://demowebshop.tricentis.com");
            driver.findElement(By.cssSelector(".ico-login")).click();
            driver.findElement(By.cssSelector(".email")).sendKeys("planittest78@gmail.com");
            WebElement ele=driver.findElement(By.cssSelector(".password"));
            driver.navigate().refresh();
            Thread.sleep(6000);
            ele.sendKeys("123456");
        }
        catch(StaleElementReferenceException e){
            System.out.println("Staleelement");
            driver.findElement(By.cssSelector(".password")).sendKeys("123456");
            Thread.sleep(6000);
        //    e.printStackTrace();
        }

  }

  @Test
  public void login(){
      Properties properties=PropertyUtils.propertyLoader("src/main/resources/Test.properties");
      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
      driver.get(properties.getProperty("baseUrl"));
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ico-login"))).click();
       // driver.findElement(By.cssSelector(".ico-login")).click();
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".email"))).sendKeys(properties.getProperty("username"));
     //   driver.findElement(By.cssSelector(".email")).sendKeys(properties.getProperty("username"));
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".password"))).sendKeys(properties.getProperty("password"));
    //    driver.findElement(By.cssSelector(".password")).sendKeys(properties.getProperty("password"));
  }

}
