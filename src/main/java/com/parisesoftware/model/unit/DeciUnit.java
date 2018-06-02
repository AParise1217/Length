package com.parisesoftware.model.unit;

/**
 * @author  Andrew Parise
 * @since   March 12, 2017
 * @version June 2, 2018
 *
 * Logic Model for a Deci* Metric Unit
 */
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
