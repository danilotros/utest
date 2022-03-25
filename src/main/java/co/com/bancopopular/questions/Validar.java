package co.com.bancopopular.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Text;

import javax.swing.*;

import static co.com.bancopopular.userinterface.PrincipalPagina.TEXTO_PRINCIAPAL;

public class Validar implements Question<Boolean> {

    private String texto;

    public Validar(String texto) {
        this.texto = texto;
    }

    public static Validar texto(String texto) {
        return new Validar(texto);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String label= Text.of(TEXTO_PRINCIAPAL).viewedBy(actor).asString();
        JOptionPane.showMessageDialog(null,label);
        JOptionPane.showMessageDialog(null,texto);

        return label.contains(texto);
    }
}
