package hibernate.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

public class HibernateConfiguration {

	 public static SessionFactory getSaessionFactory(){
		 Properties ps = new Properties();
		 ps.put(Environment.DIALECT,"org.hibernate.dialect.MySQLDialect");
		 ps.put(Environment.URL, "jdbc:mysql://localhost:3306/mydata");
		 ps.put(Environment.USER, "root");
		 ps.put(Environment.PASS, "root");
		 ps.put(Environment.HBM2DDL_AUTO, "create");
		 ps.put(Environment.SHOW_SQL, "true");
		 ps.put(Environment.FORMAT_SQL, "true");
		 
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().applySettings(ps).build();
		MetadataSources meta = new MetadataSources(ssr).addAnnotatedClassName("hibernate.entity.HEmployee");
		SessionFactory sf = meta.buildMetadata().buildSessionFactory();
		return sf;
	 }
}
