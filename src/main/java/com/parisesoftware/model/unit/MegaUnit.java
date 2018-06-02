package com.parisesoftware.model.unit;

/**
 * @author  Andrew Parise
 * @since   March 12, 2017
 * @version June 2, 2018
 *
 * Logic Model for a Mega* Metric Unit
 */
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
