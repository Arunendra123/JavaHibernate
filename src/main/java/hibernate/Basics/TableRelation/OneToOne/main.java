package hibernate.Basics.TableRelation.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class main {

	public static void main(String args[]) {
		
		SessionFactory sf=new Configuration().configure("hibernate/Basics/TableRelation/OneToOne/hibernate.config.xml").buildSessionFactory();
		Session session=sf.openSession();
		
		session.beginTransaction();
		session.save(new Question("What is java?",new Answer("Java is a programing language")));
		session.save(new Question("What is C++?",new Answer("Java is a also programing language")));
		session.getTransaction().commit();
		
		sf.close();
		session.close();
	}
}
