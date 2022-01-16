package hibernate.HQL;

import org.hibernate.Query;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main_hql_select_where {
	public static void main(String args[]) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("hibernate/HQL/spring.config.xml");
		DBConnection dbc=ac.getBean("dbconnection",DBConnection.class);
		
		String query="from StudentHQL where id=:id";
		Query q=dbc.getSession().createQuery(query);
		      q.setParameter("id", 2);
		
		StudentHQL st=(StudentHQL)q.uniqueResult();
		System.out.print(st);
		dbc.close();
	}
}
