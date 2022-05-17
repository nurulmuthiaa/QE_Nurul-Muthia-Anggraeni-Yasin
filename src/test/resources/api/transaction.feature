Feature: as a user on orders page

  @get-alltransaction
  Scenario: As user i want to get all transactions using valid url and valid auth token
    Given user get all transaction 1 api endpoints
    When user want to get all transactions using valid url and valid auth token
    And user click button send
    Then user succes create transactions respon 200 OK on create trans 1
    And user receive valid data for all transactions1

