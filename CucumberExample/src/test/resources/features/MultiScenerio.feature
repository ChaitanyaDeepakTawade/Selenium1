Feature: Login Page Validation

Scenario: Validate Login Credentials
Given open google browser
When Enter "admin" and "Admin123" Click Login
Then Assert Login Page

Scenario: Validate Login with Wrong value
Given open google browser
When Enter "admin12" and "Admin12" Click Login
Then Assert Login Page