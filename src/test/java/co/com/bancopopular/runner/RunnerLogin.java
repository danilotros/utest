package co.com.bancopopular.runner;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/login.feature",
        glue = "co.com.bancopopular.stepdefinition",
        snippets = SnippetType.CAMELCASE )
public class RunnerLogin {
}
