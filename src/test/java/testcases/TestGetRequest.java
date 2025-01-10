package testcases;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;


public class TestGetRequest {

  @Test
    public void getTest() {

      Response response = given()
              .when()
              .get("https://jsonplaceholder.typicode.com/todos/1");
     // .get(Routes.get_url);

      response.then()
              .statusCode(200)
              .log().all();




  }

  }






