package Units;

public class MiliUnit implements IUnit {

	@Override
	public double Convert(double value) {
		// 10^-3
		return (value * 1000);
	}

	@Override
	public String toString(){
		return "milimeter";
	}
}
