package hibernate.HQL;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main_hql_insert {
	public static void main(String args[]) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("hibernate/HQL/spring.config.xml");
		DBConnection dbc=ac.getBean("dbconnection",DBConnection.class);
		
		String query="insert into StudentHQL(name, rollNo, address, mobileNo,id) select name, rollNo, address, mobileNo, id from Student";
		dbc.getSession().beginTransaction();
		Query q=dbc.getSession().createQuery(query);
		q.executeUpdate();
		dbc.getSession().getTransaction().commit();
		
		dbc.close();
	}
}
