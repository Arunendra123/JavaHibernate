package hibernate.Criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main_criteria {

	public static void main(String args[]) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("hibernate/Criteria/spring.config.xml");
		DBConnection dbc = ac.getBean("dbconnection", DBConnection.class);

		Criteria criteria = dbc.getSession().createCriteria(Student.class);

		// Select All
		List<Student> students = criteria.list();

		for (Student student : students) {
			System.out.println(student);
		}

		// Restriction
		// Where condition
		Criterion criterian = Restrictions.eq("id", 2);
		criteria.add(criterian);

		Student student1 = (Student) criteria.uniqueResult();
		System.out.println(student1);

		// Where condition with greater than
		Criteria criteria_1 = dbc.getSession().createCriteria(Student.class);

		Criterion criterian1 = Restrictions.gt("id", 2);
		criteria_1.add(criterian1);

		List<Student> students_1 = criteria_1.list();
		for (Student student : students_1) {
			System.out.println(student);
		}

		// Projection
		Criteria criteria_2 = dbc.getSession().createCriteria(Student.class);
		Projection p1 = Projections.property("name");
		Projection p2 = Projections.property("rollNo");

		ProjectionList plist = Projections.projectionList();
		plist.add(p1);
		plist.add(p2);

		criteria_2.setProjection(plist);
		List<Object[]> list_1 = criteria_2.list();

		for (Object[] o : list_1) {
			System.out.println(o[0] + " " + o[1]);
		}

		// Find Average using Projection
		Criteria criteria_3 = dbc.getSession().createCriteria(Student.class);
		Projection p3 = Projections.avg("mobileNo");

		ProjectionList plist1 = Projections.projectionList();
		plist1.add(p3);

		criteria_3.setProjection(plist1);

		double average = (double) criteria_3.uniqueResult();
		System.out.print(average);

		dbc.close();

		// Criteria: criteria get used for select operations
		// Restriction: restriction get used for select condition
		// Projection: projection get used for select column or aggregate
	}
}
