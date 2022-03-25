package co.com.bancopopular.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPagina {
    public static final Target CAMPO_CORREO=Target.the("campo para ingresar correo").located(By.id("username"));
    public static final Target CAMPO_CONTRA=Target.the("campo para ingresar contraseña").located(By.id("password"));
    public static final Target BOTON_INGRESAR=Target.the("campo para ingresar contraseña").located(By.xpath("//button[@name='login']"));

}
