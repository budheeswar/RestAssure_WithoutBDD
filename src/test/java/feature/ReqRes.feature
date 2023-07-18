#https://reqres.in/api/user

Feature: ReqRes API Testing

  Scenario: Testing Post Request
    Given I Have Post Request Body
    When I Hit POST request
    Then ID should be Created

  
