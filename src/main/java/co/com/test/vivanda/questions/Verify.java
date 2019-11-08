package co.com.test.vivanda.questions;

import co.com.test.vivanda.model.DataUser;
import co.com.test.vivanda.userinterface.PageValidation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import java.util.List;
import static co.com.test.vivanda.util.Constat.ZERO;

public class Verify implements Question<Boolean> {
    public List<DataUser>dataUsers;
    private Verify(List<DataUser> dataUsers) {
        this.dataUsers=dataUsers;
    }
    public static Verify theMessageObtained(List<DataUser> dataUsers) {
        return new Verify(dataUsers);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String valdiationField = Text.of(PageValidation.VALIDATION_FIELD).viewedBy(actor).asString().trim();
        return(dataUsers.get(ZERO).getVerifyField().equals(valdiationField));
    }
}



