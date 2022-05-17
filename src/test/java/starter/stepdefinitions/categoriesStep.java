package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.thucydides.core.annotations.Steps;

public class categoriesStep {
    @Steps
    Get get;

    @Given("user get all categories 1 api endpoints")
    public void getallcategories1apiendpoints(){

    }
    @When("user want to see all categories using valid url")
    public void wantToSeeAllCategoriesUsingValidUrl(){

    }
    @Then("user succes to see all categories response code 200")
    public void succestoseeallcatresponsecode200(){

    }
    @And("user receive valid data for detail categories 1")
    public void validatedatafordetailcat1(){

    }

}
