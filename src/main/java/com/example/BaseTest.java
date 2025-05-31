package com.example;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;


public class BaseTest extends BaseLibrary{

    @BeforeTest
    public void BeforeTest(){
        RestAssured.baseURI=URL;
    }

}
