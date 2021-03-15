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

    @Then("^I click on likhoni item$")
    public void iClickOnLikhoniItem() {
        new BornoPoricoiPage().setLikhoni();
    }

    @Then("^I click on sorborno text item$")
    public void iClickOnSorbornoTextItem() {
        new BornoPoricoiPage().setSorbornoText();
    }

    @Then("^I have perform sorborno board writting task$")
    public void iHavePerformSorbornoBoardWrittingTask() {
        new BornoPoricoiPage().setSorbornoWritingTask();
    }

    @And("^I close the sorborno likhoni$")
    public void iCloseTheSorbornoLikhoni() {
        new BornoPoricoiPage().setCloseSorbornoTask();
    }

    @Then("^I click on banjon borno text item$")
    public void iClickOnBanjonBornoTextItem() {
        new BornoPoricoiPage().setBanjonBornoText();
    }

    @Then("^I have perform banjon borno board writing$")
    public void iHavePerformBanjonBornoBoardWriting() {
        new BornoPoricoiPage().setBanjonBornoWritingTask();
    }

    @And("^I close the banjon borno likhoni$")
    public void iCloseTheBanjonBornoLikhoni() {
        new BornoPoricoiPage().setBanjonBornoTextClose();
    }

    @Then("^I click on sorocinnho item$")
    public void iClickOnSorocinnhoItem() {
        new BornoPoricoiPage().setSorocinnho();
    }

    @Then("^I click on sorocinnho sikhi item$")
    public void iClickOnSorocinnhoSikhiItem() {
        new BornoPoricoiPage().setSorocinnho_sikhi();
    }

    @Then("^I click on sorocinnho sikhi okkhor and board$")
    public void iClickOnSorocinnhoSikhiOkkhorAndBoard() {
        new BornoPoricoiPage().setSorocinnho_sikhiBoard();
    }

    @And("^I click on sorochinno sikhi close button$")
    public void iClickOnSorochinnoSikhiCloseButton() {
        new BornoPoricoiPage().setSorocinnho_sikhiClose();
    }

    @Then("^I click on sorocinnho pori item$")
    public void iClickOnSorocinnhoPoriItem() {
        new BornoPoricoiPage().setSorocinnho_Pori();
    }

    @Then("^I click on sorocinnho pori okkhor and board$")
    public void iClickOnSorocinnhoPoriOkkhorAndBoard() {
        new BornoPoricoiPage().setSorocinnho_poriWordBoard();
    }

    @And("^I click on sorochinno pori close button$")
    public void iClickOnSorochinnoPoriCloseButton() {
        new BornoPoricoiPage().setSorocinnho_poriExamClose();
    }


}
