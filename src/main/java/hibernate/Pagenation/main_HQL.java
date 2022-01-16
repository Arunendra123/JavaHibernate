package hibernate.Pagenation;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class main_HQL {
	public static void main(String args[]) {
		Session session=DBConnection.getInstance().getSession();
		String query="From Student";
		Query<Student> q=session.createQuery(query,Student.class);
		
		q.setFirstResult(0);
		q.setMaxResults(5);
		
		for(Student student:q.list()) {
			System.out.println(student);
		}
		
		
		DBConnection.getInstance().close();
	}
}
