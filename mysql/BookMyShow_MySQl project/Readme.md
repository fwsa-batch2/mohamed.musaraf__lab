 # Mysql_Project BookMyShow
 
 ## CREATE DATABASE

```sql
CREATE DATABASE BookMyShow_project;
```
***
## USE DATABASE
```sql
USE BookMyShow_project;
```

###### Database changed
***

## CREATION OF TABLE 1 : 

### CREATE TABLE 
```sql
CREATE TABLE Screen (screen_id INT PRIMARY KEY AUTO_INCREMENT,screen_name VARCHAR(30) NOT NULL,screen_effect VARCHAR(30) NOT NULL);
```
###### Query OK, 0 rows affected (0.05 sec)

### DESC TABLE 

```sql
 DESC Screen;
 ```
| Field         | Type        | Null | Key | Default | Extra          |
|---------------|-------------|------|-----|---------|----------------|
| screen_id     | int         | NO   | PRI | NULL    | auto_increment |
| screen_name   | varchar(30) | NO   |     | NULL    |                |
| screen_effect | varchar(30) | NO   |     | NULL    |                |

###### 3 rows in set (0.00 sec)

### INSERT INTO TABLE 

```sql
INSERT INTO Screen VALUES (1,"mahaan","IMAX"),(2,"udhayam","3D"),(3,"AVM","2D"),(4,"mini_AVM","3D");
```
###### Query OK, 4 rows affected (0.01 sec)

### SELECT TABLE

 ```sql
 SELECT * FROM Screen;
```

| screen_id | screen_name | screen_effect |
|-----------|-------------|---------------|
|         1 | mahaan      | IMAX          |
|         2 | udhayam     | 3D            |
|         3 | AVM         | 2D            |
|         4 | mini_AVM    | 3D            |

###### 4 rows in set (0.01 sec)

***

## CREATION OF TABLE 2 : 

### CREATE TABLE 

```sql
CREATE TABLE Theatre (theatre_id INT PRIMARY KEY AUTO_INCREMENT,screen_id INT NOT NULL,FOREIGN KEY (screen_id) REFERENCES Screen (screen_id),theatre_name VARCHAR(30) NOT NULL,location VARCHAR(30)
NOT NULL);
```
###### Query OK, 0 rows affected (0.05 sec)

### DESC TABLE 

```sql
 DESC Theatre;
 ```

| Field        | Type        | Null | Key | Default | Extra          |
|--------------|-------------|------|-----|---------|----------------|
| theatre_id   | int         | NO   | PRI | NULL    | auto_increment |
| screen_id    | int         | NO   | MUL | NULL    |                |
| theatre_name | varchar(30) | NO   |     | NULL    |                |
| location     | varchar(30) | NO   |     | NULL    |                |

###### 4 rows in set (0.00 sec)

### INSERT INTO TABLE 

```sql
INSERT INTO Theatre VALUES (11,1,"pvr","anna_nagar"),(12,2,"palazo","vadapalani"),(13,3,"EGA","KMC"),(14,4,"Devi","Egmore");
```
###### Query OK, 4 rows affected (0.00 sec)

### SELECT TABLE

```sql
SELECT * FROM Theatre;
```
| theatre_id | screen_id | theatre_name | location   |
|------------|-----------|--------------|------------|
|         11 |         1 | pvr          | anna_nagar |
|         12 |         2 | palazo       | vadapalani |
|         13 |         3 | EGA          | KMC        |
|         14 |         4 | Devi         | Egmore     |

###### 4 rows in set (0.01 sec)

***

## CREATION OF TABLE 3 : 

### CREATE TABLE 

```sql
CREATE TABLE Movies (movie_id INT PRIMARY KEY AUTO_INCREMENT,theatre_id INT NOT NULL, FOREIGN KEY (theatre_id) REFERENCES Theatre (theatre_id),movie_name VARCHAR(30) NOT NULL,release_date DATE NOT NULL);
```
###### Query OK, 0 rows affected (0.06 sec)

### DESC TABLE 

 ```sql
 DESC Movies;
```
| Field        | Type        | Null | Key | Default | Extra          |
|--------------|-------------|------|-----|---------|----------------|
| movie_id     | int         | NO   | PRI | NULL    | auto_increment |
| theatre_id   | int         | NO   | MUL | NULL    |                |
| movie_name   | varchar(30) | NO   |     | NULL    |                |
| release_date | date        | NO   |     | NULL    |                |

###### 4 rows in set (0.01 sec)

### INSERT INTO TABLE

```sql
INSERT INTO Movies VALUES (101,11,"valimai","2022-03-15"),(102,12,"cobra","2022-03-16"),(103,13,"vaanam","2022-04-15"),(104,14,"King","2022-03-25");
```
###### Query OK, 4 rows affected (0.01 sec)

### SELECT TABLE

```sql
SELECT * FROM Movies;
```
| movie_id | theatre_id | movie_name | release_date |
|----------|------------|------------|--------------|
|      101 |         11 | valimai    | 2022-03-15   |
|      102 |         12 | cobra      | 2022-03-16   |
|      103 |         13 | vaanam     | 2022-04-15   |
|      104 |         14 | King       | 2022-03-25   |

###### 4 rows in set (0.00 sec)


***

## CREATION OF TABLE 4 : 

### CREATE TABLE 

```sql
 CREATE TABLE Seat (seat_id INT PRIMARY KEY AUTO_INCREMENT,screen_id INT NOT NULL,FOREIGN KEY (screen_id) REFERENCES Screen (screen_id),no_of_seat INT NOT NULL,seat_category VARCHAR(30) NOT NULL);
 ```
###### Query OK, 0 rows affected (0.06 sec)

### DESC TABLE 

```sql
 DESC Seat;
```
| Field         | Type        | Null | Key | Default | Extra          |
|---------------|-------------|------|-----|---------|----------------|
| seat_id       | int         | NO   | PRI | NULL    | auto_increment |
| screen_id     | int         | NO   | MUL | NULL    |                |
| no_of_seat    | int         | NO   |     | NULL    |                |
| seat_category | varchar(30) | NO   |     | NULL    |                |

###### 4 rows in set (0.00 sec)

### INSERT INTO TABLE

```sql
INSERT INTO Seat VALUES (501,1,2,"Diamond"),(502,2,10,"Gold"),(503,3,6,"Silver"),(504,4,3,"Gold");
```
###### Query OK, 4 rows affected (0.01 sec)

### SELECT TABLE

 ```sql
 SELECT * FROM Seat;
 ```

| seat_id | screen_id | no_of_seat | seat_category |
|---------|-----------|------------|---------------|
|     501 |         1 |          2 | Diamond       |
|     502 |         2 |         10 | Gold          |
|     503 |         3 |          6 | Silver        |
|     504 |         4 |          3 | Gold          |

###### 4 rows in set (0.01 sec)

***

## CREATION OF TABLE 5 : 

### CREATE TABLE 

```sql
CREATE TABLE Ticket(ticket_id INT PRIMARY KEY AUTO_INCREMENT,movie_id INT NOT NULL,FOREIGN KEY (movie_id) REFERENCES Movies (movie_id),ticket_price INT NOT NULL,seat_id INT NOT NULL,FOREIGN KEY (seat_id) REFERENCES Seat (seat_id));
```
###### Query OK, 0 rows affected (0.06 sec)

### DESC TABLE 

```sql
 DESC Ticket;
 ```

| Field        | Type | Null | Key | Default | Extra          |
|--------------|------|------|-----|---------|----------------|
| ticket_id    | int  | NO   | PRI | NULL    | auto_increment |
| movie_id     | int  | NO   | MUL | NULL    |                |
| ticket_price | int  | NO   |     | NULL    |                |
| seat_id      | int  | NO   | MUL | NULL    |                |

###### 4 rows in set (0.00 sec)

### INSERT INTO TABLE

```sql
INSERT INTO Ticket VALUES (1,101,50,501),(2,102,60,502),(3,103,100,503),(4,104,180,504);
```
###### Query OK, 4 rows affected (0.00 sec)

### SELECT TABLE

```sql
SELECT * FROM Ticket;
```

| ticket_id | movie_id | ticket_price | seat_id |
|-----------|----------|--------------|---------|
|         1 |      101 |           50 |     501 |
|         2 |      102 |           60 |     502 |
|         3 |      103 |          100 |     503 |
|         4 |      104 |          180 |     504 |

###### 4 rows in set (0.01 sec)


***
## CREATION OF TABLE 6 : 

### CREATE TABLE 

```sql
CREATE TABLE Customer_details (customer_id INT PRIMARY KEY NOT NULL,customer_name VARCHAR(30) NOT NULL,customer_email VARCHAR(30) UNIQUE NOT NULL CHECK (customer_email LIKE "%_@%_.com"),customer_phone BIGINT UNIQUE NOT NULL CHECK (customer_phone LIKE "__________"),customer_password VARCHAR(10) NOT NULL);
```
###### Query OK, 0 rows affected (0.06 sec)

### DESC TABLE 

```sql
DESC Customer_details;
```
| Field             | Type        | Null | Key | Default | Extra |
|-------------------|-------------|------|-----|---------|-------|
| customer_id       | int         | NO   | PRI | NULL    |       |
| customer_name     | varchar(30) | NO   |     | NULL    |       |
| customer_email    | varchar(30) | NO   | UNI | NULL    |       |
| customer_phone    | bigint      | NO   | UNI | NULL    |       |
| customer_password | varchar(10) | NO   |     | NULL    |       |

###### 5 rows in set (0.01 sec)

### INSERT INTO TABLE

```sql
INSERT INTO Customer_details VALUES (1,"Gandhi","gandhi@gmail.com",9080641773,"gandhi1234"),(2,"sathyavaan","sathya@gmail.com",9080641774,"sathya1234"),(3,"dada","dada@gmail.com",9080641775,"dada1234"),(4,"rockey","rockey@gmail.com",9080641776,"rockey1234");
```
###### Query OK, 4 rows affected (0.02 sec)

### SELECT TABLE

```sql
SELECT * FROM Customer_details;
```

| customer_id | customer_name | customer_email   | customer_phone | customer_password |
|-------------|---------------|------------------|----------------|-------------------|
|           1 | Gandhi        | gandhi@gmail.com |     9080641773 | gandhi1234        |
|           2 | sathyavaan    | sathya@gmail.com |     9080641774 | sathya1234        |
|           3 | dada          | dada@gmail.com   |     9080641775 | dada1234          |
|           4 | rockey        | rockey@gmail.com |     9080641776 | rockey1234        |

###### 4 rows in set (0.00 sec)


***

## CREATION OF TABLE 7 : 

### CREATE TABLE 

```sql
CREATE TABLE Booking (booking_id INT PRIMARY KEY AUTO_INCREMENT,ticket_id INT NOT NULL,FOREIGN KEY (ticket_id) REFERENCES Ticket (ticket_id),total_price INT NOT NULL,mode_of_payment ENUM("online_payment","cash_on_delivery") NOT NULL);
```
###### Query OK, 0 rows affected (0.06 sec)

### ALTER TABLE

```sql
ALTER TABLE Booking MODIFY date_of_booking TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP;
```
###### Query OK, 0 rows affected (0.02 sec)


### DESC TABLE 

```sql
DESC Booking;
```

| Field           | Type                                      | Null | Key | Default           | Extra             |
|-----------------|-------------------------------------------|------|-----|-------------------|-------------------|
| booking_id      | int                                       | NO   | PRI | NULL              | auto_increment    |
| ticket_id       | int                                       | NO   | MUL | NULL              |                   |
| total_price     | int                                       | NO   |     | NULL              |                   |
| mode_of_payment | enum('online_payment','cash_on_delivery') | NO   |     | NULL              |                   |
| date_of_booking | timestamp                                 | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |
| customer_id     | int                                       | NO   | MUL | NULL              |                   |

###### 6 rows in set (0.00 sec)

### INSERT INTO TABLE

```sql
INSERT INTO Booking (booking_id,ticket_id,total_price,mode_of_payment,customer_id) VALUES (1,1,100,"cash_on_delivery",1),(2,2,500,"online_payment",2),(3,3,300,"cash_on_delivery",3),(4,4,150,"online_payment",4);
```
###### Query OK, 4 rows affected (0.02 sec)

### SELECT TABLE

```sql
SELECT * FROM Booking;
```
| booking_id | ticket_id | total_price | mode_of_payment  | date_of_booking     | customer_id |
|------------|-----------|-------------|------------------|---------------------|-------------|
|          1 |         1 |         100 | cash_on_delivery | 2022-03-22 11:52:34 |           1 |
|          2 |         2 |         500 | online_payment   | 2022-03-22 11:52:34 |           2 |
|          3 |         3 |         300 | cash_on_delivery | 2022-03-22 11:52:34 |           3 |
|          4 |         4 |         150 | online_payment   | 2022-03-22 11:52:34 |           4 |

###### 4 rows in set (0.00 sec)



***


## CREATION OF TABLE 8 : 

### CREATE TABLE 

```sql
CREATE TABLE Review (review_id INT PRIMARY KEY,customer_id INT NOT NULL, FOREIGN KEY (customer_id) REFERENCES Customer_details (customer_id),rating VARCHAR(5) NOT NULL CHECK (rating LIKE "%_/5"),comments VARCHAR(100) NOT NULL);
``` 

```sql
DESC Review;
```

| Field       | Type         | Null | Key | Default | Extra |
|-------------|--------------|------|-----|---------|-------|
| review_id   | int          | NO   | PRI | NULL    |       |
| customer_id | int          | NO   | MUL | NULL    |       |
| rating      | varchar(5)   | NO   |     | NULL    |       |
| comments    | varchar(100) | NO   |     | NULL    |       |

###### 4 rows in set (0.00 sec)


### INSERT INTO TABLE

```sql
INSERT INTO Review VALUES (1001,1,"4.5/5","Thank_you"),(1002,2,"4.9/5","Good_UI"),(1003,3,"5/5","thank_you_for_made_my_day"),(1004,4,"4.8/5","super");
```
###### Query OK, 4 row affected (0.01 sec)

### SELECT TABLE

```sql
SELECT * FROM Review;
```

| review_id | customer_id | rating | comments                  |
|-----------|-------------|--------|---------------------------|
|      1001 |           1 | 4/5    | Thank_you                 |
|      1002 |           2 | 4.5/5  | Good_UI                   |
|      1003 |           3 | 5/5    | thank_you_for_made_my_day |
|      1004 |           4 | 4.9/5  | super                     |

###### 4 rows in set (0.00 sec)

<<<<<<< HEAD
***


# SHOW TABLES

```sql
SHOW TABLES;
```

| Tables_in_BookMyShow_project |
|------------------------------|
| Booking                      |
| Customer_details             |
| Movies                       |
| Review                       |
| Screen                       |
| Seat                         |
| Theatre                      |
| Ticket                       |

###### 8 rows in set (0.01 sec)

***








=======
## ER_Model :
>>>>>>> a564e642b232122dc678986916fc8b3d17751815

![ER_Model](https://user-images.githubusercontent.com/93640404/159658472-c6c4f414-58c4-46ce-9b9d-3ec7d05ef926.png)

## EER_Model :

![err diagram](https://user-images.githubusercontent.com/93640404/159658266-1b6891f7-895c-4245-87d2-0c94f94389a5.png)
