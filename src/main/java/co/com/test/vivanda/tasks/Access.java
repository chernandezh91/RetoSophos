package co.com.test.vivanda.tasks;

import co.com.test.vivanda.userinterface.HomePageVivanda;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Access implements Task {

    public HomePageVivanda homePageVivanda;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(homePageVivanda));
    }

    public static Access thePageVivanda(){
        return Tasks.instrumented(Access.class);
    }
}
