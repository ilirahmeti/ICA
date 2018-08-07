@mobile-regression @mobile-slideSplashScreen

  Feature: Slide the Splash screen

    Scenario: Verify user should be able to slide right on tutorial pages
      Given I am on Splash screen of the ionic conference app
      When I swipe right 3 times on tutorials slides
      Then I verify Continue button is displayed