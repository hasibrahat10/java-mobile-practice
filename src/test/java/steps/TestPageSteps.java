package steps;

import cucumber.api.java.en.*;
import pages.TestPage;

public class TestPageSteps extends TestSetup {

    @Given("^I am on the home mobile view$")
    public void i_am_on_the_home_mobile_view(){

    }



    @When("^I run some steps$")
    public void iRunSomeSteps() {
       new TestPage().check_the_application_process();
    }
    @Then("^I close the application$")
    public void i_close_the_application() {

        new TestPage().generalHOme();
    }
}
