package co.com.bancopopular.stepdefinition;

import co.com.bancopopular.questions.Validar;
import co.com.bancopopular.task.Abrir;
import co.com.bancopopular.task.IngresarDatos;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import cucumber.api.java.Before;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActor;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinition {
    @Before
    public void definirEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^Ya esta en la plataforma$")
    public void yaEstaEnLaPlataforma() {
        theActor("Daniel").wasAbleTo(Abrir.laPagina());
    }

    @Cuando("^El ingrese las credenciales$")
    public void elIngreseLasCredenciales(List<String> datos) {
        theActorInTheSpotlight().attemptsTo(
                IngresarDatos.laPagina(datos.get(2),datos.get(3))
        );

    }

    @Entonces("^El vera la pantalla principal$")
    public void elVeraLaPantallaPrincipal(List<String> respuesta) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validar.texto(respuesta.get(1))));
    }


}
