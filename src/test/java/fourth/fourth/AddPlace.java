package fourth.fourth;

/* below package is use for given() method need to manually 
add this because of static packages not suggested by*/
import static io.restassured.RestAssured.given;
/*below package is used to add assertion in body. Again need to add manually.
body("scope",equalTo("APP")
*/
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
public class AddPlace 
{
	public static void main(String[] args) {
	RestAssured.baseURI="https://rahulshettyacademy.com";
		
		// given all input details
		// when submit the API
		// then validate the response
		// resourse and method will always go to when()
		// we can validate in body as well using 
		given().relaxedHTTPSValidation().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
		.body(PayLoad.jsonPayload())
		.when().post("maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).body("scope",equalTo("APP"))
		.header("Server","Apache/2.4.18 (Ubuntu)");
		;
	}
}
