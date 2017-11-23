
public class circle {

	int r;
	float d;
	final float pi=3.14f;
	
	//constructor
	
	circle(int r,float d)
	{
		this.r=r;
		this.d=d;
	}
	
	//method over loading	
	float Area(int r)
	{
		
		System.out.println("Area of the circle with radius is : " + (float)pi*r*r);
		return ((float)pi*r*r);
	}
	
	float Area(float d)
	{
		System.out.println("Area of the circle with diameter is : " + (float)((pi*d*d)/4));
				return (float)((pi*d*d)/4);
	}
	
	float Perimeter()
	{
		System.out.println("Perimeter of circle is : " + (float)2*pi*r);
		return (float)2*pi*r;
	}
	
	public static void main(String[] args) {
		
		circle a1= new circle(3,6);
		a1.Area(8.5f);
		a1.Area(4);
		a1.Perimeter();

		circle a2= new circle(4,8);
		a2.Area(5);
		a2.Area(1.3f);
		a2.Perimeter();
	}
}