package co.com.test.vivanda.stepdefinitions;

import co.com.test.vivanda.model.DataUser;
import co.com.test.vivanda.questions.Verify;
import co.com.test.vivanda.tasks.Access;
import co.com.test.vivanda.tasks.Select;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;


import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class VivandaStepDefinitions {

    @Before
    public void initialConfiguration(){
        setTheStage(new OnlineCast());
    }

    @Given("^the (.*) enters the vivanda page$")
    public void theUserEntersTheVivandaPage(String user) {
        theActorCalled(user).wasAbleTo(
                Access.thePageVivanda());
        
    }
    @When("^i select the desired product$")
    public void iSelectTheDesiredProduct(List<DataUser>dataUser) {
        theActorInTheSpotlight().attemptsTo(
                Select.productToBuy(dataUser));
    }

    @Then("^verify that is in the shopping cart$")
    public void verifyThatIsInTheShoppingCart(List<DataUser>dataUser) {
        theActorInTheSpotlight().should(seeThat(
                Verify.theMessageObtained(dataUser)));
    }
}
