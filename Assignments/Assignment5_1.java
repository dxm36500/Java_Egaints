//book.java
                                                                                                                                            
public class book {                                                                                                                         
                                                                                                                                            
	private int bookid;                                                                                                                     
	private String bookname;                                                                                                                
	private String bookauthor;                                                                                                              
	                                                                                                                                        
	 public book() {                                                                                                                        
		                                                                                                                                    
		                                                                                                                                    
	}                                                                                                                                       
	public book(int bookid, String bookname, String bookauthor) {                                                                           
		                                                                                                                                    
		this.bookid = bookid;                                                                                                               
		this.bookname = bookname;                                                                                                           
		this.bookauthor = bookauthor;                                                                                                       
	}                                                                                                                                       
	public int getBookid() {                                                                                                                
                                                                                                                                            
		return bookid;                                                                                                                      
	}                                                                                                                                       
	public void setBookid(int bookid) {                                                                                                     
		this.bookid = bookid;                                                                                                               
	}                                                                                                                                       
	public String getBookname() {                                                                                                           
		return bookname;                                                                                                                    
	}                                                                                                                                       
	public void setBookname(String bookname) {                                                                                              
		this.bookname = bookname;                                                                                                           
	}                                                                                                                                       
	public String getBookauthor() {                                                                                                         
		return bookauthor;                                                                                                                  
	}                                                                                                                                       
	public void setBookauthor(String bookauthor) {                                                                                          
		this.bookauthor = bookauthor;                                                                                                       
	}                                                                                                                                       
	                                                                                                                                        
	                                                                                                                                        
	                                                                                                                                        
                                                                                                                                            
}                                                                                                                                           
                                                                                                                                            
===================

//bookcategory.java



public class bookcategory {

	private String category;
	private String bookname;
	private book[] bk;
	
	
	public book[] getBk() {
		System.out.println("hello bookcat");
		return bk;
		
	}
	public void setBk(book[] bk) {
		this.bk = bk;
		
	}
	public bookcategory(String category, String bookname) {
		
		this.category = category;
		this.bookname = bookname;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	
}

=============================================
//onetomany.java

public class onetomany {

	public static void main(String args[])
	
	{
		bookcategory bc=new bookcategory("Fiction","Beloved");
		book[] b=new book[2];
		b[0]=new book(100,"Animal Farm","George Orwel");
		b[0]=new book(101,"3mistakes of my life","Chetan");
		bc.setBk(b);
		
		
	}
}
