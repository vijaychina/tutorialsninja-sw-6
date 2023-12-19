package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TopMenuTestSteps {
    @Then("I should be able to verify Desktops text")
    public void iShouldBeAbleToVerifyDesktopsText() {
        Assert.assertEquals(new HomePage().getDesktopsText(), "Desktops", "Not navigate to Desktop page");
    }

    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I mouse hover and click on Desktops tab")
    public void iMouseHoverAndClickOnDesktopsTab() {
        new HomePage().mouseHoverOnDesktopLinkAndClick();
    }

    @And("I pass selectMenu method name {string}")
    public void iPassSelectMenuMethodName(String menu) {
        new HomePage().selectMenu(menu);
    }

    @When("I mouse hover and click on Laptops & Notebooks tab")
    public void iMouseHoverAndClickOnLaptopsNotebooksTab() {
        new HomePage().mouseHoverOnLaptopAndNotebooksLinkAndClick();
    }

    @Then("I should be able to verify Laptops & Notebooks text")
    public void iShouldBeAbleToVerifyLaptopsNotebooksText() {
        Assert.assertEquals(new HomePage().getLaptopsAndNotebooksText(), "Laptops & Notebooks", "Not navigate to Laptops & Notebooks page");
    }

    @When("I mouse hover and click on Components tab")
    public void iMouseHoverAndClickOnComponentsTab() {
        new HomePage().mouseHoverOnComponentsLinkAndClick();
    }

    @Then("I should be able to verify Components text")
    public void iShouldBeAbleToVerifyComponentsText() {
        Assert.assertEquals(new HomePage().getComponentsText(), "Components", "Not navigate to components page");
    }
}