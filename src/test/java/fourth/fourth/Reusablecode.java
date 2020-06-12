package fourth.fourth;

import io.restassured.path.json.JsonPath;

public class Reusablecode 
{
	public static JsonPath rawToJson(String jsonCode)
	{
		JsonPath js=new JsonPath(jsonCode);
		return js;
	}
}
