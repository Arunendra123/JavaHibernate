package hibernate.CRUDOperations;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBConnection {

	private static DBConnection dbConnection;
	private Session session;
	
	private DBConnection() throws HibernateException {
		Configuration config=new Configuration().configure("hibernate/CRUDOperations/hibernate.config.xml");
		SessionFactory sessionFactory=config.buildSessionFactory();
		session=sessionFactory.openSession();
	}
	
	public Session getSession() {
		return this.session;
	}
	
	public static DBConnection getInstance() {
		if(dbConnection==null) {
			return new DBConnection();
		} else {
			return dbConnection;
		}
	}
}
