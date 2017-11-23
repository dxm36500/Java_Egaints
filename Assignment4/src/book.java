
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
