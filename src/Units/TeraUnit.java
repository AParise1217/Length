package Units;

public class TeraUnit implements IUnit {


	@Override
	public double Convert(double value) {
		// 10^12
		return (value / 1000000000000.0);
	}

	@Override
	public String toString(){
		return "terameter";
	}
}
