Feature: Ingresar a la web de Bancolombia

Scenario: Descargar pdf
     Given Selecciona personas
     When Ir a boton de producto y servicios
     When Oprime boton inversiones
     When Oprimir Inversion virtual
     When Descarga  “Reglamento Inversion Virtual Bancolombia.pdf”
     Then Validar pdf


