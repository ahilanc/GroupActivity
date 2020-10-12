Feature: Validating the DemoBank site

  Background: 
    Given Launch demo bank application "http://demo.rapidtestpro.com/login.php" in browser

  Scenario Outline: To validate if user see the warning message in Account PIN page when entering invalid Password
    When User enter the "<accountNumber>"and "<password>"
    And Click the Login button
    Then User should verify the login message with "<password>"

    Examples: 
      | accountNumber | password   |
      |    1234556666 | MavDemo@02 |
      |    1234556666 | MavDemo@01 |
@test
  Scenario Outline: To validate if user can navigate to home page with valid credentials
    When User enter the "<accountNumber>"and "<password>"
    And Click the Login button
    When User enter the valid "<PIN>" and click on validate button
    Then User should navigate to Home Page successfully

    Examples: 
      | accountNumber | password   | PIN   |
      |    1234556666 | MavDemo@01 | 12345 |
  Scenario Outline: To validate if user see the warning message when any of mandatory field is missing
    When User enter the "<accountNumber>"and "<password>"
    And Click the Login button
    When User enter the valid "<PIN>" and click on validate button
    Then User should navigate to Home Page successfully
    And User clicks the FundTransfers option
    And User enters "<ReceiverBankName>" and click FundTransfers button
    Then User see the warning message when mandatory field is missing

    Examples: 
      | accountNumber | password   | PIN   | ReceiverBankName |
      |    1234556666 | MavDemo@01 | 12345 | DigiBank         |

  Scenario Outline: To validate whether user see the successful transaction message and reference number generated
    When User enter the "<accountNumber>"and "<password>"
    And Click the Login button
    When User enter the valid "<PIN>" and click on validate button
    Then User should navigate to Home Page successfully
    And User clicks the FundTransfers option
    And User enters the "<ReceiverBankName>", "<ReceiverName>", "<ReceiverAccountNumber>","<RoutingNumber>", "<Amount>", "<Date>" and "<Description>"
    And User selects the "<FundtransferType>" and clicks the FundTransfers button
    And User enter the "<AuthorizationCode>" and click validate button
    Then User checks success message and reference no
    And User checks Amount and transactionNo after transaction in account summary

    Examples: 
      | accountNumber | password   | PIN   | ReceiverBankName | ReceiverName | ReceiverAccountNumber |  | RoutingNumber | Amount | Date       | Description                 | AuthorizationCode | FundtransferType       |
      |    1234556666 | MavDemo@01 | 12345 | DigiBank         | EtherTent    |            1234567890 |  |      87654321 |     15 | 05/10/2020 | This is for Testing Purpose |            123456 | International Transfer |

  Scenario Outline: To validate whether user can see the account details
    When User enter the "<accountNumber>"and "<password>"
    And Click the Login button
    When User enter the valid "<PIN>" and click on validate button
    Then User should navigate to Home Page successfully
    And User click the account details button
    Then User should able to see all the account details

    Examples: 
      | accountNumber | password   | PIN   |
      |    1234556666 | MavDemo@01 | 12345 |
