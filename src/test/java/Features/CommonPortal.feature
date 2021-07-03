Feature: Portal Login

Background: 
Given validate the browser
When Brwoser is triggered
Then check if browser is started

@PortalTest
Scenario: Home Page default login
Given User is on Application Dashboard
When User login into application with username "deepak" and password "Hphds@123#"
Then Application Dashboard is populated
Then click on new request button on the top of right hand side
And list of services displayed are "true"


@PortalTest
Scenario: Home Page default login
Given User is on Application Dashboard
When User login into application with username "deepak123" and password "Hphds@123#"
Then Application Dashboard is populated
Then click on new request button on the top of right hand side
And list of services displayed are "false"

@PortalTest
Scenario: Home Page default login
Given User is on Application Dashboard
When User sign up with following details
| deepak | saini | deepak@gmail.com | India | 143534 |
Then Application Dashboard is populated
Then click on new request button on the top of right hand side
And list of services displayed are "false"

@PortalTest
Scenario Outline: Home Page default login
Given User is on Application Dashboard
When User login in to application with username <Username> and password <Password>
Then Application Dashboard is populated
Then click on new request button on the top of right hand side
And list of services displayed are "true"

Examples:
|Username  |Password|
|user1     |pass1   |
|user2     |pass2   |
|user3     |pass3   |
|user4     |pass4   |
|user5     |pass5   |