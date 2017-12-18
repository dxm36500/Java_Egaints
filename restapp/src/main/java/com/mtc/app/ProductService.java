package com.mtc.app;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mtc.util.HibernateClass;




@Path("/productservice")
public class ProductService {
	
	
	private SessionFactory sessionfactory;
	
	public ProductService()
	{
		sessionfactory=HibernateClass.getSessionFactory();
	}
	
	@Path("/{id}")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public products getproductId(@PathParam("id") int id)
	{
		Session session=sessionfactory.openSession();
		
		products product=session.get(products.class, id);
		
		System.out.println("Product id "+product.getId());
		System.out.println("Product id "+product.getName());
		
		session.close();
		
		return product;
		
	}
	
	
	@Path("/{add}")
	@POST
	public void addproduct(@FormParam("id") int id,@FormParam("name") String name, 
			@FormParam("description") String desc,@FormParam("price") float price)
	{
		System.out.println("Product Details: "+id+"  "+name+"  "+desc+"  "+price);
	}
 
}
