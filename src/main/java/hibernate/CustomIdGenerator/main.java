package hibernate.CustomIdGenerator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
	public static void main(String args[]) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("hibernate/CustomIdGenerator/spring.config.xml");
		Student s=ac.getBean("student_1",Student.class);
		DBConnection dbc=ac.getBean("dbconnection",DBConnection.class);

		dbc.getSession().save(s);    
		dbc.getSession().beginTransaction().commit();
		dbc.getSession().evict(s);
	}
}
