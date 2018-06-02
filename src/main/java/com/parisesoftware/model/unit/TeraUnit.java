package com.parisesoftware.model.unit;

/**
 * @author  Andrew Parise
 * @since   March 12, 2017
 * @version June 2, 2018
 *
 * Logic Model for a Tera* Metric Unit
 */
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
