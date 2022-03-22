# DATABASE FOR BookMyShow

## CREATE DATABASE

``` syntax
CREATE DATABASE BookMyShow;
```
## USE DATABASE

``` syntax
USE BookMyShow;
```
 Database changed

## CREATE TABLE

``` syntax
CREATE TABLE customer_details (customer_id int PRIMARY KEY AUTO_INCREMENT,customer_name VARCHAR(30) NOT NULL,customer_email VARCHAR(30) UNIQUE NOT NULL CHECK (customer_email LIKE "%_@%_.com"),customer_phone_number BIGINT UNIQUE NOT NULL CHECK(customer_phone_number LIKE "__________"));
```
 Query OK, 0 rows affected (0.07 sec)

## DESCRIBE TABLE

``` syntax
DESC customer_details;
```
+-----------------------+-------------+------+-----+---------+----------------+
| Field                 | Type        | Null | Key | Default | Extra          |
+-----------------------+-------------+------+-----+---------+----------------+
| customer_id           | int         | NO   | PRI | NULL    | auto_increment |
| customer_name         | varchar(30) | NO   |     | NULL    |                |
| customer_email        | varchar(30) | NO   | UNI | NULL    |                |
| customer_phone_number | bigint      | NO   | UNI | NULL    |                |
+-----------------------+-------------+------+-----+---------+----------------+
4 rows in set (0.01 sec)

## INSERT VALUES

``` syntax
 INSERT INTO customer_details VALUES (1,"aswath","aswath@gmail.com",9080641773);
 ```
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO customer_details VALUES (2,"gandhi","gandhi@gmail.com",9080641774);
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO customer_details VALUES (3,"sathya","sathya@gmail.com",9080641775);
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO customer_details VALUES (4,"dada","dada@gmail.com",9080641776);
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO customer_details VALUES (5,"rockey","rockey@gmail.com",9080641777);
Query OK, 1 row affected (0.00 sec)

mysql> INSERT INTO customer_details VALUES (6,"nachi","nachi@gmail.com",9080641778);
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO customer_details VALUES (7,"thilagu","thilagu@gmail.com",9080641779);
Query OK, 1 row affected (0.01 sec)


## SELECT TABLE

``` syntax
SELECT * FROM customer_details;
```
+-------------+---------------+------------------+-----------------------+
| customer_id | customer_name | customer_email   | customer_phone_number |
+-------------+---------------+------------------+-----------------------+
|           1 | aswath        | aswath@gmail.com |            9080641773 |
+-------------+---------------+------------------+-----------------------+
1 row in set (0.00 sec)

mysql> select * from customer_details;
+-------------+---------------+------------------+-----------------------+
| customer_id | customer_name | customer_email   | customer_phone_number |
+-------------+---------------+------------------+-----------------------+
|           1 | aswath        | aswath@gmail.com |            9080641773 |
|           2 | gandhi        | gandhi@gmail.com |            9080641774 |
|           3 | sathya        | sathya@gmail.com |            9080641775 |
|           4 | dada          | dada@gmail.com   |            9080641776 |
|           5 | rockey        | rockey@gmail.com |            9080641777 |
|           6 | nachi         | nachi@gmail.com  |            9080641778 |
+-------------+---------------+------------------+-----------------------+
6 rows in set (0.00 sec)

## CREATE TABLE FOREIGN KEY

``` syntax
CREATE TABLE movie_details (movie_id int PRIMARY KEY AUTO_INCREMENT,movie_booking_id INT NOT NULL, FOREIGN KEY (movie_booking_id) REFERENCES customer_details (customer_id) ,movie_name VARCHAR(30)
NOT NULL );
```

mysql> DESC movie_details;
+------------------+-------------+------+-----+---------+----------------+
| Field            | Type        | Null | Key | Default | Extra          |
+------------------+-------------+------+-----+---------+----------------+
| movie_id         | int         | NO   | PRI | NULL    | auto_increment |
| movie_booking_id | int         | NO   | MUL | NULL    |                |
| movie_name       | varchar(30) | NO   |     | NULL    |                |
+------------------+-------------+------+-----+---------+----------------+
3 rows in set (0.00 sec)

mysql> INSERT INTO movie_details (movie_booking_id,movie_name) VALUES (2,"mahaan"),(3,"beast"),(4,"visvasam"),(5,"vivekam");
Query OK, 4 rows affected (0.01 sec)
Records: 4  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM movie_details;
+----------+------------------+------------+
| movie_id | movie_booking_id | movie_name |
+----------+------------------+------------+
|      101 |                1 | valimai    |
|      102 |                2 | mahaan     |
|      103 |                3 | beast      |
|      104 |                4 | visvasam   |
|      105 |                5 | vivekam    |
+----------+------------------+------------+
5 rows in set (0.00 sec)

## SELECT SUBQUERY

mysql> select customer_name from customer_details where customer_id in (select movie_booking_id from movie_details) order by customer_name;
+---------------+
| customer_name |
+---------------+
| aswath        |
| dada          |
| gandhi        |
| rockey        |
| sathya        |
+---------------+
5 rows in set (0.01 sec)
