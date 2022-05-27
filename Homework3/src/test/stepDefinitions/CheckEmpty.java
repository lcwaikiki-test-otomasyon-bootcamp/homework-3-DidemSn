package test.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import test.pages.LoginPage;

public class CheckEmpty {
    LoginPage loginPage = new LoginPage();

    @When("click login button")
    public void click_login_button() {
        loginPage.clickByClass(".login-form__button.login-form__button--bg-blue");
    }
    @Then("should see {string} Email Empty message")
    public void should_see_email_empty_message(String string) {
        loginPage.checkElement(string);
    }
    @Then("should see {string} Password Empty message")
    public void should_see_password_empty_message(String string) {
        loginPage.checkElement(string);
    }


}
