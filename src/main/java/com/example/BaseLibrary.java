package com.example;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.Map;

public class BaseLibrary extends BaseURL{

    public Response Get(String urlPath){
        Response response=RestAssured.get(urlPath);
        System.out.println("Response: "+response.getBody().asString());
        return response;
    }
    public Response Post(String urlPath, Map<String, Object> bodyPayload) {
        Response response  = RestAssured.given().header("Content-Type", "application/json").body(bodyPayload).when().post(urlPath);
        System.out.println( "Response:" + response.getBody().asString());
        return response;
    }

    public Response Put(String urlPath, Map<String, Object> bodyPayload) {
        Response response =  RestAssured.given().header("Content-Type", "application/json").body(bodyPayload).when().put(urlPath);
        System.out.println( "Response:" + response.getBody().asString());
        return response;
    }

    public Response Delete(String urlPath) {
        Response response = RestAssured.delete(urlPath);
        System.out.println( "Response:" + response.getBody().asString());
        return response;
    }

    public Response Get(String urlPath,Map<String, Object> queryParamsPayload){
        Response response =RestAssured.given().header("Content-Type", "application/json").queryParams(queryParamsPayload).when().get(urlPath);
        System.out.println("Response: "+response.getBody().asString());
        return response;
    }
}
