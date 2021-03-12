package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.BornoPoricoiPage;

public class BornoPoricoiSteps extends TestSetup {

    @Given("^I am on the home mobile view$")
    public void i_am_on_the_home_mobile_view() {
    }

    //=============================  Sorborno steps ===============================
    @Then("^I click on borno poricoi category$")
    public void iClickOnBornoPoricoiCategory() {

        new BornoPoricoiPage().setBornoPoricoi();
    }

    @Then("^I click on sorborno item$")
    public void iClickOnSorbornoItem() {
        new BornoPoricoiPage().setSorborno();
    }

    @Then("^I click on next button and previous button$")
    public void iClickOnNextButtonAndPreviousButton() {
        new BornoPoricoiPage().prevNext();

    }

    @And("^I close the sorborno poricoi$")
    public void iCloseTheSorbornoPoricoi() {
        new BornoPoricoiPage().setCloseSorborno();
    }

    //=============================  Banjon borno steps define ===============================

    @Then("^I click on benjonborno item$")
    public void iClickOnBenjonbornoItem() {
        new BornoPoricoiPage().setBanjonBorno();
    }

    @Then("^I navigate next and previous screen$")
    public void iNavigateNextAndPreviousScreen() {
        new BornoPoricoiPage().setNextPrev();
    }

    @And("^I close the banjon borno screen$")
    public void iCloseTheBanjonBornoScreen() {
        new BornoPoricoiPage().setBanjonClose();
    }
}
