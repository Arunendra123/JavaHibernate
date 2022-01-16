# JavaHibernate

package hibernate.note;

1. Hibernate features: 
	
	1.  Lightweight. ...
	2.  Open Source. ...
	3.  ORM (Object Relation Mapping) ...
	4.  High Performance. ...
	5.  HQL (Hibernate Query Language) ...
	6.  Auto - DDL
	7.  Caching. ...
	8.  Auto-Generation. ...
	9.  Scalability
	10. Lazy Loading
	11. Database Independent

2. Object Type:
	
	1. Transient Object:
	2. Persistent Object:
	3. Detached Object:
	
	   Java Object             Hibernate   
	Transient Object  |    Persistent Object    | 
	                  |  (Attach to Hibernate)  |
	                                 |
	                    removed from Hiberante
	Detached Object <----------------|
	
3. CRUD

         save();       --> return serializable primary key
		 persist()     --> does not return anything
         
         update();     --> void
		 merge();      --> void
        
         saveOrUpdate(); --> If record exist it update else insert.
         delete();

4. Select Operation       
		
		 get(Student.class,1);   --> return null is record not found

		 load();                 --> object not found exception
		 
		 
5. Id Generator

   assigned
   increment
   sequence
   hilo
   native
   identity
   Custom Generator
	
6. Criteria (Deprecated)
   criteria get used to select the data from table using java object concept. HQL does not require.
   
7. CriteriaQuery (Hibernate 5)
   criteria get used to select the data from table using java object concept. HQL does not require.
   
8. Relations
   1. IS_A
   Table per class
   Table per class
   Table per concrete class
   2. HAS_A (Association)
   one-to-one
   one-to-many
   many-to-one
   many-to-many
