package example;

import static org.hamcrest.Matchers.equalTo;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class ApiTest {

    @Test
    void simpleApiGetInventoryTest() {
        given()
                .baseUri("https://petstore.swagger.io/v2/")
                .when()
                .get("/store/inventory")
                .then()
                .statusCode(200)
                .body("available", equalTo(0));
    }


    @Test
    void simpleApiPostTest() {
        given().baseUri("https://petstore.swagger.io/v2/")
                .basePath("/store/inventory")
                .contentType(ContentType.JSON)
                .when().post()
                .then().statusCode(200);
    }

}
