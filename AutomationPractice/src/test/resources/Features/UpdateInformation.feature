Feature: User Update Personal Information

Scenario: User Update Presonal details on portal
Given User is on My Store page
When User siginito account
Then User Click on my personal information on My Account page
Then User Enter details in key and value and save them
		|First name| Amit|
		|Lastname| singh|
		|Oldpassword|123456|
		|Newpassword|12345678|
		|Confirmpassword|12345678|
		