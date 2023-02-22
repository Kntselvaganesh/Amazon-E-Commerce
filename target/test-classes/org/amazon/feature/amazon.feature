Feature: Validate A Shopping Functionality in Amazon Web Application

  @Amazon1
  Scenario: Home Page
    Given user Launch The Amazon Url
    When user Move The Cursor into Signin Menu
    Then user Click The Sign In button And It Navigate To Login Page

  @Amazon2
  Scenario: Login Page
    When user Enter The Email Id In The Email Or Mobile Number Field
    Then user Click The Continue button And It Navigate To Password Page

  @Amazon3
  Scenario: Password Page
    When user Enter The Password In The Password Field
    Then user Click The Sign In button And It Navigate To The Next Page

  @Amazon4
  Scenario: Welcome Page
    When user Click on Category Dropdown in Categore Dropdown
    And user Select Clothing and Accessories in Category Dropdown
    And user Enter Sparx Men SS105 Slippers in the Search Bar
    Then user Click The Search button And It Navigates To The Next Page

  @Amazon5
  Scenario: Product Page
    Then user Click on Productc And It Navigates To The Next Page
    
   @Amazon6
   Scenario: Product Confirmation Page
   When user Click The Size
   And user Click The Add To Cart button
    
