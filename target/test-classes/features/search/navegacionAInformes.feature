# Author: Fredy Montaña

@Regresion
Feature: Como usuario de la aplicación banca virtual quiero ingresar a la sección de informes para validar si sew están generando de manera correcta

  Scenario: Como usuario de la banca virtual quiero ingresar a la sección corporativos para buscar el informe OPEP y validar que se ha generado correctamente
    Given el usuario se encuentra en la pantalla principal de la banca virtual
    When el usuario ingresa a la sección corporativos
    When el usuario está en corporativos hace clic en la opción Capital inteligente de la navegación
    Then el usuario ingresa a la sección Actualidad económica