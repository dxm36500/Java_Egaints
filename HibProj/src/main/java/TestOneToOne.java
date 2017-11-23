import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.actionbazaar.Address;
import com.actionbazaar.Billing;
import com.actionbazaar.CreditCard;
import com.mtc.util.HibernateClass;

public class TestOneToOne {

	public static void main(String[] args) {
		
        SessionFactory sessionFactory = HibernateClass.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction t=session.getTransaction(); //For Non-Select Operations
			 
		CreditCard card=new CreditCard(987l, "Sandy","987678653", "Jan", "2024", "437");
		
		Address billing_address=new Address(7654,"Masab Tank", "Hyderabad", "Telangana", "India", "52113");
		
		Billing billing=new Billing(557l,billing_address,card);
		
		t.begin();
		
		session.save(billing);
		
		t.commit();
		
		session.close();
		
		sessionFactory.close();
		

	}

}
