
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
