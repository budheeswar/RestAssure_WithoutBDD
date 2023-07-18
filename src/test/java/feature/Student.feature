
#https://dummy.restapiexample.com/api/v1/employee/1
Feature: Employee CRUD Operations

  
  Scenario: Get the Employee Data by ID
    When I Hit Get Request with Correct ID
    Then Data should fetch
    
 


 
