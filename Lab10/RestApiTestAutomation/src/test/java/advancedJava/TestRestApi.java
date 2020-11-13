package advancedJava;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRestApi {

    @Test
    void getUser(){
        RestAssured.baseURI="https://gorest.co.in/public-api/users";
        RequestSpecification httprequest = RestAssured.given();
        Response response = httprequest.request(Method.GET,"/123");
        String res = response.getBody().asString();
        System.out.println("Response is" + res);
        int statusCode = response.statusCode();
        Assert.assertEquals(statusCode,200);
    }

    @Test
    void addCustomer(){
        RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
        RequestSpecification httprequest = RestAssured.given();
        JSONObject reqparam = new JSONObject();
        reqparam.put("name", "btest");
        reqparam.put("salary", "3000");
        reqparam.put("age", "23");
        httprequest.header("Content-Type","application/json");
        httprequest.body(reqparam.toString());
        Response response = httprequest.request(Method.POST, "/create");
        String res = response.getBody().asString();
        System.out.println("Response is " + res);
        int statusCode = response.statusCode();
        Assert.assertEquals(statusCode, 200);
        String statusMessage = response.jsonPath().get("status");
        Assert.assertEquals(statusMessage, "success");
    }
}
