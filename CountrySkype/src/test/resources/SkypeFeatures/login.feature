Feature: Log in to Skype

  Background: User is already registered with Skype

  @smoketest
  Scenario: Successful Login
    Given User navigates to url
    When User enters valid credentials
      | 9082932159 | ABCDEfghijk&987654321 |
    Then user should click on setting and add photo and upload
    And user should come back to accounts and pictures and clicks on edit for birthday
    Then user should click on contacts send invites and add contact
    Then user should click on setting and customize appearance and audio and video 
    Then user should customize calling and messaging and notification
    
    
    
    

    