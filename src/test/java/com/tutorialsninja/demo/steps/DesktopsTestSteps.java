package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.DesktopsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DesktopsTestSteps {
    @And("I select sort by position {string}")
    public void iSelectSortByPosition(String productSortBy) {
        new DesktopsPage().selectPositionByAtoZ(productSortBy);

    }

    @Then("I should be able to verify that the product is arranged in descending order")
    public void iShouldBeAbleToVerifyThatTheProductIsArrangedInDescendingOrder() {
        new DesktopsPage().ProductNameDisplayOrder();
    }

    @When("I mouse hover and click on Currency Dropdown")
    public void iMouseHoverAndClickOnCurrencyDropdown() {
        new DesktopsPage().clickOnCurrency();
    }

    @And("I mouse hover and click on £Pound Sterling")
    public void iMouseHoverAndClickOn£PoundSterling() {
        new DesktopsPage().clickOnPoundSterling();
    }


    @And("I verify the text {string}")
    public void iVerifyTheText(String text) {
        new DesktopsPage().verifyProduct(text);
    }

    @And("I click on {string}")
    public void iClickOn(String arg0) {

    }

    @And("I enter qty {string}")
    public void iEnterQty(String arg0) {
        new DesktopsPage().enterQuantity();
    }

    @And("I click on “Add to Cart” button")
    public void iClickOnAddToCartButton() {
        new DesktopsPage().clickOnAddToCart();
    }

    @And("I verify the message {string}")
    public void iVerifyTheMessage(String arg0) {
    }

    @And("I click on link {string}")
    public void iClickOnLink(String arg0) {
        new DesktopsPage().clickOnAddToCart();
    }

    @Then("I Verify the Product name {string}")
    public void iVerifyTheProductName(String name) {
        new DesktopsPage().verifyProduct(name);
    }

    @And("I Verify the Model {string}")
    public void iVerifyTheModel(String m) {
        new DesktopsPage().verifyModelList(m);
    }

    @And("I Verify the Todal {string}")
    public void iVerifyTheTodal(String total) {
        new DesktopsPage().verifyPriceList(total);
    }
}