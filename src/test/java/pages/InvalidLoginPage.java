package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class InvalidLoginPage extends CommonMethods {


    @FindBy(xpath = "//span[@id='spanMessage']")
    public WebElement actualErrorMsg;

    @FindBy(xpath = "//*[@id=\"welcome\"]")
    public WebElement welcomeAdminLocator;



    public InvalidLoginPage(){
        PageFactory.initElements(driver,this);
    }

}