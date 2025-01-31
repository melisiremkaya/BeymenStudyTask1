Feature: Regression Feature

  Scenario: Successfully Add, Update and Delete Product on Basket
    Given user is on the Beymen Home Page
    Then should see Search Area on Home Page
    When click Accept Cookies Button on Home Page
    And click to Search Box on Home Page
    And get first value in excel and type to SearchBox on Home Page
    And clear SearchBox on Home Page
    And get second value in excel and type SearchBox on Home Page
    And tap "Enter" on Keyboard
    And click randomly a Product on Product Page
    And save Product Info and Price on Product Detail Page
    And select Random Size on Product Detail Page
    And click Add to cart button on Product Detail Page
    And click Go To Basket Button on Product Detail Page
    Then check Product Prices on Basket Page
    When click Product Number Dropdown on Basket Page
    And select Product Number: "2 adet" in Dropdown list on Basket Page
    Then should see Dropdown Text: "2 adet" on Basket Page
    When click Delete Button on Basket Page
    Then should see Empty Basket Message on Basket Page