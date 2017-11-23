package com.mtc.util;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

//import com.actionbazaar.Address;
//import com.actionbazaar.BidsClass;
import com.actionbazaar.Category;
//import com.actionbazaar.Billing;
//import com.actionbazaar.CreditCard;
//import com.actionbazaar.BidsClass;
import com.actionbazaar.ItemEntityClass;
import com.mtc.app.products;
//import com.classicmodels.Customers;
//import com.classicmodels.Orders;
//import com.mtc.app.products;
//import com.classicmodels.Customers;
import com.mtc.app.suppliers;

public class HibernateClass {
private static SessionFactory sessionFactory;
		
		static{
			
			Configuration configuration = new Configuration();
			configuration.configure();
			configuration.addAnnotatedClass(products.class);
			configuration.addAnnotatedClass(suppliers.class);
			//configuration.addAnnotatedClass(ItemEntityClass.class);
			//configuration.addAnnotatedClass(BidsClass.class);
			//configuration.addAnnotatedClass(Customers.class);
			//configuration.addAnnotatedClass(Address.class);
			//configuration.addAnnotatedClass(CreditCard.class);
			//configuration.addAnnotatedClass(Billing.class);
			//configuration.addAnnotatedClass(Category.class);
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			
		}
		
		public static SessionFactory getSessionFactory() {
			return sessionFactory;
		}

	}



