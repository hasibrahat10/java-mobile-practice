package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.SadaronGaanPage;


public class SadaronGaanSteps extends TestSetup {
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


    @And("^I close the prani item and click home$")
    public void iCloseThePraniItemAndClickHome() {
        new SadaronGaanPage().setGeneralKnowledge_praniClose();
    }

    @Then("^I click on fol name$")
    public void iClickOnFolName() {
        new SadaronGaanPage().setGeneralKnowledgeFol();
    }

    @Then("^I am on fol board and next to prev item$")
    public void iAmOnFolBoardAndNextToPrevItem() {
        new SadaronGaanPage().setGeneralKnowledgeFolSteps();
    }


    @And("^I close the fol item and click home$")
    public void iCloseTheFolItemAndClickHome() {
        new SadaronGaanPage().setGeneralKnowledge_folClose();
    }


    @Then("^I click on ful name$")
    public void iClickOnFulName() {
        new SadaronGaanPage().setGeneralKnowledge_ful();

    }

    @Then("^I am on ful board and next to prev item$")
    public void iAmOnFulBoardAndNextToPrevItem() {
        new SadaronGaanPage().setGeneralKnowledgeFulSteps();
    }


    @And("^I close the ful item and click home$")
    public void iCloseTheFulItemAndClickHome() {
        new SadaronGaanPage().setGeneralKnowledge_fulClose();
    }

    @Then("^I click on pakhi name$")
    public void iClickOnPakhiName() {
        new SadaronGaanPage().setGeneralKnowledge_pakhi();
    }

    @Then("^I am on pakhi board and next to prev item$")
    public void iAmOnPakhiBoardAndNextToPrevItem() {
        new SadaronGaanPage().setGeneralKnowledgePakhiSteps();
    }


    @And("^I close the pakhi item and click home$")
    public void iCloseThePakhiItemAndClickHome() {
        new SadaronGaanPage().setGeneralKnowledge_pakhiClose();
    }

    @Then("^I click on mach name$")
    public void iClickOnMachName() {
        new SadaronGaanPage().setGeneralKnowledge_mach();
    }

    @Then("^I am on mach board and next to prev item$")
    public void iAmOnMachBoardAndNextToPrevItem() {
        new SadaronGaanPage().setGeneralKnowledgeMachSteps();
    }


    @And("^I close the mach item and click home$")
    public void iCloseTheMachItemAndClickHome() {
        new SadaronGaanPage().setGeneralKnowledge_machClose();
    }

    @Then("^I click on sobji name$")
    public void iClickOnSobjiName() {
        new SadaronGaanPage().setGeneralKnowledge_sobji();
    }

    @Then("^I am on sobji board and next to prev item$")
    public void iAmOnSobjiBoardAndNextToPrevItem() {
        new SadaronGaanPage().setGeneralKnowledgeSobjiSteps();
    }

    @And("^I close the sobji item and click home$")
    public void iCloseTheSobjiItemAndClickHome() {
        new SadaronGaanPage().setGeneralKnowledge_sobjiClose();
    }


}
