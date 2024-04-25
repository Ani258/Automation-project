package org.cap.Postman;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class Put {

	public static void main(String[] args) {
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String response=given().relaxedHTTPSValidation().log().all().queryParam("Key","qaclick123").queryParam("place_id","4370603281842ccca667d014192b8ee1").header("Content-Type","application/json").body("{\r\n"
				+ "\"place_id\":\"4370603281842ccca667d014192b8ee1\",\r\n"
				+ "\"address\":\"13th street, USA\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}\r\n"
				+ "").when().put("/maps/api/place/update/json").then().log().all().assertThat().statusCode(200).extract().asString();
		System.out.println(response);


	}

}
