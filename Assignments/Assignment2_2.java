public class calculator {

		int val1;
		int val2;
		
		calculator(int a,int b){
			this.val1 = a;
			this.val2 = b;
		}
		void add(int a, int b){
			System.out.println("adding numbers: " + (a+b));
		}
		void add(char a, char b){
			System.out.println("adding characters: " + (a+b));
		}
		
		void Sub(){
			System.out.println("Subtraction: " + (val1 - val2));
		}
			
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			calculator c = new calculator(2,3);
			calculator c1 = new calculator(4,2);
			c.add(5,6);
			c.Sub();
			c1.add('A','B');
			c1.Sub();

		}

	}


