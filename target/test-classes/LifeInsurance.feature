Feature: Life Insurance quotation on comparethemarket website

  Scenario: Completing Life Insurance quotation form

    Given user is on www.comparethemarket.com/life-insurance/
    When user clicks on Get a quote
    And user clicks on Just myself for single quote
    And user selects relevant title
    And user provides first name
    And user provides surname
    And user selects the date of birth
    And user selects relevant smoking option
    And user selects relevant cover type
    And user provides duration of cover
    And user provides the amount of required cover
    And user clicks on critical illness cover
    And user clicks on Additional critical illness cover
    And user provides the amount of additional critical illness cover
    And user provides email address
    And user provides phone number
    And user provides house number
    And user provides postcode
    And user clicks on Find address
    And user selects on preferred contact
    And user clicks on confirm
    And user clicks on Get your quotes
    And user should be able to see all quotations
    And user clicks on remove critical illness cover
    And user clicks on update result
    Then user should be able to see updated quotation
