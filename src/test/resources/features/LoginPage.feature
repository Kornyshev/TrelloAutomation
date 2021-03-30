Feature: Check basic elements on Log In page
  In order to check presence of all elements, fields and validations
  As a new user

  Scenario: The Log In Button leads to correct Log In page
    Given I open Trello Main Page
    When click on Log In button in Header on Main Page
    Then Log In page have correct 'Log in to Trello' in Main Header
    Then page title should be 'Log in to Trello'

  Scenario Outline: Localization checking on the Log In Page
    When choose '<Language>' in Language dropdown on Log In Page
    Then Log In page have correct '<Header>' in Main Header
    Examples:
      | Language       | Header              |
      | Italiano       | Accedi a Trello     |
      | Norsk (bokmål) | Logg inn på Trello  |
      | English        | Log in to Trello    |