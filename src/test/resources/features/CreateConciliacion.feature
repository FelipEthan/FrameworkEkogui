Feature: Create Conciliacion
  @Test2
  Scenario: Radicación rol abogado
    Given El usuario está en la página de inicio
    When Selecciona tipo documento, ingresa cedula y la contraseña
    And Hace clic en el botón de Entrar y hace clic en Crear registro
    Then El sistema solicita el numero identificador unico del caso
    And Ingresa año y consecutivo y hace clic en consultar
    Then El sistema muestra la pestaña Información Básica
    And Se diligencia la información básica y se hace clic en Continuar
    And Se diligencia Hechos y causas de la solicitud y se hace clic en Continuar
    And Se diligencia Valor económico de la solicitud y se hace clic en Continuar
    And Se diligencia Admisión de la solicitud y se hace clic en Continuar
    Then El sistema radica la conciliación extrajudicial














  @Test3
  Scenario: Radicación rol admin en registro
    Given El usuario está en la página de inicio
    When Selecciona tipo documento, ingresa cedula y la contraseña
    And Hace clic en el botón de Entrar y hace clic en Crear registro
    Then El sistema solicita el numero identificador unico del caso
    And Ingresa año y consecutivo y hace clic en consultar
    Then El sistema muestra la pestaña Información Básica
    When Se diligencia la información y hace clic en Continuar
