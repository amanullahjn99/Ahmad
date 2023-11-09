package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginSteps extends CommonMethods {
    @Given("user is navigated to HRMS application")
    public void user_is_navigated_to_hrms_application() {
       openBrowserAndLaunchApplication();
    }
    @When("user enters admin username and password")
    public void user_enters_admin_username_and_password() {
      sendText(loginPage.usernameTextField, ConfigReader.getPropertyValue("username"));
      sendText(loginPage.passwordTextField, ConfigReader.getPropertyValue("password"));
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        click(loginPage.loginBtn);
    }
    /*@Then("user closes the browser")
    public void user_closes_the_browser() {
        closeBrowser();*/

    }




