- ORM (Object Relationship Mapping)
- pemetaan database ke dalam oop
- cara (ORM) yang paling sering dipakai 
	-> pemetaan query ke dalam class (POJO) / java beans
- POJO 
	-> class yang hanya berisi variabel dan setter getter tanpa method dan proses lainnya
	-> database di mapping menggunakan pojo
- DAO 
	-> CRUD operation menggunakan DAO
	-> di mapping menggunakan POJO


------------------------------------------


HIBERNATE

	1. Configuration object
		- db connection (hiberbate.cfg.xml)
		- class mapping setup
	
	2. SessionFactory object
		- created using supplied configuration
		- thread safe

	3. Session object
		- get physical connection with a database
		- hanya di inisialisasi ketika interaksi dengan database dibutuhkan
		- tidak thread safe

	4. Transaction object
	5. Query object
		- use sql/hibernate query language(HQL) to retrieve data from database
	6. Criteria object
		- create and execute object oriented criteria queries to retrieve objects


-------------------------------------------------------------------


HIBERNATE PROPERTIES

1. hibernate.dialect
   - This property makes Hibernate generate the appropriate SQL for the chosen database.

2. hibernate.connection.driver_class
   - JDBC driver class.

3. hibernate.connection.url
   - JDBC URL to the database instance.

4. hibernate.connection.username
   - database username.

5. hibernate.connection.password
   - The database password.

6. hibernate.connection.pool_size
   - Limits the number of connections waiting in the Hibernate database connection pool.

7. hibernate.connection.autocommit
   - Allows autocommit mode to be used for the JDBC connection.