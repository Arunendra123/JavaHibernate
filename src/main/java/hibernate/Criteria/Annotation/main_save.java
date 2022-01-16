package hibernate.Criteria.Annotation;

import org.hibernate.Session;

public class main_save {
	public static void main(String args[]) {
		Session session=DBConnection.getInstance().getSession();
		
		session.beginTransaction();
		session.save(new Employee("Arunendra","Chanduli",8000));
		session.save(new Employee("Dheeru","Chanduli",18000));
		session.save(new Employee("Amit","Chanduli",5500));
		session.save(new Employee("Ranu","Chanduli",4500));
		session.save(new Employee("Pradeep","Chanduli",6500));
		session.save(new Employee("Pran","Chanduli",8800));
		session.save(new Employee("suresh","Chanduli",4500));
		session.getTransaction().commit();
		DBConnection.getInstance().close();
	}
}
