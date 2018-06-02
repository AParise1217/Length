package com.parisesoftware.model;

import com.parisesoftware.model.unit.IUnit;

/**
 * @author  Andrew Parise
 * @since   March 12, 2017
 * @version June 2, 2018
 *
 * Composition of a Unit and a Value to Logically Model Distance
 */
public class Length {
	private IUnit unit;
	private double value;

    /**
     * Default Constructor
     */
	public Length(){}

    /**
     * Constructor taking params
     * @param value the value of this length
     * @param unit  the unit of this length
     */
	public Length(double value, IUnit unit){
		this.value = value;
		this.unit = unit;
	}

    /**
     * @return this length represented as a string
     */
	public String toString(){
		//converts the length into a string
		String unitPlural = "";
		double value = getValue();
		if(value > 1){
			unitPlural = "s";
		}
		return getValue() + " " + getUnit().toString() + unitPlural;
	}

    /**
     * @return the value of the Length
     */
	public double getValue(){
		return value;
	}

    /**
     * @return the unit
     */
	public IUnit getUnit(){
		return unit;
	}

    /**
     * Setter for the value of the length
     * @param value the value to be associated with this length
     */
	public void setValue(double value){
		this.value = value;
	}

    /**
     * Setter for the unit of the length
     * @param unit  the unit to be associated with this length
     */
	public void setUnit(IUnit unit){
		this.unit = unit;
	}
}
