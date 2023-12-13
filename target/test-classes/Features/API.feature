@api

Feature: To test the API

  Scenario: To test the C2TA Endpoints
    Given To setup the BaseURI
    When To post the C2TA request
    And To get the response in C2TA
    Then To validate the response
    When To put the C2TA request
    Then To validate the update data
    When To dalete the data
