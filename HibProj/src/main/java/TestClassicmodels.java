import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.classicmodels.Customers;
import com.classicmodels.Orders;
import com.mtc.util.HibernateClass;

public class TestClassicmodels {

	public static void main(String[] args) {
		
		
		Customers customer=new Customers(701,"Bhanu","Madike","Anu",new BigDecimal(987354623),"Khammam", "Khammam","Telangana", 52113, "India");
		
		Orders orders1=new Orders(903, new Date(0), new Date(0), new Date(0),"Success");
		Orders orders2=new Orders(904, new Date(0), new Date(0), new Date(0),"Failure");
		Orders orders3=new Orders(905, new Date(0), new Date(0), new Date(0),"Failure");
		
		Set<Orders> order=new HashSet<Orders>();
		
		order.add(orders1);
		order.add(orders2);
		order.add(orders3);
		
		customer.setOrder(order);
		
			
		SessionFactory sessionFactory = HibernateClass.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction t=session.getTransaction(); //For Non-Select Operations
		
		t.begin();
		
		session.save(customer); 
		
		t.commit();
		
		session.close();
		
		sessionFactory.close();


	}

}
