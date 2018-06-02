package com.parisesoftware.model.unit;

/**
 * @author  Andrew Parise
 * @since   March 12, 2017
 * @version June 2, 2018
 *
 * Logic Model for a Centi* Metric Unit
 */
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
