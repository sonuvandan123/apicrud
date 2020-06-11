package fourth.fourth;

/* below package is use for given() method need to manually 
add this because of static packages not suggested by*/
import static io.restassured.RestAssured.given;
/*below package is used to add assertion in body. Again need to add manually.
body("scope",equalTo("APP")
*/
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
public class AddPlace 
{
	public static void main(String[] args) {
	RestAssured.baseURI="https://rahulshettyacademy.com";
		
		// given all input details
		// when submit the API
		// then validate the response
		// resourse and method will always go to when()
		// we can validate in body as well using 
		String response=given().relaxedHTTPSValidation().log().all().queryParam("key","qaclick123").
		header("Content-Type","application/json")
		.body(PayLoad.jsonPayload())
		.when().post("maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).body("scope",equalTo("APP"))
		.header("Server","Apache/2.4.18 (Ubuntu)").extract().response().asString();
		JsonPath js=new JsonPath(response);
		String placeid=js.get("place_id");
		System.out.println(placeid);
		
		
		// now we will use update place API here
		//we will pass this address when update
		String updateAddress="A/21, A/16 Noida sector 60 address updated";
		given().relaxedHTTPSValidation().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
		.body("{\r\n" + 
				"\"place_id\":\""+placeid+"\",\r\n" + 
				"\"address\":\""+updateAddress+"\",\r\n" + 
				"\"key\":\"qaclick123\"\r\n" + 
				"}\r\n" + 
				"").when().log().all().put("/maps/api/place/update/json")
		.then().log().all().assertThat().statusCode(200).body("msg" ,equalTo("Address successfully updated"));
		
		String getJsonResponse=given().relaxedHTTPSValidation().log().all().queryParam("place_id",placeid).queryParam("key","qaclick123")
		.when().get("/maps/api/place/get/json")
		.then().assertThat().statusCode(200).extract().response().asString();
		JsonPath getBody=new JsonPath(getJsonResponse);
		String getAddress=getBody.getString("address");
		if(getAddress.equalsIgnoreCase(updateAddress))
		{
			System.out.println("address matched");
		}
			
	}
}
