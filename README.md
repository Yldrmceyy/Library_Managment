# Library Management System
This project is a Maven project using Java and PostgreSQL for a library management system. 
The project includes entity classes and their relationships to manage books, authors, categories, publishers, and book borrowing transactions.

## Technologies Used
- Java
- Maven
- PostgreSQL
- Hibernate (JPA)


## Entity Classes

### Book
![book png](https://github.com/Yldrmceyy/Library_Managment/assets/106755050/894788ec-ddcf-47e2-9666-8550128dee17)
![booktable](https://github.com/Yldrmceyy/Library_Managment/assets/106755050/b5bc96d0-a0c8-43b9-9c73-b24eee45d155)

### Author
![author png](https://github.com/Yldrmceyy/Library_Managment/assets/106755050/1f3269a8-8890-459f-9701-60bb4711b50e)
![authortable](https://github.com/Yldrmceyy/Library_Managment/assets/106755050/8df9a687-d707-404d-938e-a830afe9cefb)

### Category
![category png](https://github.com/Yldrmceyy/Library_Managment/assets/106755050/3e4a32ef-7261-428e-842d-8770575ef868)
![categorytable](https://github.com/Yldrmceyy/Library_Managment/assets/106755050/d11b77dc-bfd5-4c51-958d-dce5d40a71ad)

### Publisher
![publisher png](https://github.com/Yldrmceyy/Library_Managment/assets/106755050/7a72278f-597c-4d1e-a01b-223cb1e7aab9)
![publishertable](https://github.com/Yldrmceyy/Library_Managment/assets/106755050/eb042fc3-7ced-40cf-96d7-f3d62c547097)

### BookBorrowing
![bookBarrowing png](https://github.com/Yldrmceyy/Library_Managment/assets/106755050/aa9ae946-3ef4-409c-8662-db1864a7f3db)
![bookbarrowingtable](https://github.com/Yldrmceyy/Library_Managment/assets/106755050/a254a625-be23-40de-a1a8-a13391fe3340)


## Relationships Between Tables
In the database schema of our library management system, the relationships between tables are defined as follows:

1- One-to-Many Relationship:
A book can have one author, while an author can have multiple books.
A book can have one publisher, while a publisher can have multiple books.
A book can have multiple borrowing transactions, but each borrowing transaction belongs to only one book.

2- Many-to-Many Relationship:
A category can have multiple books, and a book can belong to multiple categories.
These relationships are essential for organizing and managing the data effectively in our library management system. They ensure data integrity and provide the necessary structure for querying and retrieving information about books, authors, publishers, categories, and borrowing transactions.
