package fourth.fourth;

import io.restassured.path.json.JsonPath;

public class SolvingComplexJson {

	public static void main(String[] args) {

		JsonPath jp= new JsonPath(PayLoad.complexJson());
		
		// print number of courses
		int numberOfCourses=jp.getInt("courses.size()");
		System.out.println(numberOfCourses);
		
		// print purchase ammount
		int purchaseAmount=jp.getInt("dashboard.purchaseAmount");
		System.out.println(purchaseAmount);
		
		//Print Title of the first course
		String courseTitle= jp.get("courses[0].title");
		System.out.println(courseTitle);
		
		//Print All course titles and their respective Prices
		for(int i=0;i<numberOfCourses;i++)
		{
			System.out.println(jp.get("courses["+i+"].title"));
			System.out.println(jp.get("courses["+i+"].price"));
		}
		
		//Print no of copies sold by RPA Course
		for(int j=0;j<numberOfCourses;j++)
		{
			courseTitle=jp.get("courses["+j+"].title");
			if(courseTitle.equalsIgnoreCase("Cypress"))
			{
				System.out.println(jp.get("courses["+j+"].copies"));
			}
		}
		// Verify if Sum of all Course prices matches with Purchase Amount
		int purchasetotal=jp.get("dashboard.purchaseAmount");
		int sumOfAllCourses=0;
		for(int k=0;k<numberOfCourses;k++)
		{
			int price=jp.get("courses["+k+"].price");
			int copies=jp.get("courses["+k+"].copies");
			sumOfAllCourses=sumOfAllCourses+price*copies;
			System.out.println(sumOfAllCourses);
			
		}
		if(purchasetotal==sumOfAllCourses)
		{
			System.out.println("Total are equal");
		}
	}
		
		
	
	}
	


