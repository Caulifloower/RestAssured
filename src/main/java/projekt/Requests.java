package projekt;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;

public class Requests {

    protected ValidatableResponse get(String path) {
        return RestAssured
                .when().get(path)
                .then().statusCode(200).extract().response()
                .then();
    }

    protected ValidatableResponse post(String path, String body) {
        return RestAssured
                .given().body(body)//.accept(ContentType.JSON)
                .when().post(path)
                .then().statusCode(200).extract().response()
                .then();
    }
}
