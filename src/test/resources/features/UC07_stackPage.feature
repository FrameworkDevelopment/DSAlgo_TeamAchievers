Feature: Stack

  Scenario: Verify that the user is able to navigate to the Stack data structure page
    Given the user is in the Home page after signing in for Stack
    When the user clicks the Get Started button in the Stack Panel
    Then the user must be redirected to the Stack data structure page
    
      Scenario: Verify that user is able to navigate to Stack data structure page through dropdown
   Given the user is in the home page of DS Algo portal after signing in for Stack
    When The user selects Stack item from the drop down menu
    Then the user must be redirected to the Stack data structure page
    
      Scenario: Verify that the user is able to navigate to the operations in Stack page
   Given the user is on the Stack page after signing in
    When the user clicks the operations in Stack link
   Then the user should be redirected to the operations in Stack page
   
    Scenario: Navigate to Try Editor for Stack Data Structure
Given The user is on the operations in Stack page in the DS Algo portal
When The user clicks Try Here button on the Stack page
Then The user is redirected to a page having Editor with run button of Stack


Scenario: User clicks the Run button without entering any code
    
    Given the user is on the tryEditor page of Stack with an empty code editor
    When the user clicks on the Run button without entering any code of Stack
    Then nothing happens and no error message is displayed for Stack
    
    
   Scenario: User writes invalid Python code and clicks Run button
    
  Given the user is on the tryEditor page of Stack with an empty code editor  
   When the user writes invalid Python code in the editor of Stack and clicks the Run button
  Then the user should see an error message in an alert window of Stack
    
   Scenario: User writes valid Python code and clicks Run button
    
   Given the user is on the tryEditor page of Stack with an empty code editor
    When the user writes valid Python code for Stack in the editor and clicks the Run button
    Then the user should be able to see output in the console for Stack
   
   
   Scenario: Verify that the user is able to navigate to the implementations using collections in Stack page
   Given the user is on the Stack page after signing in
    When the user clicks the  implementations using collections Stack link
   Then the user should be redirected to the  implementations using collections in Stack page
   
    Scenario: Navigate to Try Editor for implementations Stack Data Structure
Given The user is on the implementations in Stack page in the DS Algo portal
When The user clicks Try Here button on the Stack page
Then The user is redirected to a page having Editor with run button of Stack


Scenario: User clicks the Run button without entering any code
    
    Given the user is on the tryEditor page of Stack with an empty code editor
    When the user clicks on the Run button without entering any code of Stack
    Then nothing happens and no error message is displayed for Stack
    
    
   Scenario: User writes invalid Python code and clicks Run button
    
  Given the user is on the tryEditor page of Stack with an empty code editor  
   When the user writes invalid Python code in the editor of Stack and clicks the Run button
  Then the user should see an error message in an alert window of Stack
    
   Scenario: User writes valid Python code and clicks Run button
    
   Given the user is on the tryEditor page of Stack with an empty code editor
    When the user writes valid Python code for Stack in the editor and clicks the Run button
    Then the user should be able to see output in the console for Stack
   
   
    Scenario: Verify that the user is able to navigate to the in Stack applications page
   Given the user is on the Stack page after signing in
    When the user clicks the Stack applications link
   Then the user should be redirected to the Stack applications page
   
    Scenario: Navigate to Try Editor for Stack applications Data Structure
Given The user is on the Stack applications page in the DS Algo portal
When The user clicks Try Here button on the Stack page
Then The user is redirected to a page having Editor with run button of Stack


Scenario: User clicks the Run button without entering any code
    
    Given the user is on the tryEditor page of Stack with an empty code editor
    When the user clicks on the Run button without entering any code of Stack
    Then nothing happens and no error message is displayed for Stack
    
    
   Scenario: User writes invalid Python code and clicks Run button
    
  Given the user is on the tryEditor page of Stack with an empty code editor  
   When the user writes invalid Python code in the editor of Stack and clicks the Run button
  Then the user should see an error message in an alert window of Stack
    
   Scenario: User writes valid Python code and clicks Run button
    
   Given the user is on the tryEditor page of Stack with an empty code editor
    When the user writes valid Python code for Stack in the editor and clicks the Run button
    Then the user should be able to see output in the console for Stack
    
    
    Scenario: Stack Practice Questions

Given The user is on the Stack opeartions page for practice questions in the DS Algo portal
When The user clicks Practice Questions link for Stack
Then The user is redirected to Practice Questions page for Stack.
    
    