# WEB - Masai todo

## Submission Instructions [Please note]

## Maximum Marks - 10

- The Submission should not contain spaces, for example,/js-101 folder/eval will not work
- Do not push node_modules and package_lock.json to GitHub

```
 ✅ able to submit the app - 1 mark ( minimum score )
 ✅ When the form get's submitted the localstorage is getting updated(With Multiple form submissions) - 2 marks.
 ✅ When submitting the form check the table in the index.html page  - 2 marks.
 ✅ When clicking on the Delete cell of the a row that row should be deleted - 1 marks
 ✅ Visit the Completed page and check the Table - 1 marks.
 ✅ Check the Filter Part in the Completed Page- 1 mark
 ✅ Click on the last cell of a row in the Completed Page and check the deleting - 1 mark.
 ✅ Visit Favourites Page and check the deleting 1 mark.


```

## Installation

- you can use any node version that works for you ( 14+ )
- please make sure you do not push package-lock.json
- Download and unzip the boilerplate
- Navigate to the correct path

## Folder structure

- index.html
- completed.html
- favourites.html
- script
     - index.js
     - complete.js
     - favourite.js
- cypress
  - e2e (ignore the test files related to cypress)

### You haven't taught cypress to run the test cases locally, you can see the passed/ failed test cases and test errors on CP itself.

## Description

#### Use the template provided below to write your code (Mandatory)

### Video Instructions:-

### Some Rules to follow:- 
- Before writing a single line of code please read the problem statement very carefully.
- Don't change the already given ids or classes.
- Only use the localStorage keys given in the problem statement.
- If you don't follow these rules you might not get any marks even if you do everything correctly.

### Problem Statement:-
- You have to build a todo app using HTML,CSS,JS & LocalStorage.
- In this application, you will have 3 pages. (Already Given in the Template).
- These are the following pages:- 
    1. Home Page(index.html)
    2. Completed Page(completed.html)
    3. Favorites Page(favourites.html)

#### Home Page(index.html):- 
- On this Page, we have a form and a table.
- When the user submits the form all the data from the form should be pushed to the localStorage with key `tasks`.
- Please make sure that you can store multiple form submissions in the localStorage.
- On this page, we also have a table.
- Take all the data from the `task` localStorage and append it in the table as table rows inside the tbody.
- Make sure that whenever a new form submission happens both the table and the localStorage should be updated.
- All the data of the table should come from localStorage but for each row, the last cell should be `Complete`.
- When the user clicks on that cell the row should be deleted both from DOM and from localStorage and added in a new localStorage with a key `task-completed`.
- For further reference you can take a look at here:- ![image](https://masai-course.s3.ap-south-1.amazonaws.com/editor/uploads/2022-10-28/screencapture-127-0-0-1-5500-index-html-2022-10-28-12_30_49_819635.png)

#### Completed Page(completed.html):- 
- In this page, we have a table. (Given in the Template).
- Here you have to take the data from the `task-completed` localStorage and append it inside tbody.
- All the row data should come from localStorage but the last cell should be `Favorite`.
- When clicked here the row should be deleted both from DOM and from localStorage and it should be added in a new localStorage with key `task-favorites`.
- In this page, we also have a select tag with an id:- `filter`.
- You can filter the table by Priority using this select tag.
For further reference, you can take a look at here:- ![image](https://masai-course.s3.ap-south-1.amazonaws.com/editor/uploads/2022-10-28/Screenshot%202022-10-28%20at%2012.33.48%20PM_125770.png)

#### Favorites Page(favorites.html):- 
- Here we will take the data from the `task-favorites` localStorage and append it to the tbody given in the HTML page.
 




#### General guidelines

- The system on cp.masaischool.com may take between 1-20 minutes for responding,
- so we request you to read the problem carefully and debug it before itself
- we also request you not just submit it last minute
- try to keep one submission at a time
