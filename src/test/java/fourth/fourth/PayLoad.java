package fourth.fourth;

public class PayLoad 
{
	public static String jsonPayload()
	{
		return "{\r\n" + 
				"  \"location\": {\r\n" + 
				"    \"lat\": -38.383494,\r\n" + 
				"    \"lng\": 33.427362\r\n" + 
				"  },\r\n" + 
				"  \"accuracy\": 50,\r\n" + 
				"  \"name\": \"Infogain corporation\",\r\n" + 
				"  \"phone_number\": \"9315362800\",\r\n" + 
				"  \"address\": \"Noida A/16, A/21 First street automation added\",\r\n" + 
				"  \"types\": [\r\n" + 
				"    \"Near sector 59 metro\",\r\n" + 
				"    \"Walk distance\"\r\n" + 
				"  ],\r\n" + 
				"  \"website\": \"infogain.com\",\r\n" + 
				"  \"language\": \"English\"\r\n" + 
				"}";
	}
	public static String complexJson()
	{
		return "{\r\n" + 
				"\"dashboard\": {\r\n" + 
				"\"purchaseAmount\": 910,\r\n" + 
				"\"website\": \"rahulshettyacademy.com\"\r\n" + 
				"},\r\n" + 
				"\"courses\": [\r\n" + 
				"{\r\n" + 
				"\"title\": \"Selenium Python\",\r\n" + 
				"\"price\": 50,\r\n" + 
				"\"copies\": 6\r\n" + 
				"},\r\n" + 
				"{\r\n" + 
				"\"title\": \"Cypress\",\r\n" + 
				"\"price\": 40,\r\n" + 
				"\"copies\": 4\r\n" + 
				"},\r\n" + 
				"{\r\n" + 
				"\"title\": \"RPA\",\r\n" + 
				"\"price\": 45,\r\n" + 
				"\"copies\": 10\r\n" + 
				"}\r\n" + 
				"]\r\n" + 
				"}\r\n" + 
				"";
	}
}
