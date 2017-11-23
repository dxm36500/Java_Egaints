
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
