package pageObject;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {


    WebDriver driver;
    public LoginPage(){
       driver =  Driver.getDriver();
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }



    @FindBy(css="#userId-input")
   WebElement homePageUserName;

    @FindBy(id = "password")
    WebElement homePagePass;

    @FindBy(id = "fs-login-button")
    WebElement homePageLoginButton;

    public void setHomePageUserName( String str) {

        homePageUserName.sendKeys(str);
    }

    public void setHomePagePass( String password) {
        this.homePagePass.sendKeys(password);
    }

    public void LoginButton() {
        homePageLoginButton.click();
    }
}
