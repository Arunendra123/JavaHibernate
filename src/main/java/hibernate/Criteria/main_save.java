package hibernate.Criteria;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main_save {
	public static void main(String args[]) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("hibernate/Criteria/spring.config.xml");
		Student s1=ac.getBean("student_1",Student.class);
		Student s2=ac.getBean("student_2",Student.class);
		Student s3=ac.getBean("student_3",Student.class);
		Student s4=ac.getBean("student_4",Student.class);
		DBConnection dbc=ac.getBean("dbconnection",DBConnection.class);
		
		dbc.getSession().beginTransaction();
	    dbc.getSession().save(s1);
	    dbc.getSession().save(s2);
	    dbc.getSession().save(s3);
	    dbc.getSession().save(s4);
	    dbc.getSession().getTransaction().commit();
		dbc.close();
	}
}
