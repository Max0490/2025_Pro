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
                .log().all();
    }


    @Test
    void simpleApiPostTest() {
        String requestBody = """
            {
              "id": 10,
              "petId": 198772,
              "quantity": 1,
              "shipDate": "2025-07-30T12:00:00Z",
              "status": "placed",
              "complete": true
            }
            """;

        given().baseUri("https://petstore.swagger.io/v2/")
                .basePath("/store/order")
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when().post()
                .then().statusCode(200)
                .log().all();
    }

}
