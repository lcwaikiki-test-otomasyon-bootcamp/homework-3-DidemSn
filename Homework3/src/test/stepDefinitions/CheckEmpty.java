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
        loginPage.checkElement(string, true);
    }
    @Then("should see {string} Password Empty message")
    public void should_see_password_empty_message(String string) {
        loginPage.checkElement(string, true);
    }

    @When("type Email {string}")
    public void type_email(String string) {
        loginPage.writeText("email", string);
    }

    @Then("should not see Email Empty message")
    public void should_not_see_email_empty_message() {
        loginPage.checkElement("Lütfen e-posta adresinizi giriniz.", false);
    }

    @When("type Password {string}")
    public void type_password(String string) {
        loginPage.writeText("password", string);
    }

    @Then("should not see Password Empty message")
    public void should_not_see_password_empty_message() {
    }

    @When("type Email {string} and click login")
    public void type_email_and_click_login(String string) {
        loginPage.writeText("email", string);
        loginPage.clickByClass(".login-form__button.login-form__button--bg-blue");
    }
    @Then("should see {string} Email False message")
    public void should_see_email_false_message(String string) {
        loginPage.checkElement(string, true);
    }

    @When("type Email {string}, Password {string} and click login")
    public void type_email_password_and_click_login(String string, String string2) {
        loginPage.writeText("email", string);
        loginPage.writeText("password", string2);
        loginPage.clickByClass(".login-form__button.login-form__button--bg-blue");
    }
    @Then("should see {string} Login Error message")
    public void should_see_login_error_message(String string) {
        loginPage.checkElement(string, true);
    }
}
