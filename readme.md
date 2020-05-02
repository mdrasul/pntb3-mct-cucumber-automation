Project Title: 
Check Existence and non-existence of ORDER ID

Two scenarios in my feature 

Scenario A:  check the order ID existence in the table and the Title on the Order detail-page

1. logging in the Account 
2.Go to my order page 
3.switch the dropbox from date of order to Order ID 
4. Enter the Order ID number 
5. I used Scenario Outline in order to check two different order Id 65 and 54
6. I enter the number 65 and Assert if the same number is shown in the table 
7.I check if I click on the number on the table it will let me to the page of Order Details
8.once in the order details page I check the existence of all the title are available by using dataTable
9.Assert that the title Expected are the same than the actual from dataTable
10.checking takes a little time 
11. go back to order page by clicking on the button order back

feature B: check that the order Id does not exist in the table

1. using a simple scenario and an entry 04
2. Assert that the result is "No Results Found !!"
3. Go back to my account by clicking on the button back 