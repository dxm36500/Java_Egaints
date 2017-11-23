
//interface
 interface Circle {
	
		float pi=3.14f;
		float AreaWithRadius(int r);
		float AreaWithDiameter(int d);

	}

 
================================

//Ass4.java

public class Ass4 implements Circle{
	

		int r;
		int d;
			
		public float AreaWithRadius(int r)
		{
			return (float)pi*r*r;
		}
		
		public float AreaWithDiameter(int d)
		{
			return (float)((pi*d*d)/4);
		}
		
		float Perimeter(int r)
		{
			return (float)2*pi*r;
		}
		
		public static void main(String[] args) {
		
			Ass4 a1= new Ass4();
			System.out.println("Area of the circle with radius is : " +a1.AreaWithRadius(3));
			System.out.println("Area of the circle with diameter is : " +a1.AreaWithDiameter(6));
			System.out.println("Perimeter of circle is : " +a1.Perimeter(3));
		
		}
	}
