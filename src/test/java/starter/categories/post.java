package starter.categories;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.rest.interactions.Post;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class post {
    @Steps
    Post post;
    protected String url = "https://be-qa.alta.id/api";

    @Step("user post create 1 api endpoints")
    public String postcreatetransaction1apiendpoint(){
        return url + "/categories";
    }

    @Step("user want create categories with valid url and valid body")
    public void createcategorieswithvalidurlandvalidbody(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "bajuku");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(postcreatetransaction1apiendpoint());
    }

    @Step("user succes create transactions respon 200 OK on create categories1")
    public void  succescreatetransresponcode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user receive valid data for detail categories 1")
    public void validatedatafordetailcat1(){
        restAssuredThat(response -> response.body("'name'", equalTo("bajuku")));
    }
}

