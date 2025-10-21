package com.example.steps;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Hooks {
private static WebDriver driver;


@Before(order = 0)
public void setUp() {
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.manage().window().maximize();
}


@After(order = 0)
public void tearDown(Scenario scenario) {
if (scenario.isFailed()) {
// Captura de pantalla (implementación según utilidades del proyecto)
}
if (driver != null) {
driver.quit();
}
}


public static WebDriver getDriver() {
return driver;
}
}