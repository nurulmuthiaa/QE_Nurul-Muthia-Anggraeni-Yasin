Feature: as a user on login page

  @post-login
  Scenario: as a user i want to login using valid email and valid password
    Given user post login 1 api endpoints
    When user want to login using valid email and valid password
    Then user succes login respon 200 OK on login 1
    And user receive valid data for detail login 1
