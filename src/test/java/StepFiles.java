package test.java;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepFiles {
@Given("^The price of a ?Banana? is (\\d+)$")
public void The_price_of_a_Banana_is(int arg1) throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@When("^I checkout (\\d+) ?Banana?$")
public void I_checkout_Banana(int arg1) throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@Then("^the total price should be (\\d+)$")
public void the_total_price_should_be(int arg1) throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}


}
