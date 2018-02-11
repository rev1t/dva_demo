Dear,

I have completed the programming assignment. The source code is at https://github.com/rev1t/dva_demo.

You can clone the project and run on your local machine with the command - mvn spring-boot:run. There is no configuration required.

After successfully running the maven command , you can view the application with this “http://localhost:8080/customers_list” url.

Screenshot is attached here.

The application was developed using Maven, Spring Boot, JPA , Rest, Bootstrap, JQuery, DataTable and H2 as an in-memory database.

There are two main entities, Customer and Claim that were designed to have unidirectional one-to-many relationships. One customer has many claims.  Due to time constraints, I just created data for each Customer having only one Claim.

All customer entries are displayed in the table. If you click and the last column labelled as ‘Claim Details”, the popup message containing informational data related to the claim of the particular customer.

The popup is pretty ugly but I think is good enough for demonstrating how one entity is related to another. No comment on the codes unfortunately.

Please let me know if you have any issues. 

Cheers
Revit
