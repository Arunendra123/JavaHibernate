package hibernate.Cashing;

import org.hibernate.Session;

public class main_Second_level {
	
	public static void main(String args[]) {
		/////1..................................................
		Session session=DBConnection.getInstance().getSession();
        Student student = session.get(Student.class,112);
		
		System.out.println(student);
		System.out.println("Again calling to student...And result will come from cash");
		
		if(session.contains(student)) {
			System.out.println(true);
		}
		
		//////2.................................................
		student = session.get(Student.class,112);
		System.out.println(student);
		
		DBConnection.getInstance().close();
		
		session=DBConnection.getInstance().getSession();
        student = session.get(Student.class,112);
        
        System.out.println(student);
		System.out.println("Again calling to student...And result will come from cash");
		
		if(session.contains(student)) {
			System.out.println(true);
		}
		DBConnection.getInstance().close();
	}
}
