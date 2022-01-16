package hibernate.Cashing;

import org.hibernate.Session;

public class main_first_level {
	
	public static void main(String args[]) {
		Session session=DBConnection.getInstance().getSession();
		Student student = session.get(Student.class,112);
		
		System.out.println(student);
		System.out.println("Again calling to student...And result will come from cash");
		
		if(session.contains(student)) {
			System.out.println(true);
		}
		
		student = session.get(Student.class,112);
		System.out.println(student);
		
		DBConnection.getInstance().close();
	}
}
