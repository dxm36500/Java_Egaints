// Bicycle Class  @It is Superclass

public class Bicycle {
	
	public int cadence= 0;
	protected int speed =1;
	int gear =1;
	public void changeCadence(int newValue) {
        cadence = newValue;
   }

   void changeGear(int newValue) {
        gear = newValue;
  System.out.println("Gear value in Bicycle class " +gear );
   }

  public void speedUp(int increment) {
        speed = speed + increment;   
       
   }
      int applyBrakes(int decrement) {
        speed = speed - decrement;
        return speed;
   }

}
------------------------------------------------
//MountainBike.java

public class MountainBike extends Bicycle {
	
	
	//override speedup method
	public void speedUp(int increment) {
	        speed = speed + increment*2; 
	        System.out.println("Overrided speed in speedup method is " + speed);
	        
	   }

	// Increasing visibility of over-ridden method from default to protected
	protected   int applyBrakes(int decrement) {
	        speed = speed*2 - decrement;
	        System.out.println("Overrided speed in applybrakes method is  " + speed);
	        return speed;
	   }
	 
}

------------------------------------------------
//RoadBike.java

public class RoadBike extends Bicycle {
	//can access methods of superclass
	
	//Defining child specific methods also
	int capacity;

	void engine_capacity(int newcapacity)
	{
		int capacity=newcapacity;
		System.out.println("Capacity in RoadBike Method  " +capacity);
	}

}

// Tandem is not public class still it is accessible in assignment3 class since both are in same package

class Tandem extends Bicycle {
	//access methods of superclass
	
	//Defining child specific methods
	
	void bike_model(String Model)
	{
		String model=Model;
		System.out.println("Model of Tandem Bicycle " +model);
	}

}

-------------------------------------------------------


public class assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Mountain Bike Class
		MountainBike mb = new MountainBike();
		mb.speedUp(3);
		mb.applyBrakes(2);
		// Accessing super class method with child class object @Inheritance Concept
		mb.changeGear(5);
		//Road Bike Class
		RoadBike rb=new RoadBike();
		rb.changeGear(2);
		rb.engine_capacity(5000);
		Tandem td=new Tandem();
		td.bike_model("SS32d");
		
	}

}
