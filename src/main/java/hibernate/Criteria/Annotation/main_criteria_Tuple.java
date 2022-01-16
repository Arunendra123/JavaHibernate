package hibernate.Criteria.Annotation;

import java.util.List;

import javax.persistence.Tuple;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;


public class main_criteria_Tuple {

	public static void main(String args[]) {
		
		Session session=DBConnection.getInstance().getSession();
		
		CriteriaQuery<Tuple> criteriaquery=session.getCriteriaBuilder().createQuery(Tuple.class);
		Root<Employee> root=criteriaquery.from(Employee.class);
		criteriaquery.multiselect(root.get("name"),root.get("address"),root.get("salary"));
		
		List<Tuple> column=session.createQuery(criteriaquery).list();
		
        for(Tuple emp:column) {
        	System.out.println(emp.get(root.get("name"))+"-"+emp.get(root.get("address"))+"-"+emp.get(root.get("salary")));
        }
		
        DBConnection.getInstance().close();
	}
}
 