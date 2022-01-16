package hibernate.HQL;

import java.util.List;

import org.hibernate.Query;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main_hql_select {
	public static void main(String args[]) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("hibernate/HQL/spring.config.xml");
		DBConnection dbc=ac.getBean("dbconnection",DBConnection.class);
		
		String query="from StudentHQL";
		Query q=dbc.getSession().createQuery(query);
		List<StudentHQL> stlist=q.getResultList();
		for(StudentHQL st: stlist) {
			System.out.println(st);
		}
		dbc.close();
	}
}
