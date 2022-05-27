package test.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.pages.LoginPage;

public class CheckComponent {
    LoginPage loginPage = new LoginPage();

    @Given("Enes is on Login Page")
    public void enes_is_on_login_page() {
        loginPage.goToLogin();
    }

    @When("click {string} radio button")
    public void click_radio_button(String string) {
        loginPage.clickRadioButton(string);
    }
    @Then("should see {string} title")
    public void should_see_title(String string) {
        loginPage.checkElement(string, true);
    }
    @Then("should see {string} radio button")
    public void should_see_radio_button(String string) {
        loginPage.checkElement(string, true);
    }
    @Then("should see {string} text on Email")
    public void should_see_text_on_email(String string) {
        loginPage.checkTextBoxPlaceHolder("email", string);
    }
    @Then("should see {string} text on Password")
    public void should_see_text_on_password(String string) {
        loginPage.checkTextBoxPlaceHolder("password", string);
    }
    @Then("should see Show Password Icon")
    public void should_see_show_password_icon() {
        loginPage.checkElement("Göster", true);
    }
    @Then("should see {string} remember me")
    public void should_see_remember_me(String string) {
        loginPage.checkElement(string, true);
    }
    @Then("should see {string} forgot password")
    public void should_see_forgot_password(String string) {
        loginPage.checkElement(string, true);
    }
    @Then("should see {string} login button")
    public void should_see_login_button(String string) {
        loginPage.checkElement(string, true);
    }

    @Then("should see Phone Text Box")
    public void should_see_phone_text_box() {
        loginPage.checkNameElement("phone");
    }

}
