package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\src\\test\\java\\fbpack",glue = {"fb\\stepdefnition","hook"},dryRun = false,plugin = {"json:target\\report\\fb.json"})
public class Runner {

}
