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
		HEmployee emp = new HEmployee(7, "raj", "male", 36538, "TCS");
		SessionFactory sf = HibernateConfiguration.getSaessionFactory();
		Session session = sf.openSession();

// 		session.save(emp);
//		session.beginTransaction().commit();


//		HQL concept //
			// Example of hql to get all records
//			Query query = session.createQuery("from emp2");
//			List<HEmployee> list = query.list();
//			System.out.println(list);

			// for each use kiya hai line by line traversing ke liye/
//			for(HEmployee e:list) {
//				System.out.println(e);
//			}

			// Example of hql to get records with Pagination
//			Query query = session.createQuery("from emp2");
//			query.setFirstResult(4);
//		query.setMaxResults(3);
//			List list = query.list();
//			System.out.println(list);

			// Example of hql update Query using named parameter

//			Transaction tx = session.beginTransaction();
//			Query query = session.createQuery("update emp2 set name=:n where id=:i");
//			query.setParameter("n","Ramprakash");
//			query.setParameter("i",1);
//			int status = query.executeUpdate();
//			System.out.println(status);
//			tx.commit();

			// Example of hql delet Query
//			Query query = session.createQuery("delete from emp2  where id=1");
//			query.executeUpdate();
		
		
		
		
		               //NAMED QUERY Concept//
		
		     //findEmployeeById
//		Query<HEmployee> query = session.createNamedQuery("HEmployee.findEmployeeById",HEmployee.class);
//		query.setParameter("id",4);
//		
	                           //findByGender	
		Query<HEmployee> query = session.createNamedQuery("HEmployee.findByGender",HEmployee.class);
		query.setParameter("gender","male");
//		
		                   
		List<HEmployee> list = query.getResultList();
		System.out.println(list);
		
		
		sf.close();
		System.out.println("mian.main()");
	
	}

}