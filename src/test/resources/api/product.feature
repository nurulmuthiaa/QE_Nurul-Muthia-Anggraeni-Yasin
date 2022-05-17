Feature: as a user on product id page

  @Get-productbyid
  Scenario: As user i want to get product using valid url and valid id
    Given user get product by id 1 api endpoints
    When user want to get product using valid url and valid id
    And user click button send
    Then user succes to get product by id response code 200 on get product by id 1
    And user receive valid data for get detail product 1
