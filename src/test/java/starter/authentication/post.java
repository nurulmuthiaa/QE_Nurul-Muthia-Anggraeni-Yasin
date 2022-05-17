package starter.authentication;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.rest.interactions.Post;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class post {
    public static String url = "https://be-qa.alta.id/api/";

    @Step("user post login 1 api endpoints")
    public String postlogin1apiendpoint(){
        return url + "auth/login";
    }

    @Step("user want to login using valid email and valid password")
    public void loginusingvalidemailandpassword(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "mutee123@email.com");
        requestBody.put("password", "777888");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(postlogin1apiendpoint());
    }
    @Step("user succes login respon 200 OK on login 1")
    public void  succesloginresponcode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user receive valid data for detail login 1")
    public void receivevaliddatafordetaillogin1(){
        restAssuredThat(response -> response.body("'data'", equalTo("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6Im11dGVlIiwiRW1haWwiOiJtdXRlZTEyM0BlbWFpbC5jb20ifQ.QKirZ26jdHXcL0pNrcdxxVib4k_AEGUFpVZ5DBKmVyY")));

    }
}
