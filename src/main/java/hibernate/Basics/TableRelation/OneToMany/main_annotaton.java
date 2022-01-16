package hibernate.Basics.TableRelation.OneToMany;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class main_annotaton {

	public static void main(String args[]) {
		SessionFactory sf=new Configuration().configure("hibernate/Basics/TableRelation/OneToMany/hibernate.config.xml").buildSessionFactory();
		Session session=sf.openSession();
		CriteriaQuery<Actor> cq=session.getCriteriaBuilder().createQuery(Actor.class);
        Root<Actor> root=cq.from(Actor.class);
        cq.select(root);
        
        session.createQuery(cq).list().stream().forEach(System.out::println);
        
		sf.close();
		session.close();
	}
}
