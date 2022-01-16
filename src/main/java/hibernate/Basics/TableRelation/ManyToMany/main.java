package hibernate.Basics.TableRelation.ManyToMany;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class main {

	public static void main(String args[]) {
		
		SessionFactory sf=new Configuration().configure("hibernate/Basics/TableRelation/ManyToMany/hibernate.config.xml").buildSessionFactory();
		Session session=sf.openSession();
		
		Movie m1=new Movie("X");
		Movie m2=new Movie("Y");
		Actor a1=new Actor("Ram",Arrays.asList(new Movie[] {m1,m2}));
		Actor a2=new Actor("Shyam",Arrays.asList(new Movie[] {m1,m2}));
		
		session.beginTransaction();
		session.save(a1);
		session.save(a2);
		session.getTransaction().commit();
		
		sf.close();
		session.close();
	}
}
