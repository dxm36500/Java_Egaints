
public abstract class Cycle implements Bicycle{
		
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

	    public int applyBrakes(int decrement) {
	        speed = speed*10 - decrement;
	        System.out.println("New Speed in Cycle Class " +speed);
	        return speed;
	        
	    
	    }
	}


