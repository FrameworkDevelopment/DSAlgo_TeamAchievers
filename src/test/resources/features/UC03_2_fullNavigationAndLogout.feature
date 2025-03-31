 Feature: DS Portal Login Feature
  I want to use this template for post Login process
  
Background: User is logged into DS Algo Portal
 Given The user is logged into the DS Algo Portal with valid credentials
  
  #TC08 to TC15: Post-login scenarios     

  #TC08
  Scenario: Verify that user is able to view options for Data Structures dropdown on home page after Sign in
    When The user clicks the Data Structures dropdown after sign in 
    Then The user should be able to see six options like Arrays Linked List Stack Queue Tree Graph as dropdown options after signin

 #TC09
  Scenario: Verify that user able to navigate to Array page when Array drop down option is selected
    When The user selects Arrays from the drop down after Sign in
    Then The user should able to see Array details page

  #TC10
  Scenario: Verify that user able to navigate to Linked List page when Linked List drop down option is selected
    When The user selects Linked List from the drop down after Sign in
    Then The user should able to see Linked List details page
  #TC11
  Scenario: Verify that user able to navigate to Stack page when Stack drop down option is selected
    
    When The user selects Stack from the drop down after Sign in
    Then The user should able to see Stack details page

  #TC12
  Scenario: Verify that user able to navigate to Queue page when Queue drop down option is selected
    
    When The user selects Queue from the drop down after Sign in
    Then The user should able to see Queue details page

  #TC13
  Scenario: Verify that user able to navigate to Tree page when Tree drop down option is selected
    
    When The user selects Tree from the drop down after Sign in
    Then The user should able to see Tree details page

  #TC14
  Scenario: Verify that user able to navigate to Graph page when Graph drop down option is selected
    
    When The user selects Graph from the drop down after Sign in
    Then The user should able to see Graph details page

  #TC15
  Scenario: Verify that user able to sign out successfully when clicked on Sign Out link
    
    When The user clicks Sign Out link
    Then The user should able to sign out successfully from ds algo portal