Feature: DSportal App HomePage


 Background:
  Given The user enter correct dsAlgo portal URL <URL>
  Then The user clicks the Get Started button
          
#TC01
@TC01
  Scenario: Verify that user is able to view options for Data Structures dropdown on home page without Sign in
    When The user clicks the Data Structures dropdown
    Then The user should be able to see six options like Arrays Linked List Stack Queue Tree Graph in dropdown menu
    
#TC02
@TC02
  Scenario: Verify that user able to see warning message while selecting Arrays from the drop down without Sign in
    When The user selects Arrays from the drop down without Sign in
    Then The user should able to see an warning message You are not logged in for Array drop down option
#
#TC03
@TC03
  Scenario: Verify that user able to see warning message while selecting Linked List from the drop down without Sign in
    When The user selects Linked List from the drop down without Sign in
    Then The user should able to see an warning message You are not logged in for Linked List drop down option
    
#TC04
@TC04
  Scenario: Verify that user able to see warning message while selecting Stack from the drop down without Sign in
    When The user selects Stack from the drop down without Sign in
    Then The user should able to see an warning message You are not logged in for Stack drop down option
    
#TC05
@TC05
  Scenario: Verify that user able to see warning message while selecting Queue from the drop down without Sign in
    When The user selects Queue from the drop down without Sign in
    Then The user should able to see an warning message You are not logged in for Queue drop down option
    
#TC06
@TC06
  Scenario: Verify that user able to see warning message while selecting Tree from the drop down without Sign in
    When The user selects Tree from the drop down without Sign in
    Then The user should able to see an warning message You are not logged in for Tree drop down option
    
#TC07
@TC07
  Scenario: Verify that user able to see warning message while selecting Graph from the drop down without Sign in.
    When The user selects Graph from the drop down without Sign in
    Then The user should able to see an warning message You are not logged in for Graph drop down option
    
#TC8
@TC08
  Scenario: Verify that user able to see warning message on clicking Get Started buttons of Data Structures-Introduction on the home page without Sign in
    When The user clicks Get Started buttons of Data Structures-Introduction on the homepage without Sign in
    Then The user should able to see an warning message You are not logged in for DS Introduction
    
#TC9
@TC09
  Scenario: Verify that user able to see warning message on clicking Get Started buttons of Array on the home page without Sign in
    
    When The user clicks Get Started buttons of Array on the homepage without Sign in
    Then The user should able to see an warning message You are not logged in for Array
#TC10
@TC10
  Scenario: Verify that user able to see warning message on clicking Get Started buttons of Linked List on the home page without Sign in
    
    When The user clicks Get Started buttons of Linked List on the homepage without Sign in
    Then The user should able to see an warning message You are not logged in for Linked List
#TC11
@TC11
  Scenario: Verify that user able to see warning message on clicking Get Started buttons of Stack on the home page without Sign in
    
    When The user clicks Get Started buttons of Stack on the homepage without Sign in
    Then The user should able to see an warning message You are not logged in for Stack
    
#TC12
@TC12
  Scenario: Verify that user able to see warning message on clicking Get Started buttons of Queue on the home page without Sign in
    
    When The user clicks Get Started buttons of Queue on the homepage without Sign in
    Then The user should able to see an warning message You are not logged in for Queue
#TC13
@TC13
  Scenario: Verify that user able to see warning message on clicking Get Started buttons of Tree on the home page without Sign in
    
    When The user clicks Get Started buttons of Tree on the homepage without Sign in
    Then The user should able to see an warning message You are not logged in for Tree
#TC14
@TC14
  Scenario: Verify that user able to see warning message on clicking Get Started buttons of Graph on the home page without Sign in
    
    When The user clicks Get Started buttons of Graph on the homepage without Sign in
    Then The user should able to see an warning message You are not logged in for Graph
