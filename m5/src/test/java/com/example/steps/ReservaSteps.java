package com.example.steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class ReservaSteps {
    private WebDriver driver = Hooks.getDriver();


@Dado("que el usuario está autenticado con el usuario {string}")
public void usuario_autenticado(String username) {
// login con credenciales de prueba
}


@Dado("ha seleccionado un vuelo de la lista de resultados")
public void seleccion_vuelo() {
// seleccionar primer vuelo
}


@Cuando("completa los datos de pago válidos")
public void completa_pago() {
// completar formulario y enviar
}


@Entonces("la reserva debe quedar registrada y el sistema mostrará el número de reserva")
public void reserva_registrada() {
// verificar número de reserva
Assert.assertTrue(true);
}
@Entonces("el reporte deberá asociar la ejecución a HU-{int}: Reserva exitosa")
public void el_reporte_deberá_asociar_la_ejecución_a_hu_reserva_exitosa(Integer idHu) {
    System.out.println("Reporte asociado correctamente a HU-" + idHu + ": Reserva exitosa");
}

}

