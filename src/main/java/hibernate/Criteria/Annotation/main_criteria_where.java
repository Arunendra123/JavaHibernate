package hibernate.Criteria.Annotation;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class main_criteria_where {

	public static void main(String args[]) {
		
		Session session=DBConnection.getInstance().getSession();
		
		CriteriaQuery<Employee> criteriaquery=session.getCriteriaBuilder().createQuery(Employee.class);
		Root<Employee> root=criteriaquery.from(Employee.class);
        criteriaquery.select(root).where(root.get("id").in(2));
        List<Employee> employees=session.createQuery(criteriaquery).list();
		employees.stream().forEach(System.out::println);

		DBConnection.getInstance().close();
	}
}
 