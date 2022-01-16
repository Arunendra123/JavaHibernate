package hibernate.Basics.Annotation;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class main_annotaton {

	public static void main(String args[]) {
		SessionFactory sf=new Configuration().configure("hibernate/Basics/Annotation/hibernate.config.xml").buildSessionFactory();
		Session session=sf.openSession();
		
		Criteria criteria=session.createCriteria(Employee.class);
		List<Employee> employees=criteria.list();
		
		employees.stream().forEach(System.out::println);
		
		sf.close();
		session.close();
	}
}
