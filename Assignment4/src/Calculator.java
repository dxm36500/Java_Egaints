interface Calculator1 {

		void add(int c,int d);
		
		}

	public class Calculator implements Calculator1{

		
		public void add(int a,int b){
			System.out.println("addtion: " + (a+b));
		}
		
			
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Calculator c = new Calculator();
			c.add(3,2);			

		}

	}


