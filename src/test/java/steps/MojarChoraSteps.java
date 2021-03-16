package steps;

import cucumber.api.java.en.*;
import pages.MojarChoraPage;

public class MojarChoraSteps extends TestSetup{
    @Then("^I click on Mojar chora category$")
    public void iClickOnMojarChoraCategory() {
        new MojarChoraPage().setCategoryMojarChora();
    }


}
