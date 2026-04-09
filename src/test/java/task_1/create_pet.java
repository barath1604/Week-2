package task_1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class create_pet {
	@Test
	
	public static void lol(){
		
		
		//File json = new File("C:\\Users\\sabari_\\eclipse-workspace\\create\\src\\test\\resources\\testing.json");
		RestAssured.given()
		.header("Content-Type","application/json")
		.body(new object())
		
		.when()
		     .post("https://petstore.swagger.io/v2/store/order")
		     
		 .then()
		     .statusCode(200)
		     .log().all();
		
	}
}
