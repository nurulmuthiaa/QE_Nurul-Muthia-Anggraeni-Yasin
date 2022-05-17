package starter.categories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class get {
    protected static String url = "https://be-qa.alta.id/api";

    @Step("user get all categories 1 api endpoints")
    public String getallcategories1apiendpoints(){
        return url + "/categories";
    }

    @Step("user want to see all categories using valid url")
    public void wantToSeeAllCategoriesUsingValidUrl(){

        SerenityRest.given().get(getallcategories1apiendpoints());
    }

    @Step("user succes to see all categories response code 200")
    public void succestoseeallcatresponsecode200(){
        restAssuredThat(response -> response.statusCode(200)); }

    @Step ("user receive valid data for detail categories 1")
    public void validatedatafordetailcat1(){
        restAssuredThat(response -> response.body("'data'.'id'", equalTo(1)));
        restAssuredThat(response -> response.body("'data'.'name'", equalTo("kesehatan")));
    }

}
