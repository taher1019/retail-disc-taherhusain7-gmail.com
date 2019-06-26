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



Have already created two different projects on different folder under git repository.

Git URL : 

After you clone the git repository you will have two folders created : 

Note : Apache maven should be installed and configured for the projects to run any maven plugin should be installed in the eclipse.


A) 1st Folder named SpringBoot is a rest API build on Spring framework is a Maven build project, hence import this as a maven project in any IDE.

Refer API documentation URL provided in Readme file of GitHub, also attaching the same in the email as well.

API documentation URL : https://web.postman.co/collections/3789074-82410b6a-822d-c6fd-0075-eb63be636864?workspace=b0362db1-9269-4305-8051-b0115e50562c

Steps to run this project : 

1) Import as existing maven project, and a maven structure project will be created inside IDE named "SpringBoot".

2) Right click on project, select run as java application.

3) Select Main.java as runtype class and click on ok.

4) Project will run on 8080 port. and url : "http://localhost:8080" 

5) Test the API under any API testing tools such as postman.

6) Select POST method, URL : "http://localhost:8080"

Content-Type : application/json

request sample : 
{
"id" : "1",
"amount" : "455",
"grocery_amount": "50"
}

response : "333.5"


B) 2nd Folder named RetailStoreDiscount is a web dynamic project build using spring boot and is a maven build project.

Steps to run this project : 

1) Import as existing maven project, and a maven structure project will be created inside IDE named "SpringBoot".

2) Right click on project, select run as java application.

3) Select Main.java as runtype class and click on ok.

4) Project will run on 8080 port. and url : "http://localhost:8080" 

5) URL will run on any browser.
