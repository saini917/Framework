Feature: Service Page on Hphds

@SmokeTest
Scenario: Home Page default login
Given User is on Application Dashboard
When User login into application with username "deepak" and password "Hphds@123#"
Then Application Dashboard is populated
Then click on new request button on the top of right hand side
And list of services displayed are "true"








