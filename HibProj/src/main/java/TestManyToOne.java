
import java.sql.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.actionbazaar.BidsClass;
import com.actionbazaar.ItemEntityClass;
import com.mtc.util.HibernateClass;

public class TestManyToOne {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		ItemEntityClass item = new ItemEntityClass(107,"Samsung Galaxy",new Date(0),7646.9f,new Date(0),new Date(0));
		
		BidsClass bid1 = new BidsClass(987,7987.3f,new Date(0),item);	
		
		BidsClass bid2 = new BidsClass(432,8342.4f,new Date(0),item);
		
		SessionFactory sessionFactory = HibernateClass.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction t=session.getTransaction(); //For Non-Select Operations
		
		t.begin();
		
		session.save(bid1); 
		
		session.save(bid2); 
		
		t.commit();
		
		session.close();
		
		sessionFactory.close();

	}

}
