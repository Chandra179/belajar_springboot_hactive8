SQL databases -> table-based, 
NoSQL databases -> document, key-value, graph, or wide-column stores

psql -U postgres

\l 	list of database
\c	connect to database
\d	list of table
\q	disconnect database
\du 	database users
\! cls 	clean screen


create user user_name with encrypted password 'mypassword';
grant all privileges on database sample_db to user_name;

DDL (Data Definition Language)
- manipulasi struktur data (trigger, stored procedure, index, rule, schema)
- sintaks DDL
  create database,
  create table, 
  alter table (merubah struktur tabel),
  drop table
  create index (membuat index dalam tabel)
  drop index

DML (Data Manipulation Language)
- select, update, delete, insert