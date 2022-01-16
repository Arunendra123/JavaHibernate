package hibernate.Basics.TableRelation.OneToOne;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class main_annotaton {

	public static void main(String args[]) {
		SessionFactory sf=new Configuration().configure("hibernate/Basics/TableRelation/TablePerClass/hibernate.config.xml").buildSessionFactory();
		Session session=sf.openSession();
		
		sf.close();
		session.close();
	}
}
