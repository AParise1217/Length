package com.parisesoftware.model.unit;

/**
 * @author  Andrew Parise
 * @since   March 12, 2017
 * @version June 2, 2018
 *
 * Logic Model for a Kilo* Metric Unit
 */
public class KiloUnit implements IUnit {

	@Override
	public double Convert(double value) {
		// 10^3
		return (value / 1000);
	}

	@Override
	public String toString(){
		return "kilometer";
	}
}
