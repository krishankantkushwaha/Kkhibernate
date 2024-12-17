package hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import hibernate.config.HibernateConfiguration;
import hibernate.entity.HEmployee;

public class mian { 

	public static void main(String[] args) {
		HEmployee emp = new HEmployee(1,"charu","female",34675);
		SessionFactory sf = HibernateConfiguration.getSaessionFactory();
		Session session = sf.openSession();
 		session.persist(emp);
		session.beginTransaction().commit();
		sf.close();
		System.out.println("mian.main()");
	}

}
