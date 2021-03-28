Feature: To automate Timpson page

Background:
Given User is in Timpson page

@Smoke
Scenario: To validate End to End automation
When User enters valid emailId & password and clicks login
			|waltervetrivel737@gmail.com|walter4609|
And User searchs Zippo Lighters and add to cart
And User searchs Zippo Accessories and add to cart
And User gives add to cart
And User enters personal detials
Then User displyed with Payment Detials

@s1
Scenario Outline: To verify login functionality
When User enters invalid emailId and valid password




