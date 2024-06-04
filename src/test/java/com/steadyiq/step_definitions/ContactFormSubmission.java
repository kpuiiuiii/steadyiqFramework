package com.steadyiq.step_definitions;

import com.github.javafaker.Faker;
import com.steadyiq.pages.ContactUsPage;
import com.steadyiq.utilities.ConfigurationReader;
import com.steadyiq.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class ContactFormSubmission {
    Faker faker = new Faker();
    ContactUsPage cp = new ContactUsPage();
    Select select;
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));

    @Given("the user is on the {string} page")
    public void the_user_is_on_the_page(String string) {

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        Assert.assertEquals(Driver.getDriver().getTitle(), ("Contact us | SteadyIQ"));
        wait.until(ExpectedConditions.elementToBeClickable(cp.cookieButton));
        cp.cookieButton.click();


    }

    @When("the user enters random test data for the form")
    public void the_user_enters_random_test_data_for_the_form() {
        select = new Select(cp.industryField);


        wait.until(ExpectedConditions.elementToBeClickable(cp.fNameField));
        cp.fNameField.sendKeys(faker.name().firstName());

        wait.until(ExpectedConditions.elementToBeClickable(cp.lNameField));
        cp.lNameField.sendKeys(faker.name().lastName());

        wait.until(ExpectedConditions.elementToBeClickable(cp.industryField));
        select.selectByIndex(1);


        //cp.emailField.sendKeys(faker.internet().emailAddress());


    }

    @When("the user presses the {string} button")
    public void the_user_presses_the_button(String submit) {
        wait.until(ExpectedConditions.elementToBeClickable(cp.submitButton));
        cp.submitButton.click();

    }


    @Then("the user should see a message")
    public void theUserShouldSeeAMessage() {
        String message = cp.messageAlert.getText();
        Assert.assertEquals("Please complete all required fields.", message);

        Driver.getDriver().quit();
    }
}
