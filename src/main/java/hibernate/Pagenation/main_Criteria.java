package hibernate.Pagenation;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class main_Criteria {
	public static void main(String args[]) {
		Session session=DBConnection.getInstance().getSession();
		CriteriaQuery<Student> criteriaquery=session.getCriteriaBuilder().createQuery(Student.class);
		Root<Student> root=criteriaquery.from(Student.class);
		criteriaquery.select(root);
		
		Query<Student> q=session.createQuery(criteriaquery);
		q.setFirstResult(0);
		q.setMaxResults(5);
		
		q.stream().forEach(System.out::println);
		
		DBConnection.getInstance().close();
	}
}
