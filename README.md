# Book Service
This is a Book service project using sprig boot and mysql.

## Features
1. Add a book to the inventory
2. Remove a book from the inventory
3. Update the details of a book in the inventory
4. Search for a book by name or author
5. List all books in the inventory

## Installation
1. Create database inventory in mysql
2. Run Spring application
3. The server will start on port : 9111
4. server url := http://localhost:9111/


## API Info

#### add book

```http
  POST /addBook
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `none` | `na` | Add book into database |

#### get All books

```http
  GET /allBooks
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `none`      | `na` | Fetch all Books from database |


#### update book

```http
  GET /updateBook
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `Integer` | updates the book with given id |


#### update book

```http
  GET /deleteBook
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `Integer` | delete the book with given id |


#### get books with filter

```http
  GET /allBooks
```

| Parameter            | Type         | Description                       |
| :--------            | :-------     | :-------------------------------- |
| `author`/`name`      | `String`     | get Books with specified author and name |


## Video Demo Link
https://drive.google.com/file/d/1h4g-CpoTiCFtEW8nTVRPubqode50EeIU/view?usp=share_link
