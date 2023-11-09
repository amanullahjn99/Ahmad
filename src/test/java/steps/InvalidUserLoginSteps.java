package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;

public class InvalidUserLoginSteps extends CommonMethods {
    @When("the user leaves the username field empty")
    public void the_user_leaves_the_username_field_empty() {
        sendText(InvalidUserLoginSteps.loginPage.passwordTextField, "Hum@nhrm123");
   click(InvalidUserLoginSteps.loginPage.loginBtn);


    }
    @Then("the system should display an error message stating {string}")
    public void the_system_should_display_an_error_message_stating(String expectedErrorMessage) {
       String actualErrorMessage = InvalidUserLoginSteps.invalidLoginPage.actualErrorMsg.getText();
       Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
        System.out.println(expectedErrorMessage);
    }


    @When("the user leaves the password field empty")
    public void the_user_leaves_the_password_field_empty() {
        sendText(InvalidUserLoginSteps.loginPage.usernameTextField,  "Admin");
        click(InvalidUserLoginSteps.loginPage.loginBtn);

    }
    @When("the user enters incorrect login credentials")
    public void the_user_enters_incorrect_login_credentials() {
     sendText(InvalidUserLoginSteps.loginPage.usernameTextField, "werwer");
     sendText(InvalidUserLoginSteps.loginPage.passwordTextField,  "Aman2323");
     click(InvalidUserLoginSteps.loginPage.loginBtn);
    }
    @When("the user enters valid login credentials")
    public void the_user_enters_valid_login_credentials() {
      sendText(InvalidUserLoginSteps.loginPage.usernameTextField,  "Admin");
      sendText(InvalidUserLoginSteps.loginPage.passwordTextField, "Hum@nhrm123");
      click(InvalidUserLoginSteps.loginPage.loginBtn);
        System.out.println("Login successfully");
    }
    @Then("the user should be successfully logged in")
    public void the_user_should_be_successfully_logged_in(String welcome) {
        String welcomeAdminLocator =InvalidUserLoginSteps.invalidLoginPage.welcomeAdminLocator.getText();
       Assert.assertEquals(welcome,welcomeAdminLocator);

        closeBrowser();

    }

}
