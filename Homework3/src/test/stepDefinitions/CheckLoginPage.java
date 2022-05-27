package test.stepDefinitions;

import common.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import test.pages.HomePage;


public class CheckLoginPage {

    HomePage homepage = new HomePage();
    public void enes_is_on_home_page() {
        homepage.goToHome();
    }
    @When("click {string} card in the top rigt")
    public void click_card_in_the_top_rigt(String string) {
        homepage.clickByString(string);
    }
    @Then("should see Login Page")
    public void should_see_login_page() {
        homepage.isInLoginPage();
    }
}
