package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/feature/Student.feature", glue = {
		"step" }, monochrome = true, plugin = { "pretty", "json:target/JSONReports/getStudentByID" })
public class GetStudentRunner {

}
