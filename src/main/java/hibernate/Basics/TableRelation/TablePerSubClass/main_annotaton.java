package hibernate.Basics.TableRelation.TablePerSubClass;

import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class main_annotaton {

	public static void main(String args[]) {
		
		SessionFactory sf=new Configuration().configure("hibernate/Basics/TableRelation/TablePerSubClass/hibernate.config.xml").buildSessionFactory();
		Session session=sf.openSession();

		CriteriaQuery<Admin> criteriaquery=session.getCriteriaBuilder().createQuery(Admin.class);
		Root<Admin> root=criteriaquery.from(Admin.class);
		criteriaquery.select(root);
		
		List<Admin> employees=session.createQuery(criteriaquery).list();
		employees.stream().forEach(System.out::println);
		
		CriteriaQuery<Employee> criteriaquery_1=session.getCriteriaBuilder().createQuery(Employee.class);
		Root<Employee> root_1=criteriaquery_1.from(Employee.class);
		criteriaquery_1.select(root_1);
		
		List<Employee> employees_1=session.createQuery(criteriaquery_1).list();
		employees_1.stream().forEach(System.out::println);
		
		sf.close(); session.close();
	}
}
