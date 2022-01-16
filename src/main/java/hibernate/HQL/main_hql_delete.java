package hibernate.HQL;

import org.hibernate.Query;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main_hql_delete {
	public static void main(String args[]) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("hibernate/HQL/spring.config.xml");
		DBConnection dbc=ac.getBean("dbconnection",DBConnection.class);
		
		String query="Delete StudentHQL where id=1";
		dbc.getSession().beginTransaction();
		Query q=dbc.getSession().createQuery(query);
		q.executeUpdate();
		dbc.getSession().getTransaction().commit();
		
		dbc.close();
	}
}
