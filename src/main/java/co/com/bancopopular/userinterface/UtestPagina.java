package co.com.bancopopular.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com")
public class UtestPagina extends PageObject {
    public static final Target BOTON_LOGIN=Target.the("boton para ingresar al login de usuario").located(By.xpath("//ul[@class='nav navbar-nav']//a[text()='Log In']"));
}
