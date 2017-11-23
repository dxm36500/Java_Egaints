//Book.java
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
====================================================
 
//bookdetail.java

public class bookdetail {
	private int bookid;
	private int bookpages;
	
	book book1;
	public bookdetail(int bookid, int bookpages) {
		super();
		this.bookid = bookid;
		this.bookpages = bookpages;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public int getBookpages() {
		return bookpages;
	}
	public void setBookpages(int bookpages) {
		this.bookpages = bookpages;
	}
	
}
===================================================
//OnetoOne.java

public class OnetoOne {

	public static void main(String args[])
	{
		book b=new book(100,"2States","Chetan");
		bookdetail bd=new bookdetail(100,380);
		bd.book1=b;
		System.out.println("Author Name:  " +bd.book1.getBookauthor());
		System.out.println("Book Name:  " +bd.book1.getBookname());
		
	}

	 
}
