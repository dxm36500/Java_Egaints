
public class bookdetail {
	private int bookid;
	private int bookpages;
	
	book book1;
	public bookdetail(int bookid, int bookpages) {
	
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
