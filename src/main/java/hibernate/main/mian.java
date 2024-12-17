package hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import hibernate.entity.HEmployee;

public class mian {

	public static void main(String[] args) {
//		HEmployee emp = new HEmployee(1,"krishna","male",65533);
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
//		SessionFactory sf = meta.buildSessionFactory();
		SessionFactory sf = new MetadataSources( new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build()).getMetadataBuilder().build().buildSessionFactory();
		Session session = sf.openSession();
		session.persist(emp);
		session.beginTransaction().commit();
		sf.close();
		System.out.println("mian.main()");
	}

}
