package co.com.test.vivanda.tasks;

import co.com.test.vivanda.model.DataUser;
import static co.com.test.vivanda.userinterface.HomePage.*;
import static co.com.test.vivanda.util.Constat.ZERO;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.type.Type;
import org.openqa.selenium.Keys;

import java.util.List;

public class Select implements Task {

    private List<DataUser>dataUsers;

    public Select(List<DataUser> dataUsers) {
        this.dataUsers = dataUsers;
    }

    public static Select productToBuy(List<DataUser> dataUser) {
        return Tasks.instrumented(Select.class,dataUser);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Type.theValue(dataUsers.get(ZERO).getNameProduct()).into(AREA_SEARCH),
                Hit.the(Keys.ENTER).into(AREA_SEARCH),
                Scroll.to(SCROLL_SECTION_PRODUCT),
                Click.on(PRODUCT),
                Click.on(ADD_CART),
                Click.on(STORE),
                Click.on(PROVINCE),
                Click.on(NEXT));
    }
}
