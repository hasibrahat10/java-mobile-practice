package steps;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.TestPage;

public class TestPageSteps extends TestSetup {

    @Given("^I am on the home mobile view$")
    public void i_am_on_the_home_mobile_view() {

    }


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
