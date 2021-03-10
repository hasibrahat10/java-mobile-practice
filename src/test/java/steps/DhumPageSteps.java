package steps;

import cucumber.api.java.en.*;
import pages.DhumPage;

public class DhumPageSteps extends TestSetup {

    @When("^I click on agdum bagdum and shobdo ghoton$")
    public void iClickOnAgdumBagdumAndShobdoGhoton() {
        new DhumPage().go_to_ShobdoGhoton_Process();
    }


    @And("^I arranged the word$")
    public void iArrangedTheWord() {
        new DhumPage().dragAndDropWord();
    }

    @Then("^I close the shobdo ghoto process$")
    public void iCloseTheShobdoGhotoProcess() {
        new DhumPage().closeShobdoGhoton();
    }

}
