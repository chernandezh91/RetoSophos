package co.com.test.vivanda.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageValidation {
    public static final Target VALIDATION_FIELD = Target.the("Campo de validacion").located(By.xpath("//div[contains(text(),'!Gracias! Ya guardamos tu elección')]"));
}
