//Interface Concept

interface Bicycle {

 //this variable is public static and final by default

   String color="Black";
   
 //All methods are abstract here
 
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    int applyBrakes(int decrement);
}
====================================================

//Cycle.java

public abstract class Cycle implements Bicycle {
	
	int cadence= 0;
	int speed =1;
	int gear =1;
	
	//only 3 abstract methods are defined in this class
	
	public void changeCadence(int newValue) 
	{
        cadence = newValue;
    }

    public void changeGear(int newValue) 
    {
	gear = newValue;
    }

     public int applyBrakes(int decrement) 
	 {
	        speed = speed*10 - decrement;
	        System.out.println("New Speed in Cycle Class " +speed);
	        return speed;
	        
	    
	 }

}
===================================================================

//sportsbike.java

public class sportsbike extends Cycle 
{

//Implementing 4th method in this class

public void speedUp(int increment) 
			{
				
		        speed = speed + increment; 
		        System.out.println("Speed in sportbike " +speed);
		        System.out.println("Accessing Variable from Interface , Color is "+color);
		     }
		 


 }
 
 ==================================================================
 
 //test.java

public class test {
	
		public static void main(String[] args) 
		{
			//we cannot create object for Cycle class since it is abstract
			sportbike sb=new sportbike();
			sb.applyBrakes(5);
			sb.speedUp(4);
			
		}

}
