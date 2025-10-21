@Reserva @HU-002
Feature: Reserva de vuelo y/o hotel
Como usuario autenticado
Quiero poder reservar una opción disponible
Para confirmar mi viaje


@Reserva @SmokeTest
Scenario: Reserva exitosa de vuelo
Given que el usuario está autenticado con el usuario "test_user"
And ha seleccionado un vuelo de la lista de resultados
When completa los datos de pago válidos
Then la reserva debe quedar registrada y el sistema mostrará el número de reserva
And el reporte deberá asociar la ejecución a HU-002: Reserva exitosa