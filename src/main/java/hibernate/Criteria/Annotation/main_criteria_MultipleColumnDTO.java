package hibernate.Criteria.Annotation;

import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;


public class main_criteria_MultipleColumnDTO {

	public static void main(String args[]) {
		
		Session session=DBConnection.getInstance().getSession();
		
		CriteriaQuery<EmployeeDTO> criteriaquery=session.getCriteriaBuilder().createQuery(EmployeeDTO.class);
		Root<Employee> root=criteriaquery.from(Employee.class);
		criteriaquery.select(session.getCriteriaBuilder().construct(EmployeeDTO.class,root.get("name"),root.get("address"),root.get("salary")));
		
		List<EmployeeDTO> column=session.createQuery(criteriaquery).list();
		
        for(EmployeeDTO emp:column) {
        	System.out.println(emp.getName()+"-"+emp.getAddress());
        }
		
        DBConnection.getInstance().close();
	}
}
 