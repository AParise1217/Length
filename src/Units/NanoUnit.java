package Units;

public class NanoUnit implements IUnit {

	@Override
	public double Convert(double value) {
		// 10^-9
		return (value * 1000000000);
	}

	@Override
	public String toString(){
		return "nanometer";
	}
}
