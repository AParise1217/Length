package Units;

public class MegaUnit implements IUnit {

	@Override
	public double Convert(double value) {
		// 10^6
		return (value / 1000000);
	}

	@Override
	public String toString(){
		return "megameter";
	}
}
