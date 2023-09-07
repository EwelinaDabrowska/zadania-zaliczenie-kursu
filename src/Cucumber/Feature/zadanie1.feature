Feature: User add new address to the account

  Scenario Outline: User adds first address to the account
    Given I'm on the My Store authentication page
    When I login using <login> and <passwd>
    And I enter new address <address>, <postalCode>, <city>, <phoneNumber>
    And I close page
    Examples:
      | login                          | passwd  | address    | postalCode | city   | phoneNumber |
      | "becbcxbqxyljjrhvsr@cazlv.com" | "aaaaa" | "Street 1" | "62-200"   | "City" | "123456789" |
