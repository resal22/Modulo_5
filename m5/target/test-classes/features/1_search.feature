@Busqueda @SmokeTest @HU-001
Feature: Búsqueda de vuelos y hoteles
Como usuario de TravelNow
Quiero buscar opciones de vuelo y hotel
Para seleccionar la mejor alternativa según ciudad y fecha


@Busqueda
Scenario Outline: Búsqueda de vuelos entre dos ciudades
Given que el usuario está en la página de inicio de TravelNow
When busca vuelos desde "<origen>" hacia "<destino>" en fecha "<fecha>"
Then debería ver una lista de resultados con opciones disponibles


Examples:
| origen | destino | fecha |
| Madrid | Barcelona | 2025-11-10 |
| Lisboa | Porto | 2025-11-15 |
| Madrid | Roma | 2025-12-01 |