package com.example.steps;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;


public class SearchSteps {
  





private WebDriver driver = Hooks.getDriver();


@Dado("que el usuario está en la página de inicio de TravelNow")
public void usuario_en_home() {
driver.get("https://www.google.com");//agregue una pagina cualquiera para probar q abre
}


@Cuando("busca vuelos desde {string} hacia {string} en fecha {string}")
public void busca_vuelos(String origen, String destino, String fecha) {
// Implementación: interacción con la UI (buscar campos, completar y enviar)
// Ejemplo: HomePage.enterOrigen(origen).enterDestino(destino).selectFecha(fecha).buscar();
}


@Entonces("debería ver una lista de resultados con opciones disponibles")
public void verifica_resultados() {
// Assert que la lista no esté vacía
Assert.assertTrue(true); // cambiar por verificación real
}
}
    

