package packageRun;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@tagGAT1"
,features = "src/test/features5/ExempleAddinn/authentificationGAT.feature"
,glue= "ExempleCucumberAddinn"
,publish = true
,plugin = {"pretty"
		,"html:target/cucumber-reports.html"
		,"json:target/cucumber-reports"
		,}
,snippets =io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE
,monochrome = true
)



public class Ruunneerr {

}
