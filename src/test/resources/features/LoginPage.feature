Feature: Check basic elements on Log In page
  In order to check presence of all elements, fields and validations
  As a new user

  Background: Open Log In page
    Given I open Trello Main Page
    When click on Log In button in Header on Main Page

  Scenario: The Log In Button leads to correct Log In page
    Then Log In page has text 'Log in to Trello' in Main Header
    Then page title should be 'Log in to Trello'

  Scenario Outline: Localization checking on the Log In Page
    When choose '<Language>' in Language dropdown on Log In Page
    Then Log In page has text '<Header>' in Main Header
    Examples:
      | Language       | Header             |
      | Italiano       | Accedi a Trello    |
      | Norsk (bokmål) | Logg inn på Trello |
      | English        | Log in to Trello   |

  Scenario: Login and log out successfully
    When user types E-Mail in Log In form on Log In page
    When user clicks Log In with Atlassian button on Log In page
    When user types Password in Log In form on Log In page
    When user clicks Last blue Log In button on Log In page
    Then Main Logged In page has text 'Most popular templates' in Main Header
    When log out from current profile

  Scenario: Redirect to Sign Up page
    When user clicks Sign Up link on Log In page
    Then Sign Up page has text 'Sign up for your account' in Main Header