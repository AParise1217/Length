package Units;

public class DeciUnit implements IUnit {

	@Override
	public double Convert(double value) {
		// 10^-1
		return (value * 10);
	}
	
	@Override
	public String toString(){
		return "decimeter";
	}

}
