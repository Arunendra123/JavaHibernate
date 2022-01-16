package hibernate.Criteria.Annotation;

import java.util.List;

import javax.persistence.Tuple;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class main_criteria_MultipleColumn {

	public static void main(String args[]) {
		
		Session session=DBConnection.getInstance().getSession();
		
		CriteriaQuery<Object[]> criteriaquery=session.getCriteriaBuilder().createQuery(Object[].class);
		Root<Employee> root=criteriaquery.from(Employee.class);
		criteriaquery.multiselect(root.get("name"),root.get("address"));
		
		List<Object[]> column=session.createQuery(criteriaquery).list();
		
        for(Object[] o:column) {
        	System.out.println(o[0]+"-"+o[1]);
        }
		
       DBConnection.getInstance().close();
	}
}
 