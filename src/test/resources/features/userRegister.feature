#Autor: Joan Sebastian Prieto Contreras

  @Stories

Feature: User registration in UTest Website

  # First scenario
  Scenario: Registration of a new user in Utest website
    Given that a new user wants to register in Utest website
    When user complete the four steps of the registration forms
    # This is the list and its burned data
      | strFName | strLName | strEmail            | strMonth | strDay | strYear | strCity      | strPostalCode | strCountry | strComputerOS | strComputerVersion | strComputerOSLang | strMobileBrand | strMobileModel | strMobileOS | strPassword |
      | Sebastian     | Prieto   | prietojoan@olayista.com | October  | 7     | 2002    | Bogota       | 7777777       | Colombia   | macOS     | Monterey 12.2.1    | Swedish           | Apple          | iPhone 14 Plus | iOS 16.0    | Choucair123* |
    Then user will be successfully registered
      | strFinal       |
      | Complete Setup |