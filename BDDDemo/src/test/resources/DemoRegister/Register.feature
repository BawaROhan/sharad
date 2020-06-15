#Author: your.email@your.domain.com
@CabBooking

Feature: Register for driver
Scenario: Successful Register with valid data
Given User is on Register Page
When User enters  valid driver data
Then User navigates to next page

Scenario Outline: Unsuccessful Register on entering invalid data
Given User is on Register page
When user enters valid firstname as "<firstName>" and invalid lastName as "<lastName>"
Then Register should be Unsuccessful
Examples:
|firstName|lastName|
|Rajesh|Kuma123|
|Rajesh|kumar222|
 
