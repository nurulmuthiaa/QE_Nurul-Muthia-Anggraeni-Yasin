package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.thucydides.core.annotations.Steps;

public class transactionSteps {
    @Steps
    Get get;

    @Given("user get all transaction 1 api endpoints")
    public void getalltransactionapiendpoints(){

    }
    @When("user want to get all transactions using valid url and valid auth token")
    public void getalltransactionsusingvalidurlandvalidauthtoken(){

    }
    @Then("user succes create transactions respon 200 OK on create trans 1")
    public void succescreatetransactionsresponsecode200(){

    }
    @And("user receive validate data for all transactions1")
    public void validdataforalltransactions(){

    }
}
