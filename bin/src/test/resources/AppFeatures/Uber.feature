@All
Feature: Uber booking Feature

@Smoke 
Scenario: Booking Cab sedan
Given User wants to select a car type "sedan" from uber application
When User select car "sedan" and pick up point "Banglore" and drop location "pune"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD


@Regression
Scenario: Booking Cab suv
Given User wants to select a car type "suv" from uber application
When User select car "sedan" and pick up point "Banglore" and drop location "hyderabad"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD


@Prod
Scenario: Booking Cab for mini
Given User wants to select a car type "mini" from uber application
When User select car "sedan" and pick up point "pune" and drop location "Mumbai"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD

@Smoke @Regression
Scenario: Booking Cab i20
Given User wants to select a car type "i20" from uber application
When User select car "sedan" and pick up point "noida" and drop location "gurgaon"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD
