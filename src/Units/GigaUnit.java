package Units;

public class GigaUnit implements IUnit {

	@Override
	public double Convert(double value) {
		// 10^9
		return (value / 1000000000);
	}

	@Override
	public String toString(){
		return "gigameter";
	}
}
