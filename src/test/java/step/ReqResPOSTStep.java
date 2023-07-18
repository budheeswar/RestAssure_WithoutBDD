package step;

import org.json.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ReqResPOSTStep {

	Response res;
	JSONObject obj;
	
	@Given("I Have Post Request Body")
	public void i_have_post_request() {
		obj = new JSONObject();
		obj.put("name", "RB");
		obj.put("job", "Tester");
		
	}

	@When("I Hit POST request")
	public void i_create_post_request() {
		RequestSpecification request = RestAssured.given();
		request.contentType("application/json");
		request.pathParams("path1","api", "path2","user");
		request.body(obj.toString());
		res = request.post("https://reqres.in/{path1}/{path2}");
	}
	@Then("ID should be Created")
	public void id_should_be_created() {
		System.out.println(res.getStatusCode());
		System.out.println(res.getBody().jsonPath().getInt("id"));
		System.out.println(res.getBody().asString());
	}

}
