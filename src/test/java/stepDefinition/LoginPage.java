package stepDefinition;

import io.cucumber.java.en.When;

import static pages.LoginPage.*;

public class LoginPage {

    @When("User successfully enters the login details")
    public void user_successfully_enter_the_login_details() throws InterruptedException  {

        sendKeys_Username();
        sendKeys_Password();
        click_Login_button();

    }

}
