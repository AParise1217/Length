package Units;

public class BaseUnit implements IUnit {

	@Override
	public double Convert(double value) {
		// 10^0
		return value;
	}
	
	@Override
	public String toString(){
		return "meter";
	}

}
