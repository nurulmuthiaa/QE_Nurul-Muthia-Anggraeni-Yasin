package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.thucydides.core.annotations.Steps;

public class productSteps {
    @Steps
    Get get;

    @Given("user get product by id 1 api endpoints")
    public void getproductbyidapiendpoints(){

    }
    @When("user want to get product using valid url and valid id")
    public void getproductusingvalidurlandvalidid(){

    }
    @Then("user succes to get product by id response code 200 on get product by id 1")
    public void succestogetproductbyidresponsecode200(){

    }
    @And("user receive valid data for get detail product 1")
    public void validatedatafordetailproduct1(){

    }
}
