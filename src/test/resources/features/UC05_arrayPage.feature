Feature: Arrays

 Background: User is logged into DS Algo Portal
 Given The user is logged into the DS Algo Portal with valid credentials
 When The user clicks the Getting Started button in Array Panel
 
 # --------------------------- (Array Get Started page)---------------------------
 
  #TC01 
  #Scenario: Verify that user is able to navigate to Array page
   #Then The user should be redirected to Array page

 # --------------------------- (Arrays in Python)---------------------------

  #TC02
  #Scenario: Verify that user is able to navigate to Arrays in Python page
    #
    #When The user clicks the Arrays in Python link
    #Then The user should be redirected to Arrays in Python page
#
 #TC03
  #Scenario: Verify that user is able to navigate to try Editor page under Arrays in Python page
  #
    #When The user clicks Try Here button in Arrays in Python page
    #Then The user should be redirected to a page having an tryEditor with a Run button
#
  #TC04
  #Scenario: Verify that user sees no changes when clicked on Run button without entering code for Arrays in Python page
    #When The user clicks the Run button without entering the code in the code Editor
    #Then The user should not see any error message in the popup
#
  #TC05
  #Scenario Outline: Verify that user receives error for invalid python code for Arrays in Python page
    #When The user clicks Run button with invalid code from sheetname "<Sheetname>" and row <RowNumber>
    #Then The user should be able to see an error message in alert window
#
    #Examples: 
      #| Sheetname     | RowNumber |
      #| tryEditorCode |         1 |
#
  #TC06
  #Scenario Outline: Verify that user is able to see output for valid python code
    #When The user clicks Run button with the valid code from sheetname "<Sheetname>" and row <RowNumber>
    #Then The user should able to see output in the console
#
    #Examples: 
      #| Sheetname     | RowNumber |
      #| tryEditorCode |         0 |
      
    #---------------------------(Arrays Using List)---------------------------
   
  #TC07
  #Scenario: Verify that user is able to navigate to Arrays Using List page
    #When The user clicks the Arrays Using List link
    #Then The user should be redirected to Arrays Using List page
#
  #TC08
  #Scenario: Verify that user is able to navigate to try Editor page under Arrays Using List page
    #When The user clicks Try Here button in Arrays Using List page
    #Then The user should be redirected to a page having an tryEditor with a Run button
#
  #TC09
  #Scenario: Verify that user sees no changes when clicked on Run button without entering code for Arrays Using List page
    #When The user clicks the Run button without entering the code in the Editor for Arrays Using List section 
    #Then The user should not see any error message in the popup
  #
  #TC10
  #Scenario Outline: Verify that user receives error for invalid python code for Arrays Using List page
    #When The user clicks Run button with invalidcode from sheetname "<Sheetname>" and row <RowNumber> for Arrays Using List page 
    #Then The user should be able to see an error message in alert window
   #
#
    #Examples: 
      #| Sheetname     | RowNumber |
      #| tryEditorCode |         1 |
      #
  #TC11
  #Scenario Outline: Verify that user is able to see output for valid python code for Arrays Using List page
    #When The user clicks Run button with valid code from sheetname "<Sheetname>" and row <RowNumber> for Arrays Using List page
    #Then The user should able to see output in the console
#
    #Examples: 
      #| Sheetname     | RowNumber |
      #| tryEditorCode |         0 |
     #
   #---------------------------(Basic Operations in Lists)---------------------------
  #
 #TC12
  #Scenario: Verify that user is able to navigate to Basic Operations in Lists page
    #When The user clicks the Basic Operations in Lists link
    #Then The user should be redirected to Basic Operations in Lists page
    #
 #TC13  
 #Scenario: Verify that user is able to navigate to try Editor page under Basic Operations in Lists page
    #When The user clicks Try Here button in Basic Operations in Lists page
    #Then The user should be redirected to a page having an tryEditor with a Run button
#
#TC14
  #Scenario: Verify that user sees no changes when clicked on Run button without entering code for Basic Operations in Lists page
    #When The user clicks the Run button without entering the code in the Editor for Basic Operations in Lists section 
    #Then The user should not see any error message in the popup
#
#TC15
 #Scenario Outline: Verify that user receives error for invalid python code for Basic Operations in Lists page
    #When The user clicks Run button with invalidcode from sheetname "<Sheetname>" and row <RowNumber> for Basic Operations in Lists page 
    #Then The user should be able to see an error message in alert window
    #
    #Examples: 
      #| Sheetname     | RowNumber |
      #| tryEditorCode |         1 |
      #
      #
 #TC16
 #Scenario Outline: Verify that user is able to see output for valid python code for Basic Operations in Lists page
    #When The user clicks Run button with valid code from sheetname "<Sheetname>" and row <RowNumber> for Basic Operations in Lists page 
    #Then The user should able to see output in the console
    #
    #Examples: 
      #| Sheetname     | RowNumber |
      #| tryEditorCode |         0 |
      #
   
# --------------------------- (Applications of Array)---------------------------

#TC17
  #Scenario: Verify that user is able to navigate to Applications of Array page
    #When The user clicks the Applications of Array link
    #Then The user should be redirected to Applications of Array page
    #
#TC18
 #Scenario: Verify that user is able to navigate to try Editor page under Applications of Array page
    #When The user clicks Try Here button in Applications of Array page
    #Then The user should be redirected to a page having an tryEditor with a Run button

#TC19
  #Scenario: Verify that user sees no changes when clicked on Run button without entering code for Applications of Array page
    #When The user clicks the Run button without entering the code in the Editor for Applications of Array section 
    #Then The user should not see any error message in the popup

#TC20
 #Scenario Outline: Verify that user receives error for invalid python code for Applications of Array page
    #When The user clicks Run button with invalidcode from sheetname "<Sheetname>" and row <RowNumber> for Applications of Array page 
    #Then The user should be able to see an error message in alert window
    #
    #Examples: 
      #| Sheetname     | RowNumber |
      #| tryEditorCode |         1 |

#TC21
  #Scenario Outline: Verify that user is able to see output for valid python code for Applications of Array page
    #When The user clicks Run button with valid code from sheetname "<Sheetname>" and row <RowNumber> for Applications of Array page
    #Then The user should able to see output in the console
 #
     #Examples: 
      #| Sheetname     | RowNumber |
      #| tryEditorCode |         0 |
 #
# --------------------------- (Practice Questions page scenarios)---------------------------      
  
  #TC22
  #Scenario: Verify that user is able to navigate to list of Practice Questions under Array page
    #When The user clicks Practice Questions link of Array page
    #Then The user should be redirected to page with four Practice Questions 

  #(Practice Questions pages --> Search the array page)
  #TC23
  #Scenario: Verify that user is able to navigate to Search the array Page Practice Question
    #When The user clicks Search the array page Question link
    #Then The user should be redirected to try Editor page with a Run and Submit buttons

  #TC24
  Scenario Outline: Verify that user receives error for invalid python code for Search the array Page
    When The user clicks Run button with invalidcode from sheetname "<Sheetname>" and row <RowNumber> for Search the array practice question
    Then The user should able to see an error message in alert window

    Examples: 
      | Sheetname          | RowNumber |
      | ArrayPracticeQnsQ1 |         0 |
#
  #TC25
  #Scenario Outline: Verify that user is able to see output for valid python code
    #When The user clicks Run button with valid code from sheetname "<Sheetname>" and row <RowNumber>
    #Then The user should able to see output in the console
#
    #Examples: 
      #| Sheetname     | RowNumber |
      #| tryEditorCode |         0 |
#
  #(Practice Questions pages -->Arrays in Python -->  Max Consecutive Ones page) --> TC26 to TC28
  #TC26
  #Scenario: Verify that user is able to navigate to Max Consecutive Ones page link from Arrays in Python page
    #Given The user is in the Arrays in Python page
    #When The user clicks Practice Questions link
    #When The user clicks Max Consecutive Ones link
    #Then The user should be redirected to try Editor page with a Run button
#
  #TC27
  #Scenario Outline: Verify that user receives error for invalid python code for Max Consecutive Ones page
    #When The user clicks Run button with invalidcode from sheetname "<Sheetname>" and row <RowNumber>
    #Then The user should able to see an error message in alert window
#
    #Examples: 
      #| Sheetname     | RowNumber |
      #| tryEditorCode |         1 |
#
  #TC28
  #Scenario Outline: Verify that user is able to see output for valid python code
    #When The user clicks Run button with valid code from sheetname "<Sheetname>" and row <RowNumber>
    #Then The user should able to see output in the console
#
    #Examples: 
      #| Sheetname     | RowNumber |
      #| tryEditorCode |         0 |
#
  #(Practice Questions pages -->Arrays in Python -->  Find Numbers with Even Number of Digits) --> TC29 to TC31
  #TC29
  #Scenario: Verify that user is able to navigate to Find Numbers with Even Number of Digits Page link from Array in Python page
    #Given The user is in the Arrays in Python page
    #When The user clicks Practice Questions link
    #When The user clicks Find Numbers with Even Number of Digits link
    #Then The user should be redirected to try Editor page with a Run button
#
  #TC30
  #Scenario Outline: Verify that user receives error for invalid python code for Find Numbers with Even Number of Digits
    #When The user clicks Run button with invalidcode from sheetname "<Sheetname>" and row <RowNumber>
    #Then The user should able to see an error message in alert window
#
    #Examples: 
      #| Sheetname     | RowNumber |
      #| tryEditorCode |         1 |
#
  #TC31
  #Scenario Outline: Verify that user is able to see output for valid python code
    #When The user clicks Run button with valid code from sheetname "<Sheetname>" and row <RowNumber>
    #Then The user should able to see output in the console
#
    #Examples: 
      #| Sheetname     | RowNumber |
      #| tryEditorCode |         0 |
#
  #(Practice Questions pages -->Arrays in Python -->  Squares of a Sorted Array) --> TC32 to TC34
  #TC32
  #Scenario: Verify that user is able to navigate to Squares of a Sorted Array Page link from Array in Python page
    #Given The user is in the Arrays in Python page
    #When The user clicks Practice Questions link
    #When The user clicks Squares of a Sorted Array link
    #Then The user should be redirected to try Editor page with a Run button
#
  #TC33
  #Scenario Outline: Verify that user receives error for invalid python code for Squares of a Sorted Array page
    #When The user clicks Run button with invalidcode from sheetname "<Sheetname>" and row <RowNumber>
    #Then The user should able to see an error message in alert window
#
    #Examples: 
      #| Sheetname     | RowNumber |
      #| tryEditorCode |         1 |
#
  #TC34
  #Scenario Outline: Verify that user is able to see output for valid python code
    #When The user clicks Run button with valid code from sheetname "<Sheetname>" and row <RowNumber>
    #Then The user should able to see output in the console
#
    #Examples: 
      #| Sheetname     | RowNumber |
      #| tryEditorCode |         0 |
#
  #(Practice Questions pages --> Arrays Using List -->  Search the array page) -> TC35 to TC37
  #TC35
  #Scenario: Verify that user is able to navigate to Search the array Page link from Arrays in Python page
    #Given The user is in the Arrays Using List page
    #When The user clicks Practice Questions link
    #When The user clicks Search the array page link
    #Then The user should be redirected to try Editor page with a Run button
#
  #TC36
  #Scenario Outline: Verify that user receives error for invalid python code for Search the array Page
    #When The user clicks Run button with invalidcode from sheetname "<Sheetname>" and row <RowNumber>
    #Then The user should able to see an error message in alert window
#
    #Examples: 
      #| Sheetname     | RowNumber |
      #| tryEditorCode |         1 |
#
  #TC37
  #Scenario Outline: Verify that user is able to see output for valid python code
    #When The user clicks Run button with valid code from sheetname "<Sheetname>" and row <RowNumber>
    #Then The user should able to see output in the console
#
    #Examples: 
      #| Sheetname     | RowNumber |
      #| tryEditorCode |         0 |
#
  #(Practice Questions pages -->Arrays Using List-->  Max Consecutive Ones page) --> TC38 to TC40
  #TC38
  #Scenario: Verify that user is able to navigate to Max Consecutive Ones page link from Arrays in Python page
    #Given The user is in the Arrays Using List page
    #When The user clicks Practice Questions link
    #When The user clicks Max Consecutive Ones link
    #Then The user should be redirected to try Editor page with a Run button
#
  #TC39
  #Scenario Outline: Verify that user receives error for invalid python code for Max Consecutive Ones page
    #When The user clicks Run button with invalidcode from sheetname "<Sheetname>" and row <RowNumber>
    #Then The user should able to see an error message in alert window
#
    #Examples: 
      #| Sheetname     | RowNumber |
      #| tryEditorCode |         1 |
#
  #TC40
  #Scenario Outline: Verify that user is able to see output for valid python code
    #When The user clicks Run button with valid code from sheetname "<Sheetname>" and row <RowNumber>
    #Then The user should able to see output in the console
#
    #Examples: 
      #| Sheetname     | RowNumber |
      #| tryEditorCode |         0 |
#
  #(Practice Questions pages --> Arrays Using List -->  Find Numbers with Even Number of Digits) --> TC41 to TC43
  #TC41
  #Scenario: Verify that user is able to navigate to Find Numbers with Even Number of Digits Page link from Array in Python page
    #Given The user is in the Arrays Using List page
    #When The user clicks Practice Questions link
    #When The user clicks Find Numbers with Even Number of Digits link
    #Then The user should be redirected to try Editor page with a Run button
#
  #TC42
  #Scenario Outline: Verify that user receives error for invalid python code for Find Numbers with Even Number of Digits
    #When The user clicks Run button with invalidcode from sheetname "<Sheetname>" and row <RowNumber>
    #Then The user should able to see an error message in alert window
#
    #Examples: 
      #| Sheetname     | RowNumber |
      #| tryEditorCode |         1 |
#
  #TC43
  #Scenario Outline: Verify that user is able to see output for valid python code
    #When The user clicks Run button with valid code from sheetname "<Sheetname>" and row <RowNumber>
    #Then The user should able to see output in the console
#
    #Examples: 
      #| Sheetname     | RowNumber |
      #| tryEditorCode |         0 |
#
  #(Practice Questions pages -->Arrays Using List -->  Squares of a Sorted Array) --> TC44 to TC46
  #TC44
  #Scenario: Verify that user is able to navigate to Squares of a Sorted Array Page link from Array in Python page
    #Given The user is in the Arrays Using List page
    #When The user clicks Practice Questions link
    #When The user clicks Squares of a Sorted Array link
    #Then The user should be redirected to try Editor page with a Run button
#
  #TC45
  #Scenario Outline: Verify that user receives error for invalid python code for Squares of a Sorted Array page
    #When The user clicks Run button with invalidcode from sheetname "<Sheetname>" and row <RowNumber>
    #Then The user should able to see an error message in alert window
#
    #Examples: 
      #| Sheetname     | RowNumber |
      #| tryEditorCode |         1 |
#
  #TC46
  #Scenario Outline: Verify that user is able to see output for valid python code
    #When The user clicks Run button with valid code from sheetname "<Sheetname>" and row <RowNumber>
    #Then The user should able to see output in the console
#
    #Examples: 
      #| Sheetname     | RowNumber |
      #| tryEditorCode |         0 |
#
  #(Practice Questions pages --> Basic Operations in Lists -->  Search the array page) -> TC47 to TC49
  #TC47
  #Scenario: Verify that user is able to navigate to Search the array Page link from Arrays in Python page
    #Given The user is in the Basic Operations in Lists page
    #When The user clicks Practice Questions link
    #When The user clicks Search the array page link
    #Then The user should be redirected to try Editor page with a Run button
#
  #TC48
  #Scenario Outline: Verify that user receives error for invalid python code for Search the array Page
    #When The user clicks Run button with invalidcode from sheetname "<Sheetname>" and row <RowNumber>
    #Then The user should able to see an error message in alert window
#
    #Examples: 
      #| Sheetname     | RowNumber |
      #| tryEditorCode |         1 |
#
  #TC49
  #Scenario Outline: Verify that user is able to see output for valid python code
    #When The user clicks Run button with valid code from sheetname "<Sheetname>" and row <RowNumber>
    #Then The user should able to see output in the console
#
    #Examples: 
      #| Sheetname     | RowNumber |
      #| tryEditorCode |         0 |
#
  #(Practice Questions pages -->Basic Operations in Lists-->  Max Consecutive Ones page) --> TC50 to TC52
  #TC50
  #Scenario: Verify that user is able to navigate to Max Consecutive Ones page link from Basic Operations in Lists page
    #Given The user is in the Basic Operations in Lists page
    #When The user clicks Practice Questions link
    #When The user clicks Max Consecutive Ones link
    #Then The user should be redirected to try Editor page with a Run button
#
  #TC51
  #Scenario Outline: Verify that user receives error for invalid python code for Max Consecutive Ones page
    #When The user clicks Run button with invalidcode from sheetname "<Sheetname>" and row <RowNumber>
    #Then The user should able to see an error message in alert window
#
    #Examples: 
      #| Sheetname     | RowNumber |
      #| tryEditorCode |         1 |
#
  #TC52
  #Scenario Outline: Verify that user is able to see output for valid python code
    #When The user clicks Run button with valid code from sheetname "<Sheetname>" and row <RowNumber>
    #Then The user should able to see output in the console
#
    #Examples: 
      #| Sheetname     | RowNumber |
      #| tryEditorCode |         0 |
#
  #(Practice Questions pages --> Basic Operations in Lists -->  Find Numbers with Even Number of Digits) --> TC53 to TC55
  #TC53
  #Scenario: Verify that user is able to navigate to Find Numbers with Even Number of Digits Page link from Basic Operations in Lists page
    #Given The user is in the Basic Operations in Lists page
    #When The user clicks Practice Questions link
    #When The user clicks Find Numbers with Even Number of Digits link
    #Then The user should be redirected to try Editor page with a Run button
#
  #TC54
  #Scenario Outline: Verify that user receives error for invalid python code for Find Numbers with Even Number of Digits
    #When The user clicks Run button with invalidcode from sheetname "<Sheetname>" and row <RowNumber>
    #Then The user should able to see an error message in alert window
#
    #Examples: 
      #| Sheetname     | RowNumber |
      #| tryEditorCode |         1 |
#
  #TC55
  #Scenario Outline: Verify that user is able to see output for valid python code
    #When The user clicks Run button with valid code from sheetname "<Sheetname>" and row <RowNumber>
    #Then The user should able to see output in the console
#
    #Examples: 
      #| Sheetname     | RowNumber |
      #| tryEditorCode |         0 |
#
  #(Practice Questions pages -->Basic Operations in Lists -->  Squares of a Sorted Array) --> TC56 to TC58
  #TC56
  #Scenario: Verify that user is able to navigate to Squares of a Sorted Array Page link from Basic Operations in Lists page
    #Given The user is in the Basic Operations in Lists page
    #When The user clicks Practice Questions link
    #When The user clicks Squares of a Sorted Array link
    #Then The user should be redirected to try Editor page with a Run button
#
  #TC57
  #Scenario Outline: Verify that user receives error for invalid python code for Squares of a Sorted Array page
    #When The user clicks Run button with invalidcode from sheetname "<Sheetname>" and row <RowNumber>
    #Then The user should able to see an error message in alert window
#
    #Examples: 
      #| Sheetname     | RowNumber |
      #| tryEditorCode |         1 |
#
  #TC58
  #Scenario Outline: Verify that user is able to see output for valid python code
    #When The user clicks Run button with valid code from sheetname "<Sheetname>" and row <RowNumber>
    #Then The user should able to see output in the console
#
    #Examples: 
      #| Sheetname     | RowNumber |
      #| tryEditorCode |         0 |
#
  #(Practice Questions pages --> Applications of Array -->  Search the array page) -> TC59 to TC61
  #TC59
  #Scenario: Verify that user is able to navigate to Search the array Page link from Applications of Array page
    #Given The user is in the Applications of Array page
    #When The user clicks Practice Questions link
    #When The user clicks Search the array page link
    #Then The user should be redirected to try Editor page with a Run button
#
  #TC60
  #Scenario Outline: Verify that user receives error for invalid python code for Search the array Page
    #When The user clicks Run button with invalidcode from sheetname "<Sheetname>" and row <RowNumber>
    #Then The user should able to see an error message in alert window
#
    #Examples: 
      #| Sheetname     | RowNumber |
      #| tryEditorCode |         1 |
#
  #TC61
  #Scenario Outline: Verify that user is able to see output for valid python code
    #When The user clicks Run button with valid code from sheetname "<Sheetname>" and row <RowNumber>
    #Then The user should able to see output in the console
#
    #Examples: 
      #| Sheetname     | RowNumber |
      #| tryEditorCode |         0 |
#
  #(Practice Questions pages --> Applications of Array-->  Max Consecutive Ones page) --> TC62 to TC64
  #TC62
  #Scenario: Verify that user is able to navigate to Max Consecutive Ones page link from Applications of Array page
    #Given The user is in the Applications of Array page
    #When The user clicks Practice Questions link
    #When The user clicks Max Consecutive Ones link
    #Then The user should be redirected to try Editor page with a Run button
#
  #TC63
  #Scenario Outline: Verify that user receives error for invalid python code for Max Consecutive Ones page
    #When The user clicks Run button with invalidcode from sheetname "<Sheetname>" and row <RowNumber>
    #Then The user should able to see an error message in alert window
#
    #Examples: 
      #| Sheetname     | RowNumber |
      #| tryEditorCode |         1 |
#
  #TC64
  #Scenario Outline: Verify that user is able to see output for valid python code
    #When The user clicks Run button with valid code from sheetname "<Sheetname>" and row <RowNumber>
    #Then The user should able to see output in the console
#
    #Examples: 
      #| Sheetname     | RowNumber |
      #| tryEditorCode |         0 |
#
  #(Practice Questions pages --> Applications of Array  -->  Find Numbers with Even Number of Digits) --> TC65 to TC67
  #TC65
  #Scenario: Verify that user is able to navigate to Find Numbers with Even Number of Digits Page link from Applications of Array page
    #Given The user is in the Applications of Array page
    #When The user clicks Practice Questions link
    #When The user clicks Find Numbers with Even Number of Digits link
    #Then The user should be redirected to try Editor page with a Run button
#
  #TC66
  #Scenario Outline: Verify that user receives error for invalid python code for Find Numbers with Even Number of Digits
    #When The user clicks Run button with invalidcode from sheetname "<Sheetname>" and row <RowNumber>
    #Then The user should able to see an error message in alert window
#
    #Examples: 
      #| Sheetname     | RowNumber |
      #| tryEditorCode |         1 |
#
  #TC67
  #Scenario Outline: Verify that user is able to see output for valid python code
    #When The user clicks Run button with valid code from sheetname "<Sheetname>" and row <RowNumber>
    #Then The user should able to see output in the console
#
    #Examples: 
      #| Sheetname     | RowNumber |
      #| tryEditorCode |         0 |
#
  #(Practice Questions pages --> Applications of Array  -->  Squares of a Sorted Array) --> TC68 to TC70
  #TC68
  #Scenario: Verify that user is able to navigate to Squares of a Sorted Array Page link from Basic Operations in Lists page
    #Given The user is in the Applications of Array page
    #When The user clicks Practice Questions link
    #When The user clicks Squares of a Sorted Array link
    #Then The user should be redirected to try Editor page with a Run button
#
  #TC69
  #Scenario Outline: Verify that user receives error for invalid python code for Squares of a Sorted Array page
    #When The user clicks Run button with invalidcode from sheetname "<Sheetname>" and row <RowNumber>
    #Then The user should able to see an error message in alert window
#
    #Examples: 
      #| Sheetname     | RowNumber |
      #| tryEditorCode |         1 |
#
  #TC70
  #Scenario Outline: Verify that user is able to see output for valid python code
    #When The user clicks Run button with valid code from sheetname "<Sheetname>" and row <RowNumber>
    #Then The user should able to see output in the console
#
    #Examples: 
      #| Sheetname     | RowNumber |
      #| tryEditorCode |         0 |
