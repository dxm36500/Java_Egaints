
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


import com.mtc.app.products;
import com.mtc.util.*;


public class Test {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateClass.getSessionFactory();
		
		Session session = sessionFactory.openSession();
	
		@SuppressWarnings("unchecked")
		Query<>=session.createQuery("from products p where p.name like ? ").list();
		products.setParameters()

		for(products pro:products)
		{
			System.out.println(pro.getId());
			System.out.println(pro.getName());
			System.out.println(pro.getDescription());
			System.out.println(pro.getPrice());
			System.out.println();
		}
		session.close();
		
		sessionFactory.close();
		
	}

}
