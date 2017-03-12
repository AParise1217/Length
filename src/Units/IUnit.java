package Units;

public interface IUnit {
	
	String toString(); //returns name of the unit
	
	double Convert(double value); 
	//converts the value from the class' unit to the base unit (used for comparing values)
	//i.e. convert to meter unit
	
}
