
public interface Bicycle {

	//this variable is public static and final by default

	   String color="Black";
	   
	 //All methods are abstract here
	 
	    void changeCadence(int newValue);

	    void changeGear(int newValue);

	    void speedUp(int increment);

	    int applyBrakes(int decrement);
}
