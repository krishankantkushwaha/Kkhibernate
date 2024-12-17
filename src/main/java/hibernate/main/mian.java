package hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibernate.entity.HEmployee;

public class mian {

	public static void main(String[] args) {
		HEmployee emp = new HEmployee(1,"krishna","male",65533);
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(emp);
		tx.commit();
		System.out.println("mian.main()");
	}

}
