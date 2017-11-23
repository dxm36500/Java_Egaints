
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.actionbazaar.BidsClass;
import com.actionbazaar.ItemEntityClass;
import com.mtc.util.HibernateClass;

public class TestOneToMany {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ItemEntityClass item = new ItemEntityClass(102,"Daikin",new Date(0),1221.8f,new Date(0),new Date(0));
		
		BidsClass bid1 = new BidsClass(774,7654.9f,new Date(0));	
		
		BidsClass bid2 = new BidsClass(324,8765.9f,new Date(0));
		
		Set<BidsClass> bids = new HashSet<BidsClass>();
		
		bids.add(bid1);
		bids.add(bid2);
		
		item.setBids(bids);
		
		SessionFactory sessionFactory = HibernateClass.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction t=session.getTransaction(); //For Non-Select Operations
		
		t.begin();
		
		session.save(item); 
		
		
		
		t.commit();
		
		session.close();
		
		sessionFactory.close();

	}

}
