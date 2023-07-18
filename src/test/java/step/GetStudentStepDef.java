package step;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class GetStudentStepDef {
	Response res;
	
	@When("I Hit Get Request with Correct ID")
	public void i_Hit_Get_Request_with_Correct_ID() {
	    res = RestAssured.get("https://dummy.restapiexample.com/api/v1/employee/1");
	}

	@Then("The Status Code should be")
	public void the_Status_Code_should_be() {
	    System.out.println(res.prettyPrint());
	    System.out.println("THE STATUS CODE IS "+res.getStatusCode());
	    
	    Assert.assertEquals(res.getStatusCode(), 200);
        
	    ResponseBody body = res.getBody();
        String status = body.jsonPath().get("status");
        
        Assert.assertEquals(status, "success");
	
	}

}
