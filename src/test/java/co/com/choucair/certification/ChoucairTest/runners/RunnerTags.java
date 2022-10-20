package co.com.choucair.certification.ChoucairTest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/userRegister.feature", // Here, we include our features
        tags = "@Stories",
        glue = "co.com.choucair.certification.ChoucairTest.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
