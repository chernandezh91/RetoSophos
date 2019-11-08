package co.com.test.vivanda.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/vivanda.feature",
        glue = "co.com.test.vivanda.stepdefinitions",
        snippets = SnippetType.CAMELCASE )
public class Vivanda {
}
