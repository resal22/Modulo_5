@Cancelacion @HU-003
Feature: Cancelación de reservas
Como usuario que ya realizó una reserva
Quiero cancelar una reserva vigente
Para recuperar el dinero según la política de la compañía


@Cancelacion
Scenario: Cancelación dentro de la ventana permitida
Given que el usuario tiene una reserva activa con código "ABC123"
When solicita la cancelación de la reserva
Then la reserva debe pasar a estado "Cancelada"
And el sistema debe generar el reembolso o crédito correspondiente