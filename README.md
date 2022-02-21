# Mysql

``` show databases; ```

| Database           |
|:------------------:|
| Hasan              |
| information_schema |
| mysql              |
| performance_schema |
| sys                |

5 rows in set (0.01 sec)

``` create database newFile; ```

Query OK, 1 row affected (0.00 sec)

mysql> show databases;

| Database           |
|:------------------:|
| Hasan              |
| information_schema |
| mysql              |
| newFile            |
| performance_schema |
| sys                |

6 rows in set (0.00 sec)

``` use newFile; ```

Database changed

``` create table file(id int primary key, name varchar(30),roll int unique); ```

Query OK, 0 rows affected (0.04 sec)

``` desc file; ```

| Field | Type        | Null | Key | Default | Extra |
|:-----:|:-----------:|:----:|:---:|:-------:|:-----:|
| id    | int         | NO   | PRI | NULL    |       |
| name  | varchar(30) | YES  |     | NULL    |       |
| roll  | int         | YES  | UNI | NULL    |       |

3 rows in set (0.00 sec)


``` insert into file values(2,"musaraf",20); ```

Query OK, 1 row affected (0.00 sec)

``` select * from file; ```

| id | name    | roll |
|:--:|:-------:|:----:|
|  2 | musaraf |   20 |

1 row in set (0.00 sec)

``` insert into file values(4,"hasan",21);mysql> ```

Query OK, 1 row affected (0.01 sec)

``` select * from file; ```

| id | name    | roll |
|:--:|:-------:|:----:|
|  2 | musaraf |   20 |
|  3 | hasan   |   23 |
|  4 | hasan   |   21 |

3 rows in set (0.00 sec)

``` delete from file where id = 4; ```

Query OK, 1 row affected (0.01 sec)

``` select * from file; ```

| id | name    | roll |
|:--:|:-------:|:----:|
|  2 | musaraf |   20 |
|  3 | hasan   |   23 |

2 rows in set (0.00 sec)

``` alter table file add constraint unique(name); ```

Query OK, 0 rows affected (0.05 sec)

Records: 0  Duplicates: 0  Warnings: 0

``` desc file; ```

| Field | Type        | Null | Key | Default | Extra |
|:-----:|:-----------:|:----:|:---:|:-------:|:-----:|
| id    | int         | NO   | PRI | NULL    |       |
| name  | varchar(30) | YES  | UNI | NULL    |       |
| roll  | int         | YES  | UNI | NULL    |       |

3 rows in set (0.00 sec)

``` alter table file drop constraint name; ```

Query OK, 0 rows affected (0.03 sec)

Records: 0  Duplicates: 0  Warnings: 0

``` desc file; ```


| Field | Type        | Null | Key | Default | Extra |
|:-----:|:-----------:|:----:|:---:|:-------:|:-----:|
| id    | int         | NO   | PRI | NULL    |       |
| name  | varchar(30) | YES  |     | NULL    |       |
| roll  | int         | YES  | UNI | NULL    |       |

3 rows in set (0.00 sec)
