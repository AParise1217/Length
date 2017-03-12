package Units;

public class CentiUnit implements IUnit {

	@Override
	public double Convert(double value) {
		// 10^-2
		return (value * 100);
	}

	@Override
	public String toString(){
		return "centimeter";
	}
}
