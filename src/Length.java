import Units.IUnit;

public class Length {
	private IUnit _unit;
	private double _value;
	
	public enum Unit{
		//enter here all of the units implemented by the IUnit interface
		Base, Tera, Giga, Mega, Kilo, Deci, Centi, Mili, Micro, Nano
	}
	public enum ComparisonResult{
		//used for the compareTo function
		greaterThan {
			@Override
			public String toString(){
				return "greater than";
			}
		}, 
		equalTo {
			@Override
			public String toString(){
				return "equal to";
			}
		}, 
		lessThan {
			@Override
			public String toString(){
				return "less than";
			}
		}
	}
	
	public Length(double value, Unit unit){
		setValue(value);
		setUnit(unit);
	}
	
	public String toString(){
		//converts the length into a string
		String unitPlural = "";
		double value = getValue();
		if(value > 1){
			unitPlural = "s";
		}
		return getValue() + " " + getUnit().toString() + unitPlural;
	}
	 
	public ComparisonResult compareTo(Length length){
		//Compares this object's length to the argument's length
		double lengthVal1 = getUnit().Convert(getValue());
		double lengthVal2 = length.getUnit().Convert(length.getValue());
		
		if(lengthVal1 < lengthVal2){
			return ComparisonResult.greaterThan;
		}else if(lengthVal1 > lengthVal2){
			return ComparisonResult.lessThan;
		}else{
			return ComparisonResult.equalTo;
		}
	}
	
	//Getters and Setters
	public double getValue(){
		//returns the value of the Length
		return _value;
	}
	public IUnit getUnit(){
		//returns the unit
		return _unit;
	}
	public void setValue(double value){
		//sets the value of the length
		_value = value;
	}
	public void setUnit(Unit unit){
		//sets the unit
		UnitFactory factory = new UnitFactory();
		_unit = factory.getUnit(unit);
	}
}
