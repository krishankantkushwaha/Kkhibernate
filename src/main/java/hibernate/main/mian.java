package hibernate.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import hibernate.config.HibernateConfiguration;
import hibernate.entity.HEmployee;

public class mian {

	public static void main(String[] args) {
//		HEmployee emp = new HEmployee(7, "raj", "male", 36538, "TCS");
		SessionFactory sf = HibernateConfiguration.getSaessionFactory();
		Session session = sf.openSession();

// 		session.save(emp);
//		session.beginTransaction().commit();

		// Defference load and get yadi object nhi milega (mtlb glt dalne pr) to load method exception dega or get method null return karega
//		HEmployee em = session.get(HEmployee.class,3);

//		HEmployee em = session.load(HEmployee.class, 38);
//        System.out.println(em);

		System.out.println("mian.main()");
		sf.close();
	}

}
