package steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.TestPage;

public class TestPageSteps extends TestSetup {


    @When("^I run some steps$")
    public void iRunSomeSteps() {
        new TestPage().check_the_application_process();
    }

    @Then("^I close the application$")
    public void i_close_the_application() {

        new TestPage().generalHOme();
    }


    @Then("^Click on \"([^\"]*)\" item$")
    public void clickOnItem(String category) {
        new TestPage().clickOnCategory(category);
    }


    @And("^Close the \"([^\"]*)\" category$")
    public void closeTheCategory(String close) {
        new TestPage().closeCategory(close);
    }


}
