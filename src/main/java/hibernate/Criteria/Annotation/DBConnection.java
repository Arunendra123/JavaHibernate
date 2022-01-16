package hibernate.Criteria.Annotation;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBConnection {

	private static DBConnection dbConnection;
	private Session session;
	private SessionFactory sessionFactory;
	
	private DBConnection() throws HibernateException {
		Configuration config=new Configuration().configure("hibernate/Criteria/Annotation/hibernate.config.xml");
	    sessionFactory=config.buildSessionFactory();
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
	
	public void close() {
		this.session.close();
		this.sessionFactory.close();
	}
}
