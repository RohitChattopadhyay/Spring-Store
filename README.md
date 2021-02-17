Spring-Store
---

To Start Server  
`npm run be`

Visit http://localhost:8080

To Start frontend development server  
`npm run fe` 

## Problem Statement
In this pandemic time, a surge in e-commerce revenues could be observed. The retail sector is undergoing a sea change. Design an online retail store using the Spring framework for essential products. You can use React for the front-end part. Utilize the Spring framework for handling many backend functionalities, such as, database handling, session management etc. Add at least one special functionality that would make your online store more suitable during this crisis period.

State the different design patterns that you have utilized in the code.

## Solution Approach
The solution comprises of following two components:    
 - **Frontend**	: Single Page Application developed using ReactJS
 - **Backend**	: REST API developed using Spring

### Model
 - **Category**
	*id*	: Primary Key for the table  
	*name*	: Name of the Category  
	*items*	: Items available in the Category  
 - **Order**
	 *id* : Primary Key for the table  
	  *items* : Items under the Order  
- **Item**
	It is a Embedded Weak Entity, bounded with Category and Order  
	*name* : Name of Item  
	*qty* : Quantity ordered  
### Controller
 1. **GET**  **`/api/category/{categoryID}`**
	 Returns category information by Category ID
 2. **GET**  **`/api/order/{orderID}`**
	 Returns order information by Order ID
 3. **POST**   **`/api/order`**
	 Creates Order and returns the Order ID

### Database
JPA ORM is used for handling databases, the diagram of the database is as follows  
![](https://i.imgur.com/FTscHEA.png)

Screenshots
---
**User Interface**  
![](https://i.imgur.com/5ZgKDQR.png)

**Available Items**  
![](https://i.imgur.com/lhSocoV.png)

**User Cart**  
![](https://i.imgur.com/ubqxYkx.png)

**Order Placed**  
![](https://i.imgur.com/jyuszl9.png)

**REST API Response**   

**All Categories**   
![](https://i.imgur.com/d3NuJ54.png)

**Category Details**  
![](https://i.imgur.com/NAmwo12.png)

**All Orders**  
![](https://i.imgur.com/vpASuTP.png)

**Order Details**  
![](https://i.imgur.com/33rIVhO.png)
