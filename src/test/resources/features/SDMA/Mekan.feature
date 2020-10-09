Feature: Blog-Post tests

#  @Mek
  Scenario: Sign In
    Given I am on the MekanHomePage page
    Then I click on userNameInput
    Then I enter "mekjanhan@gmail.com" in userNameInput
    Then I click on passwordInput
    Then I enter "Mekus_87" in passwordInput
    Then I click on signInButton
    Then I wait for 5000 milliseconds

  @Mek
  Scenario: Creating a Post
    Given I am on the MekanHomePage page
    Then I click on userNameInput
    Then I enter "mekjanhan@gmail.com" in userNameInput
    Then I click on passwordInput
    Then I enter "Mekus_87" in passwordInput
    Then I click on signInButton
    Then I wait for 5000 milliseconds
    Then I enter "My New Post" in title
    Then I enter "I am writing about my post" in postDescription
    Then I click on submitButton
    Then I wait for 5000 milliseconds

#  @Mek
  Scenario: Deleting a Post
    Given I am on the MekanHomePage page
    Then I click on userNameInput
    Then I enter "mekjanhan@gmail.com" in userNameInput
    Then I click on passwordInput
    Then I enter "Mekus_87" in passwordInput
    Then I click on signInButton
    Then I wait for 5000 milliseconds
    Then I click on deleteButton
    Then I wait for 5000 milliseconds







