import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.actionbazaar.Category;
import com.actionbazaar.ItemEntityClass;
import com.mtc.util.HibernateClass;

public class TestManyToMany {

	public static void main(String[] args) {
     SessionFactory sessionFactory = HibernateClass.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		Category c1=new Category(300l,"Electronics",new Date(0));
		Category c2=new Category(301l,"Furniture",new Date(0));
		
		Set<Category> category=new HashSet<Category>();
		category.add(c1);
		category.add(c2);
		ItemEntityClass item1=new ItemEntityClass(103, "MAC Book", new Date(0), 480.5f, new Date(0), new Date(0), category);
		ItemEntityClass item2=new ItemEntityClass(104, "Lenovo", new Date(0), 650.5f, new Date(0), new Date(0), category);
		
		Transaction t=session.getTransaction();
		
		t.begin();
		
		session.save(item1);
		session.save(item2);
		
		session.close();
		sessionFactory.close();
	}

}
