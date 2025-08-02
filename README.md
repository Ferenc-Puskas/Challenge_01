PRACTICAL CHALLENGE 01.

---------------------------------------------------------------------------------

THE PROJECT IS BASED ON A PUBLISHING COMPANY CALLED "LETRAS VIVAS."

HOW DOES IT WORK?
THIS COMPANY ALLOWS YOU TO ADD NEW BOOKS, LIST THE ONES YOU'VE ALREADY SAVED, 
SEARCH FOR A BOOK BY TITLE, AND ALSO DELETE A BOOK.

---------------------------------------------------------------------------------
---------------------------------------------------------------------------------

INSTRUCTIONS FOR RUNNING THE PROJECT. 🤠
STEP 1: DOWNLOAD THE PROJECT FROM THE REPOSITORY.

STEP 2: OPEN THE INTELLIJ IDEA PROGRAM.

STEP 3: OPEN THE DOWNLOADED PROJECT IN THE PROGRAM.

STEP 4: COMPILE THE PROJECT, BY PRESSING THE RUN BUTTON WHICH IS FOUND AT THE TOP.

STEP 5: GO TO THE BROWSER AND ENTER THE FOLLOWING URL: localhost:8081/h2-console.

STEP 6: WHEN WE ARE LOGGED IN TO H2, WE VERIFY THE FOLLOWING DATA:
1. JDBC URL: jdbc:h2:mem:letrasdb
2. DRIVER CLASS: org.h2.Driver
3. USERNAME: sa
4. PASSWORD:
THEN WE TEST THE CONNECTION TO SEE IF IT IS CORRECT AND CONNECT.

STEP 7: WE VERIFY THAT THE BOOKS TABLE IS CREATED.

---------------------------------------------------------------------------------
---------------------------------------------------------------------------------

TESTING WITH POSTMAN

URL WE WILL USE TO PERFORM THE FOLLOWING ACTIONS "http://localhost:8081/api/books"

STEP 1: DOWNLOAD THE FILE Desafio1.postman_collection.

STEP 2: OPEN THE POSTMAN APPLICATION AND IMPORT THE FILE DOWNLOADED FROM THE REPOSITORY.

STEP 3: ADDING A NEW BOOK:
1. GO TO THE POST METHOD CALLED "ADD."
2. ENTER THE FOLLOWING BOOKS - "WHEN ADDING BOOKS, YOU CAN ONLY ADD THEM ONE BY ONE":
   [
{
  "title": "Cien Años de Soledad",
  "author": "Gabriel García Márquez",
  "publicationYear": 1967
},

{
  "title": "El Principito",
  "author": "Antoine de Saint-Exupéry",
  "publicationYear": 1943
},

{
  "title": "La Metamorfosis",
  "author": "Franz Kafka",
  "publicationYear": 1915
},

{
  "title": "El Codigo de Da Vinci",
  "author": "Dan Brown",
  "publicationYear": 2003
},

{
  "title": "El Hobbit",
  "author": "J.R.R. Tolkien",
  "publicationYear": 1937
},

{
  "title": "Harry Potter y La Piedra Filosofal",
  "author": "J.K. Rowling",
  "publicationYear": 1997
}
]

STEP 3: TO SEE IF THE CHANGES WERE MADE, YOU CAN GO TO THE H2 CONSOLE TO VERIFY THAT THOSE CHANGES HAVE BEEN MADE.

STEP 4: LIST ALL BOOKS:
1. GO TO THE GET METHOD CALLED LIST, CLICK SEND, AND SEE THE BOOKS THAT HAVE BEEN ADDED.

STEP 5: SEARCH FOR BOOKS BY TITLE:
1. GO TO THE GET METHOD CALLED SEARCH AND SEARCH BY TITLE IN THE URL "http://localhost:8081/api/books/search?title=(title name)",
   FOR EXAMPLE: http://localhost:8081/api/books/search?title=soledad.

STEP 6: DELETE A BOOK:
1. GO TO THE DELETE METHOD CALLED DELETE TO DELETE A BOOK USING ITS ID.
2. IN THE URL, ADD THE ID OF THE BOOK TO DELETE "http://localhost:8081/api/books/(book id)",
3. FOR EXAMPLE: http://localhost:8081/api/books/1

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
