package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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

    @And("^I have enter the conversion entry as \"([^\"]*)\"$")
    public void iHaveEnterTheConversionEntryAs(String SelectorValue) {

        new UnitConverterPage().entryConversionValue(SelectorValue);

    }

    @Then("^I have enter the conversion value as \"([^\"]*)\"$")
    public void iHaveEnterTheConversionValueAs(String entryValue)  {
        new UnitConverterPage().enterValue(entryValue);

    }

    @Then("^I clear the result$")
    public void iClearTheResult() {
        new UnitConverterPage().setClearText();
    }



}
