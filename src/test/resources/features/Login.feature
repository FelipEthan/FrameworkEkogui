Feature: Login
  @Test
  Scenario Outline: Login exitoso con credenciales válidas
    Given El usuario está en la página de inicio de sesión
    When El usuario "<cedula>" y la contraseña "<contraseña>"
    And El usuario hace clic en el botón de Entrar
    Then El usuario debe ser redirigido a Ekogui

    Examples:
      | cedula     | contraseña          |
      | 1016079471 | Agentesoporte_16     |
      | 17642332   | Agentesoporte_16     |

  @Test1
  Scenario: Login exitoso con credenciales válidas rol administrador
    Given El usuario está en la página de inicio de sesión
    When Selecciona tipo documento, ingresa cedula y la contraseña
    And El usuario hace clic en el botón de Entrar
    Then El usuario debe ser redirigido a Ekogui

