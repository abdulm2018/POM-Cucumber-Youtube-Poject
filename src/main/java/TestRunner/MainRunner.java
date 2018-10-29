package TestRunner;


@CucucmbeOptions(
		feature = "./Feature/",
		glue = {"StepDefinitions"},
		tags = {@UATTesting},
		plugin {"preety","html:target/site/cucumber-preety","json:target/cucumber.json"},
		monochrome = true
		)


public class MainRunner {

}
