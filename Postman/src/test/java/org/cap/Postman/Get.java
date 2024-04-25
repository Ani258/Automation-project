package org.cap.Postman;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class Get {

	public static void main(String[] args) {
	
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String response=given().relaxedHTTPSValidation().log().all().queryParam("Key","qaclick123").queryParam("place_id","4370603281842ccca667d014192b8ee1").header("Content-Type","application/json").when().get("/maps/api/place/get/json").then().log().all().assertThat().statusCode(200).extract().asString();
		System.out.println(response);

	}

}
