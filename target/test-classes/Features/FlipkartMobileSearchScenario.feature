#Author: Sampa Roy

@tag
Feature: Mobile Price validation
  I want to use this template for my feature file

  @tag1
  Scenario: Validation of searched mobile price with the total price
    Given user is on Flipkart home page
#   And user close the login pop up
   And user enter search criteria
   And user click on search button
   Then validate mobile search screen is displayed
   And capture the price of first mobile
   And click on the first mobile
   Then user click on Add to cart option
   And verify the total price with the previous search page price
