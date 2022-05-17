Feature: as a user on categories page

  @Get-allcategories
  Scenario: as user i want to see all categories with valid url
    Given user get all categories 1 api endpoints
    When user want to see all categories using valid url
    Then user succes to see all categories response code 200
    And user receive valid data for detail categories 1

  @post-createcategories
  Scenario: as user i want to create some categories with valid url and valid body
    Given user post create categories 1 api endpoints
    When user want create categories with valid url and valid body
    Then user succes create transactions respon 200 OK on create categories1
    And user receive valid data for detail categories 1
