Feature: Create a new Facebook account

Background:
Given launch the browser and url "https://www.facebook.com/"

#Scenario: User signs up for a new Facebook account

 #User signs up for a new Facebook account
   # Given the user is on the Facebook sign-up page
    #When the user enter Firstname 
    #When the user enter Lastname 
    #When the user enter Mobile number
    #When the user enter Password 
    #When the user select the DOB 
    #When the user select the Gender 
    #And the user clicks the sign-up button
    #And the user's account should be created successfully
 
 Scenario Outline: User signs up for a new Facebook account
    Given the user is on the Facebook sign-up page
    When the user enter Firstname "<FirstName>" 
    When the user enter Lastname "<LastName>" 
    When the user enter Mobile number "<mobnum>" 
    When the user enter Password "<password>"
    When the user select the DOB 
    When the user select the Gender 
    And the user clicks the sign-up button
    And the user's account should be created successfully
    
    Examples:
    |FirstName|LastName|mobnum|password|
    |Ashwanth|TS|6374777248|ashwanth@1002|
    |Thiru|SK|90003247597|thiru@3110|
    