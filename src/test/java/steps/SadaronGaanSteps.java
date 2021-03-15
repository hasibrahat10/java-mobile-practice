package steps;

import cucumber.api.java.en.*;
import pages.SadaronGaanPage;


public class SadaronGaanSteps extends TestSetup{
    @Then("^I click sadaron gaan category$")
    public void iClickSadaronGaanCategory() {
        new SadaronGaanPage().setGeneralKnowledge();
    }

    @Then("^I click on Prani name$")
    public void iClickOnPraniName() {
        new SadaronGaanPage().setPraniName();
    }

    @Then("^I am on prani board and next to prev item$")
    public void iAmOnPraniBoardAndNextToPrevItem() {
        new SadaronGaanPage().setGeneralKnowledgeSteps();
    }

    @And("^I close the prani item$")
    public void iCloseThePraniItem() {
        new SadaronGaanPage().setGeneralKnowledge_praniClose();
    }
}
