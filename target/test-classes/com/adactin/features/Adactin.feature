Feature: Hotel Booking In Adactin Application
@SmokeTest
Scenario Outline: A
Given User Launch The Application
When User Enter The "<username>" In Username Field
And User Enter The "<password>" In Password Field
Then User Click On The Login Button And It Navigates To The Search Hotel
Examples:

|username|password|
|fgvhgf|34ecfd|
|sRaguram|noway008|
@SanityTest
Scenario: B
When User Select The Hotel Location
And User Select The Hotel
And User Select The Room Type
And User Select Number Of Room Required
And User Select Check In Date
And User Select Check Out Date
And User Select Adults Per Room
And User Select Children Per Room
Then User Click On The Search Button And It Navigates To The Select Hotel
@SanityTest
Scenario: C
When User Select The Select Radio Button 
Then User Click On The Continue Button And It Navigates To Book A Hotel
@SanityTest
Scenario: D
When User Enter The First Name 
And User Enter The Last Name
And User Enter The Billing Address
And User Enter The Credit Card No
And User Enter The Credit Card Type 
And User Select The Expiry Month In The Expiry Date
And User Select The Expiry Year In  The Expiry Date
And User Enter The Cvv Numbe
Then User Click On The Book Now Button And It Navigates To Booking Confirm
@RegressionTest
Scenario: E
Then User Click On The Logout Button 