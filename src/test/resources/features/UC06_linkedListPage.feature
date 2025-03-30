Feature: Linked List

 Background: User is logged into DS Algo Portal
 Given The user is logged into the DS Algo Portal with valid credentials
 When The user clicks the Get Started button of Linked List section
 
 
#TC01
  Scenario: Verify that user is able to navigate to Linked List page
    Then The user should be directed to Linked List page
    
    #---------------------(Introduction page)------------------------------

  #TC02(Introduction page)
  Scenario: Verify that user is able to navigate to Introduction page
    When The user clicks the Introduction link
    Then The user should be redirected to Introduction page

  #TC03
  Scenario: Verify that user is able to navigate to try Editor page under introduction page
    When The user clicks Try Here button in Introduction page
    Then The user should be redirected to a page having an tryEditor with a Run button
    
  #TC04
  Scenario: Verify that user sees no changes when clicked on Run button without entering code for introduction page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should not see any error message as an alert

  #TC05
  Scenario Outline: Verify that user receives error for invalid python code for Introduction page
    When The user clicks Run button with invalid code from sheetname "<Sheetname>" and row <RowNumber> for Introduction page
    Then The user should be able to see an error message in alert window

    Examples: 
      | Sheetname     | RowNumber |
      | tryEditorCode |         1 |

  #TC06
  Scenario Outline: Verify that user is able to see output for valid python code for Introduction page
    When The user clicks Run button with valid code from sheetname "<Sheetname>" and row <RowNumber> for Introduction page
    Then The user should able to see output in the console

    Examples: 
      | Sheetname     | RowNumber |
      | tryEditorCode |         0 |

  #---------------------(Creating Linked LIst page)------------------------------
  
  #TC07
  Scenario: Verify that user is able to navigate to Creating Linked LIst page
    When The user clicks the Creating Linked LIst link
    Then The user should be redirected to  Creating Linked LIst link page

  #TC08
  Scenario: Verify that user is able to navigate to try Editor page under Creating Linked LIst page
    When The user clicks Try Here button in Creating Linked LIst page
    Then The user should be redirected to a page having an tryEditor with a Run button
    
  #TC09  
    Scenario: Verify that user sees no changes when clicked on Run button without entering code for Creating Linked LIst page
    When The user clicks the Run button without entering the code in the Editor for Creating Linked LIst page
    Then The user should not see any error message as an alert

  #TC10
  Scenario Outline: Verify that user receives error for invalid python code for Creating Linked LIst page
    When The user clicks Run button with invalid code from sheetname "<Sheetname>" and row <RowNumber> for Creating Linked LIst page
    Then The user should be able to see an error message in alert window

    Examples: 
      | Sheetname     | RowNumber |
      | tryEditorCode |         1 |

  #TC11
  Scenario Outline: Verify that user is able to see output for valid python code for Creating Linked LIst page
    When The user clicks Run button with valid code from sheetname "<Sheetname>" and row <RowNumber> for Creating Linked LIst page
    Then The user should able to see output in the console

    Examples: 
      | Sheetname     | RowNumber |
      | tryEditorCode |         0 |

 #---------------------------------(Types of Linked List page)-----------------------------------------
#TC12
  Scenario: Verify that user is able to navigate to Types of Linked List page
    When The user clicks the Types of Linked List page link
    Then The user should be redirected to Types of Linked List page

 #TC13
  Scenario: Verify that user is able to navigate to try Editor page under Types of Linked List page
    When The user clicks Try Here button in Types of Linked List page
    Then The user should be redirected to a page having an tryEditor with a Run button
    
  #TC14 
    Scenario: Verify that user sees no changes when clicked on Run button without entering code for Types of Linked List page
    When The user clicks the Run button without entering the code in the Editor for Types of Linked List page
    Then The user should not see any error message as an alert

  #TC15
  Scenario Outline: Verify that user receives error for invalid python code for Types of Linked List page
    When The user clicks Run button with invalid code from sheetname "<Sheetname>" and row <RowNumber> for Types of Linked List page
    Then The user should be able to see an error message in alert window

    Examples: 
      | Sheetname     | RowNumber |
      | tryEditorCode |         1 |

  #TC16
  Scenario Outline: Verify that user is able to see output for valid python code for Types of Linked List page
    When The user clicks Run button with valid code from sheetname "<Sheetname>" and row <RowNumber> for Types of Linked List page
    Then The user should able to see output in the console

    Examples: 
      | Sheetname     | RowNumber |
      | tryEditorCode |         0 |
      
    #---------------------------------(Implement Linked List in Python)-----------------------------------------
    
    #TC17
  Scenario: Verify that user is able to navigate to Implement Linked List in Python page
    When The user clicks the Implement Linked List in Python page link
    Then The user should be redirected to Implement Linked List in Python page

 #TC18
  Scenario: Verify that user is able to navigate to try Editor page under Types of Linked List page
    When The user clicks Try Here button in Implement Linked List in Python page
    Then The user should be redirected to a page having an tryEditor with a Run button
    
  #TC19
    Scenario: Verify that user sees no changes when clicked on Run button without entering code for Implement Linked List in Python page
    When The user clicks the Run button without entering the code in the Editor for Implement Linked List in Python page
    Then The user should not see any error message as an alert

  #TC20
  Scenario Outline: Verify that user receives error for invalid python code for Implement Linked List in Python page
    When The user clicks Run button with invalid code from sheetname "<Sheetname>" and row <RowNumber> for Implement Linked List in Python page
    Then The user should be able to see an error message in alert window

    Examples: 
      | Sheetname     | RowNumber |
      | tryEditorCode |         1 |

  #TC21
  Scenario Outline: Verify that user is able to see output for valid python code for Implement Linked List in Python page
    When The user clicks Run button with valid code from sheetname "<Sheetname>" and row <RowNumber> for Implement Linked List in Python page
    Then The user should able to see output in the console

    Examples: 
      | Sheetname     | RowNumber |
      | tryEditorCode |         0 |
      
    #---------------------------------(Traversal)-----------------------------------------
    
        #TC22
  Scenario: Verify that user is able to navigate to Traversal page
    When The user clicks the Traversal page link
    Then The user should be redirected to Traversal page

 #TC23
  Scenario: Verify that user is able to navigate to try Editor page under Traversal page
    When The user clicks Try Here button in Traversal page
    Then The user should be redirected to a page having an tryEditor with a Run button
    
  #TC24
    Scenario: Verify that user sees no changes when clicked on Run button without entering code for Traversal page
    When The user clicks the Run button without entering the code in the Editor for Traversal page
    Then The user should not see any error message as an alert

  #TC25
  Scenario Outline: Verify that user receives error for invalid python code for Traversal page
    When The user clicks Run button with invalid code from sheetname "<Sheetname>" and row <RowNumber> for Traversal page
    Then The user should be able to see an error message in alert window

    Examples: 
      | Sheetname     | RowNumber |
      | tryEditorCode |         1 |

  #TC26
  Scenario Outline: Verify that user is able to see output for valid python code for Traversal page
    When The user clicks Run button with valid code from sheetname "<Sheetname>" and row <RowNumber> for Traversal page
    Then The user should able to see output in the console

    Examples: 
      | Sheetname     | RowNumber |
      | tryEditorCode |         0 |
      
   #---------------------------------(Insertion)-----------------------------------------
    
  #TC27
  Scenario: Verify that user is able to navigate to Insertion page
    When The user clicks the Insertion page link
    Then The user should be redirected to Insertion page

 #TC28
  Scenario: Verify that user is able to navigate to try Editor page under Insertion page
    When The user clicks Try Here button in insertion page
    Then The user should be redirected to a page having an tryEditor with a Run button
    
  #TC29
    Scenario: Verify that user sees no changes when clicked on Run button without entering code for Insertion page
    When The user clicks the Run button without entering the code in the Editor for Insertion page
    Then The user should not see any error message as an alert

  #TC30
  Scenario Outline: Verify that user receives error for invalid python code for Insertion page
    When The user clicks Run button with invalid code from sheetname "<Sheetname>" and row <RowNumber> for Insertion page
    Then The user should be able to see an error message in alert window

    Examples: 
      | Sheetname     | RowNumber |
      | tryEditorCode |         1 |

  #TC31
  Scenario Outline: Verify that user is able to see output for valid python code for Insertion page
    When The user clicks Run button with valid code from sheetname "<Sheetname>" and row <RowNumber> for Insertion page
    Then The user should able to see output in the console

   Examples: 
      | Sheetname     | RowNumber |
      | tryEditorCode |         0 |
 
   #---------------------------------(Deletion)----------------------------------------------------------------------------------------------

  #TC032 
  Scenario: Verify that user is able to navigate to Deletion page
    When The user clicks the Deletion page link
    
  #TC033
  Scenario: Verify that user is able to navigate to try Editor page under Deletion page
    When The user clicks Try Here button in Deletion page
    Then The user should be redirected to a page having an tryEditor with a Run button

  #TC034
  Scenario: Verify that user sees no changes when clicked on Run button without entering code for Deletion page
    When The user clicks the Run button without entering the code in the Editor for Deletion page
    Then The user should not see any error message as an alert
    
  #TC035
   Scenario Outline: Verify that user receives error for invalid python code for Deletion page
    When The user clicks Run button with invalid code from sheetname "<Sheetname>" and row <RowNumber> for Deletion page
    Then The user should be able to see an error message in alert window

    Examples: 
      | Sheetname     | RowNumber |
      | tryEditorCode |         1 |

 #TC36
  Scenario Outline: Verify that user is able to see output for valid python code for Deletion page
    When The user clicks Run button with valid code from sheetname "<Sheetname>" and row <RowNumber> for Deletion page
    Then The user should able to see output in the console

   Examples: 
      | Sheetname     | RowNumber |
      | tryEditorCode |         0 |

 #-------------#Practice Questions page scenarios from all sub pages under Linked List DS -> TC37 to TC43-------------------------------------------------------------------------
  
  
  #TC37 (Practice Questions page)
  Scenario: Verify that user is able to navigate to Practice Questions page from the Introduction page
    When The user clicks Practice Questions link from Introduction Page
    Then The user should see list of Practice Questions 
    
  #TC38
  Scenario: Verify that user is able to navigate to Practice Questions page from the Creating Linked List page
    When The user clicks Practice Questions link from Creating Linked List Page
    Then The user should see list of Practice Questions 

  #TC39
  Scenario: Verify that user is able to navigate to Practice Questions page from the Types of Linked List page
    When The user clicks Practice Questions link from Types of Linked List Page
    Then The user should see list of Practice Questions 
    
  #TC40
  Scenario: Verify that user is able to navigate to Practice Questions page from the Implement Linked List in Python page
    When The user clicks Practice Questions link from Implement Linked List in Python Page
    Then The user should see list of Practice Questions 

  #TC41
  Scenario: Verify that user is able to navigate to Practice Questions page from the Traversal page
    When The user clicks Practice Questions link from Traversal Page
    Then The user should see list of Practice Questions 

  #TC42
  Scenario: Verify that user is able to navigate to Practice Questions page from the Insertion page
    When The user clicks Practice Questions link from Insertion Page
    Then The user should see list of Practice Questions 

  #TC43
  Scenario: Verify that user is able to navigate to Practice Questions page from the Deletion page
    When The user clicks Practice Questions link from Deletion Page
    Then The user should see list of Practice Questions 
