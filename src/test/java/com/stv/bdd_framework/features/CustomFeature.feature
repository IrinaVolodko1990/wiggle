Business Need: good project

Feature: Individual task

  Scenario: 01. Change language on the start page
Given Start page is loaded
When User click on flag
And User click on field Region & Language
And User click on RU-russian on field Region & Language
And User click on button with text Принять
Then User should see on the page russian text



Scenario 3: Login without email
Given Account page is loaded
  When User type to password field {PASSWORD}
And User click continue button
Then User should see warningContinueMessage


Scenario 5: Return to start page 
Given Account page is loaded
When User click wiggle label
Then User should see on the page russian text


#
#Scenario Outline: 011. Input password
#When User input password <"password">
#And User clear password field
#Examples:
#|password |
#|tyui     |
#|111111   |
