package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks extends TestSetup {
    @Before
    public void setUpDriver() {
        startDriver();
    }

    @After
    public void tearDown() {
        stopDriver();
    }
}
