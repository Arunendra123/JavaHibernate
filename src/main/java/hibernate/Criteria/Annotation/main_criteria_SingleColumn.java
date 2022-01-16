package hibernate.Criteria.Annotation;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class main_criteria_SingleColumn {

	public static void main(String args[]) {
		
		Session session=DBConnection.getInstance().getSession();
		
		CriteriaQuery<String> criteriaquery=session.getCriteriaBuilder().createQuery(String.class);
		Root<Employee> root=criteriaquery.from(Employee.class);
		criteriaquery.select(root.get("name"));
		
		List<String> name=session.createQuery(criteriaquery).list();
		
        name.stream().forEach(System.out::println);
		
        DBConnection.getInstance().close();
	}
}
 