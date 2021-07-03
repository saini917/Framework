package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//feature
//stepDefination
@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
				 "pretty","html:target/cucumberHtmlReport.html",     //  for html result
				 "json:target/cucumber-json-report.json",            // for json result
				 "junit:target/cucumber-junit-report.xml"            // for junit result
			     },
		dryRun = false,
		monochrome = true,
		//strict = true,
		features = "src/test/java/Features",
		glue = "StepDefination",
		//tags = "@RegTest or @SanityTest"
		//tags = "@MobileTest or @WebTest"
		//tags = "@SeleniumTest or @PersonalDetailPageTest"
		//tags = "@PersonalDetailPageTest or @ApplicantAddress"
		//tags = "@SeleniumTest"
		//tags = "@ApplicantAddress or @PersonalDetailPageTest or @SeleniumTest"
		//tags = "@PersonalDetailPageTest"
		tags = "@ApplicantAddress"
		)
public class TestRunner {

}
