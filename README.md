# Railway_Management_System-DBMS

PROJECT MEMBERS
* Jaanus Sri K G
* Tejaswi Kakarla
* Mega V

**PROJECT DESCRIPTION**
* This project is about creating a database about Railway Management System.
* This system facilitates the passengers to enquire about the available trains at the required source and destination. The passenger can book or cancel the ticket and can view the status of booked tickets.
* Only admin have the access to make changes in the database record like adding or removing any train and station.

**SPECIFICATIONS**
1. Train scheduling
	This system able to schedule and manage the arrival and departure times of trains, considering factors such as stations, capacity.
2. Ticketing
	This system provides fare calculation of tickets with respect to distance and number of passengers.
3. Passenger Information
	This system provides real-time information to passengers regarding train schedules and status.
4. Resource Management
	This system allocates resources like trains and seats efficiently to optimize operations and minimize conflicts.

**ASSUMPTIONS**
1. Data Integration 
	This system assumes the existence of various sources, such as train schedules, ticketing systems, and 
record maintenance to provide comprehensive view of operations.
2. User Roles and Permissions 
	This system assumes the existence of different user roles, such as administrators existing users and      new users with appropriate access permissions and restrictions.
3. Compliance and Regulations
	This system assumes compliance with applicable railway regulations and data protections.
4. Scalability 
	This system assumes the ability to handle growing number of trains and passengers.


**RELATIONSHIPS**

_1:N Relationship_
	For every regular binary 1:N relationship type R, identify the relation S that represent the participating entity type at the N-side of the relationship type. The primary key of the relation in 1 side entity is included as the foreign key in N side entity.
Books (Between User (Total Participation) and Ticket (Total Participation))
Cancels (Between User (Partial Participation) and Ticket (Partial Participation))
Belongs (Between Train (Total Participation) and Ticket (Total Participation))

_1:1 Relationship_
	A one-to-one (1:1) relationship in an Entity Relationship Diagram (ERD) is a type of association between two entities, where each instance of one entity corresponds to exactly one instance of the other entity, and vice versa.
Confirms (Between User (Total Participation) and Payment (Partial Participation))
Pays (Between Payment (Total Participation) and Ticket (Total Participation))

**SCHEMA DIAGRAM**

![Image](https://user-images.githubusercontent.com/95457059/261684313-4748512f-3630-47af-b600-609fb96f73e7.png)

**ER DIAGRAM BEFORE NORMALIZATION**

![Image](https://user-images.githubusercontent.com/95457059/261685277-26d54f8a-8f37-4b8a-a0c4-52a92cb5fa61.png)

**FINAL SCHEMA DIAGRAM**

![Image](https://user-images.githubusercontent.com/95457059/261686274-07265222-0740-45a6-9248-0a674c233486.png)

**FINAL ER DIAGRAM**

![Image](https://user-images.githubusercontent.com/95457059/261686413-32152efc-2049-4212-bd4e-b5bb21e28f01.png)

