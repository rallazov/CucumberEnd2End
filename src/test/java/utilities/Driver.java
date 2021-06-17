package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {
private Driver(){}
    private static WebDriver driver;
//WebDriverManager.chromedriver().setup();
    public static WebDriver getDriver(){
         if(driver==null){
             if(System.getProperty("browser")==null){
                 System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver");
                 driver = new ChromeDriver();
             }else {
switch (System.getProperty("browser")){
    case "chrome-headless":
        System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver");
        driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
        break;
    case "chrome-remote":
        ChromeOptions chrOptions = new ChromeOptions();
        try {
            driver = new RemoteWebDriver(new URL("http://34.235.0.4:4444/wd/hub"), chrOptions);
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
}
             }

         }
         return driver;
    }
    public static void closeDriver(){
        if(driver!=null){
            driver.close();
            driver=null;
        }
    }

}
