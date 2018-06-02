package com.parisesoftware.model.unit;

/**
 * @author  Andrew Parise
 * @since   March 12, 2017
 * @version June 2, 2018
 *
 * Abstraction for length units
 *
 */
public interface IUnit {

    /**
     * @return name of the unit
     */
	String toString();

    /**
     * @param value the value from the class' unit
     * @return convert to length unit
     */
	double Convert(double value);
	
}
