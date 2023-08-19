# Railway_Management_System-DBMS

PROJECT MEMBERS
* Jaanus Sri K G
* Tejaswi Kakarla
* Mega V

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


