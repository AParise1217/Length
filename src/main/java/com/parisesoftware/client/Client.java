package com.parisesoftware.client;

import com.parisesoftware.comparator.EqualityType;
import com.parisesoftware.comparator.LengthComparator;
import com.parisesoftware.model.Length;
import com.parisesoftware.model.unit.UnitFactory;
import com.parisesoftware.model.unit.UnitType;

/**
 * @author  Andrew Parise
 * @since   March 12, 2017
 * @version June 2, 2018
 */
public class Client {
	//Test Class used to QA Classes defined in Project

	public static void main(String[] args){

		ConsoleIO userInput = new ConsoleIO();

		System.out.println("Length 1: ");

		UnitType len1_Unit = userInput.getUnit();
		double len1_Value = userInput.getValue();

		System.out.println("Length 2: ");
		UnitType len2_Unit = userInput.getUnit();
		double len2_Value = userInput.getValue();

		UnitFactory factory = new UnitFactory();

		Length len1 = new Length(len1_Value, factory.getUnit(len1_Unit));
		Length len2 = new Length(len2_Value, factory.getUnit(len2_Unit));

        LengthComparator comparator = new LengthComparator();

		EqualityType compareResult = comparator.compare(len1, len2);

		System.out.println(len1.toString() + " (Length 1) is " + compareResult.toString() + " " + len2.toString() + " (Length 2)");
	}

}
