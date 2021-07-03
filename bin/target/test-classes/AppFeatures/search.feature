Feature: Amazon Search

Scenario: Search a Product MacBook Pro
Given I have search a field on Amazon Page
When  I search for a product with name "Apple MacBook Pro" and price 1000
Then Product with name "Apple MacBook Pro" should be displayed
Then order id is 12345 nad username is "deepak"


Scenario: Search a Product Iphone
Given I have search a field on Amazon Page
When  I search for a product with name "Iphone" and price 1200
Then Product with name "Iphone" should be displayed
Then order id is 89765 nad username is "deepak automation"
