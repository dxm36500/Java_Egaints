
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
