package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\data.feature",glue="com.stepdefinition")
public class Runner1 {
	

}
