package hibernate.Basics.TableRelation.TablePerConcreteClass;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class main_annotaton {

	public static void main(String args[]) {
		SessionFactory sf=new Configuration().configure("hibernate/Basics/TableRelation/TablePerConcreteClass/hibernate.config.xml").buildSessionFactory();
		Session session=sf.openSession();

		CriteriaQuery<Employee> criteriaquery=session.getCriteriaBuilder().createQuery(Employee.class);
		Root<Employee> root=criteriaquery.from(Employee.class);
		
		criteriaquery.select(root);
		session.createQuery(criteriaquery).list().stream().forEach(System.out::println);
		
		sf.close();
		session.close();
	}
}
