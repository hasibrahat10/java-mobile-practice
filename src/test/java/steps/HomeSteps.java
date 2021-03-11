package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.HomePage;

public class HomeSteps extends TestSetup {
    @When("^I am on the my conversion screen$")
    public void iAmOnTheMyConversionScreen() {

    }

    @Then("^I tap on navigation drawer$")
    public void iTapOnNavigationDrawer() {
        new HomePage().setNavigateDrawer();

    }

    @And("^Text will be displayed \"([^\"]*)\"$")
    public void textWillBeDisplayed(boolean expectedText)  {
        Assert.assertTrue(new HomePage().displayedText(expectedText));
    }
}
