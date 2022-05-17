package starter.transactions;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class get {
    protected static String url = "https://be-qa.alta.id/api";

    @Step("user get all transaction 1 api endpoints")
    public String getalltransactionapiendpoints(){
        return url + "/orders";
    }

    @Step("user want to get all transactions using valid url and valid auth token")
    public void getalltransactionsusingvalidurlandvalidauthtoken(){

        SerenityRest.given().get(getalltransactionapiendpoints());
    }

    @Step("user succes create transactions respon 200 OK on create trans 1")
    public void succescreatetransactionsresponsecode200(){
        restAssuredThat(response -> response.statusCode(200)); }

    @Step ("user receive validate data for all transactions1")
    public void validdataforalltransactions(){
        restAssuredThat(response -> response.body("'data'", equalTo("")));
    }
}
