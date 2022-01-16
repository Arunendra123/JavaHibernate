package hibernate.Basics.TableRelation.OneToMany;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class main {

	public static void main(String args[]) {
		SessionFactory sf=new Configuration().configure("hibernate/Basics/TableRelation/OneToMany/hibernate.config.xml").buildSessionFactory();
		Session session=sf.openSession();
		
		session.beginTransaction();
		session.save(new Actor("Sharuh Khan",Arrays.asList(new Movie[] {new Movie("X"),new Movie("Y"),new Movie("Z")})));
		session.getTransaction().commit();
		
		sf.close();
		session.close();
	}
}
