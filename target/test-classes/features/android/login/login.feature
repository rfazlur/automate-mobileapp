Feature: Login on FMA
  In order to test login feature
  As a FD member
  I want login for use all feature in FMA

  Scenario: Login into FMA
    Given I am at login screen
    When I do login
    Then I can see home screen