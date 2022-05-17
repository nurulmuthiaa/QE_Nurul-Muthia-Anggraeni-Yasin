package starter.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class get {
    protected static String url = "https://be-qa.alta.id/api";

    @Step("user get product by id 1 api endpoints")
    public String getproductbyidapiendpoints(){
        return url + "/products/1690";
    }

    @Step("user want to get product using valid url and valid id")
    public void getproductusingvalidurlandvalidid(){

        SerenityRest.given().get(getproductbyidapiendpoints());
    }

    @Step("user succes to get product by id response code 200 on get product by id 1")
    public void succestogetproductbyidresponsecode200(){
        restAssuredThat(response -> response.statusCode(200)); }

    @Step ("user receive valid data for get detail product 1")
    public void validatedatafordetailproduct1(){
        restAssuredThat(response -> response.body("'data'.'id'", equalTo(1690)));
        restAssuredThat(response -> response.body("'data'.'name'", equalTo("casing ip")));
    }
}
