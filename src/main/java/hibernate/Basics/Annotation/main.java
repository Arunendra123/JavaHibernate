package hibernate.Basics.Annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class main {

	public static void main(String args[]) {
		SessionFactory sf=new Configuration().configure("hibernate/Basics/Annotation/hibernate.config.xml").buildSessionFactory();
		Session session=sf.openSession();
		
		session.beginTransaction();
		session.save(new Employee(1,"Arunendra","Chandauli",5000));
		session.save(new Employee(2,"Dheeru","Chandauli",5000));
		session.save(new Employee(3,"Pinku","Chandauli",5000));
		session.save(new Employee(4,"Roshan","Chandauli",5000));
		session.getTransaction().commit();
		
		sf.close();
		session.close();
	}
}
