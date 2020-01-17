#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Regresion
Feature: Formulario Popup Validation
  El usuario debe poder ingresar al formulario los datos requeridos.
  Cada campo del usuario realiza validaciones de obligatoriedad,
  longitud y formato, el sistema debe presentar las validaciones respectivas
  para cada campo a través un globo informativo.
  
  @CasoExitoso
  Scenario: Diligenciamiento exitoso del formulario Popup Validation,
  					no se presenta nigún mensaje de validación.
    Given Autentico en colorlib con usuario "demo" y clave "demo"
    And Ingreso a la funcionalidad Forms Validation
    When Diligencio Formulario Forms validation
|Required |Select  |MultipleS1 |MultipleS2 |Url										|Email             |Password1|Password2|MinSize|MaxSize |Number |IP          |Date       |DateEarlier|
|valor1		|Golf    |Tennis	   |Golf		   |http://www.valor1.com |valor1@mail.com   |valor1   |valor9   |123456 |123456  |-99.99 |200.200.5.4 |2018-01-22 |2015/09/12 |
|Valor2   |Tennis  |Golf       |Football	 |http://www.msmertycom |elmejor@gmail.com |valor2   |valor7   |456456 |123456  |-99.99 |200.200.5.4 |2018-01-30 |2012/09/12 |
|valor1		|Football|Football	 |Golf		   |http://www.hotmail.com|eri@hotmail.com   |valor3   |valor6   |489456 |123456  |-99.99 |200.200.5.4 |2018-01-19 |2016/09/12 |
|Valor2   |Golf    |Tennis	   |Golf		   |http://www.sura546com |ejemplo@mail.com  |valor4   |valor6   |569856 |123456  |-99.99 |200.200.5.4 |2018-01-21 |2019/09/12 |
    Then Verifico ingreso exitoso
    
    @CasoAlterno
  Scenario: Diligenciamiento con errores del formulario Popup Validation,
  					se presenta Globo Informativo error en el diligenciamiento de alguno de los campos.
    Given Autentico en colorlib con usuario "demo" y clave "demo"
    And Ingreso a la funcionalidad Forms Validation
    When Diligencio Formulario Forms validation
|Required |Select |MultipleS1|MultipleS2 |Url										|Email           |Password1|Password2|MinSize|MaxSize |Number |IP          |Date       |DateEarlier|
|				  |Golf   |Tennis	   |Golf		   |http://www.valor1.com |valor1@mail.com |valor1   |valor1   |123456 |123456  |-99.99 |200.200.5.4 |2018-01-22 |2012/09/12 |
|Valor2   |Golf   |Tennis	   |Golf		   |    ://www.valor1     |valor1@mail.com |valor1   |valor1   |123456 |123456  |-99.99 |200.200.5.4 |2018-01-22 |2012/09/12 |
    Then Verificar que se presente Globo Informativo de validación
