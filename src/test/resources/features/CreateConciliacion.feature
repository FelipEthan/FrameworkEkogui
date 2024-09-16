Feature: Create Conciliacion
  @Test2
  Scenario: Radicación rol abogado
    Given El usuario está en la página de inicio
    When Selecciona tipo documento, ingresa cedula y la contraseña
    And Hace clic en el botón de Entrar y hace clic en Crear registro
    Then El sistema solicita el numero identificador unico del caso
    And Ingresa año y consecutivo y hace clic en consultar
    Then El sistema muestra la pestaña Información Básica
    When Se diligencia la información y hace clic en Continuar

  @Test3
  Scenario: Radicación rol admin en registro
    Given El usuario está en la página de inicio
    When Selecciona tipo documento, ingresa cedula y la contraseña
    And Hace clic en el botón de Entrar y hace clic en Crear registro
    Then El sistema solicita el numero identificador unico del caso
    And Ingresa año y consecutivo y hace clic en consultar
    Then El sistema muestra la pestaña Información Básica
    When Se diligencia la información y hace clic en Continuar
