package hibernate.Basics.TableRelation.TablePerConcreteClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class main {

	public static void main(String args[]) {
		SessionFactory sf=new Configuration().configure("hibernate/Basics/TableRelation/TablePerConcreteClass/hibernate.config.xml").buildSessionFactory();
		Session session=sf.openSession();
		
		session.beginTransaction();
		session.save(new Employee("Arunendra","Chandauli",5000));
		session.save(new Employee("Dheeru","Chandauli",5000));
		session.save(new Employee("Pinku","Chandauli",5000));
		session.save(new Employee("Roshan","Chandauli",5000));
		session.getTransaction().commit();
		
		sf.close();
		session.close();
	}
}
