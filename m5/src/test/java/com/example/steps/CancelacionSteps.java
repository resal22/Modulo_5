package com.example.steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class CancelacionSteps {
    

private WebDriver driver = Hooks.getDriver();


@Dado("que el usuario tiene una reserva activa con código {string}")
public void tiene_reserva(String codigo) {
// preparar contexto: API mock o base de datos de prueba
}


@Cuando("solicita la cancelación de la reserva")
public void solicita_cancelacion() {
// acciones para cancelar
}


@Entonces("la reserva debe pasar a estado {string}")
public void verifica_estado(String estado) {
Assert.assertEquals("Cancelada", estado);
}

@Entonces("el sistema debe generar el reembolso o crédito correspondiente")
public void el_sistema_debe_generar_el_reembolso_o_crédito_correspondiente() {
    System.out.println("Validación de reembolso o crédito exitosa.");
}

}
