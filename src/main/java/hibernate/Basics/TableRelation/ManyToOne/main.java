package hibernate.Basics.TableRelation.ManyToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class main {

	public static void main(String args[]) {
		
		SessionFactory sf=new Configuration().configure("hibernate/Basics/TableRelation/ManyToOne/hibernate.config.xml").buildSessionFactory();
		Session session=sf.openSession();
		
		Movie m1=new Movie("X");
		Actor a1=new Actor("Ram",m1);
		Actor a2=new Actor("Shyam",m1);
		
		session.beginTransaction();
		session.save(a1);
		session.save(a2);
		session.getTransaction().commit();
		
		sf.close();
		session.close();
	}
}
