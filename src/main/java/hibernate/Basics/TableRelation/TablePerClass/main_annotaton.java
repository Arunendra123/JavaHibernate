package hibernate.Basics.TableRelation.TablePerClass;

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

		CriteriaQuery<Admin> criteriaquery=session.getCriteriaBuilder().createQuery(Admin.class);
		Root<Admin> root=criteriaquery.from(Admin.class);
		criteriaquery.select(root);
		
		List<Admin> employees=session.createQuery(criteriaquery).list();
		employees.stream().forEach(System.out::println);
		
		sf.close();
		session.close();
	}
}
