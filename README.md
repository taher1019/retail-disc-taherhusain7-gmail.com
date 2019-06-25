# retail-disc-taherhusain7-gmail.com
Technology assessment on retail website : 

This repository contains two projects : 

1) A Rest based API build on Spring Boot (Folder Name : "SpringBoot"): 

The above project is an Rest API built to calculate net payable amount by user selecting the appropriate discount category under which 
the user falls. It contains a POST request call. Please refer API documentation for further details regarding request, response, and etc.

Parameters description ::

A) id mapping to discount : 

"1" -> User is employee, discount 30%,
"2" -> User is affiliate of the store, discount is 10%,
"3" -> User is customer for over 2 years, discount is 5%,
"4" -> General discount of $5 on every $100 bill.

B) amount is total bill amount.

c) grocery_amount is, amount to be deducted from bill amount to be considered for discount i.e net payable amount.

API Documentation : 

URL : https://web.postman.co/collections/3789074-82410b6a-822d-c6fd-0075-eb63be636864?workspace=b0362db1-9269-4305-8051-b0115e50562c


2) A web application build on Spring Boot (Folder Name : "RetailStoreDiscount"): 

The above repo is Spring boot project build on maven which contains a user friendly form to add billing details and displays the respective 
net payable amount depending on the user input.
URL : "http://localhost:<port>"
Ex : "http://localhost:8080"
