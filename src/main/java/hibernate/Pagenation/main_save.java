package hibernate.Pagenation;

import org.hibernate.Session;

public class main_save {
	public static void main(String args[]) {
		Session session=DBConnection.getInstance().getSession();
		session.beginTransaction();
		session.save(new Student("Arunendra",1));
		session.save(new Student("Dheeru",2));
		session.save(new Student("Amit",3));
		session.save(new Student("Saroj",4));
		session.save(new Student("Rakesh",5));
		session.save(new Student("Utsav",6));
		session.save(new Student("Ummeed",7));
		session.save(new Student("Ramesh",8));
		session.save(new Student("Rakesh",9));
		session.save(new Student("Rama",10));
		session.save(new Student("Ritu",11));
		session.save(new Student("Rishu",12));
		session.getTransaction().commit();
		
		DBConnection.getInstance().close();
	}
}
