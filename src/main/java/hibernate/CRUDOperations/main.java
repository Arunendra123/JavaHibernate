package hibernate.CRUDOperations;

import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
	public static void main(String args[]) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("hibernate/CRUDOperations/spring.config.xml");
		Student s=ac.getBean("student_1",Student.class);
		DBConnection dbc=ac.getBean("dbconnection",DBConnection.class);
		
		Student s_2= ac.getBean("student_2",Student.class);
        s_2.setId(0);
		 
		dbc.getSession().save(s);       //--> return serializable primary key
		//dbc.getSession().persist(s);         //--> does not return anything
        
        //dbc.getSession().update(s);
		//dbc.getSession().merge(s);
        
        //dbc.getSession().saveOrUpdate(s); --> If record exist it update else insert.
        
		//dbc.getSession().delete(s_2);
        
		dbc.getSession().beginTransaction().commit();
		dbc.getSession().evict(s);
		
		//Student s_3=dbc.getSession().get(Student.class,1);   //--> return null is record not found
		//System.out.print(s_3);

		//Student s_4=dbc.getSession().load(Student.class,1);  //--> object not found exception
		//System.out.print(s_4);
	}
}
