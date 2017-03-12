import Units.*;

public class UnitFactory {
	
	public IUnit getUnit(Length.Unit unit){
		switch(unit) {
			case Tera:
				return new TeraUnit();
			case Mega:
				return new MegaUnit();
			case Kilo:
				return new KiloUnit();
			case Deci:
				return new DeciUnit();
			case Centi:
				return new CentiUnit();
			case Mili:
				return new MiliUnit();
			case Giga:
				return new GigaUnit();
			case Nano:
				return new NanoUnit();
			case Micro:
				return new MicroUnit();
			default:
				return new BaseUnit();
		}
	}
}
