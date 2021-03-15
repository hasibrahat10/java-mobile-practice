package steps;

import cucumber.api.java.en.*;

import pages.UnitConverterPage;


public class UnitConverterSteps extends TestSetup {
    @When("^I am on the home page of the application$")
    public void iAmOnTheHomePageOfTheApplication() {
    }

    @Then("^I click on the navigation drawer icon$")
    public void iClickOnTheNavigationDrawerIcon() {
        new UnitConverterPage().setNavigationDrawer();
    }

    @Then("^I click on the length category$")
    public void iClickOnTheLengthCategory() {
        new UnitConverterPage().setCategoryLength();
    }


    @And("^I have enter the conversion entry$")
    public void iHaveEnterTheConversionEntry() {
        new UnitConverterPage().setConvertEntry();
    }

    @Then("^I clear the result$")
    public void iClearTheResult() {
        new UnitConverterPage().setClearText();
    }


}
