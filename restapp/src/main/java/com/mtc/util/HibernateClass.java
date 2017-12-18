package com.mtc.util;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.mtc.app.products;


public class HibernateClass {
private static SessionFactory sessionFactory;
		
		static{
			
			Configuration configuration = new Configuration();
			configuration.configure();
			configuration.addAnnotatedClass(products.class);
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			
		}
		
		public static SessionFactory getSessionFactory() {
			return sessionFactory;
		}

	}



