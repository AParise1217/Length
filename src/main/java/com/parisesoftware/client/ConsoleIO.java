package com.parisesoftware.client;

import com.parisesoftware.model.unit.UnitType;

import java.util.List;
import java.util.Scanner;

/**
 * @author  Andrew Parise
 * @since   March 12, 2017
 * @version June 2, 2018
 *
 * Handles retrieving user input through the console
 *
 */
public class ConsoleIO {

    /**
     * @return user input entered in console
     */
	private double getUserInput_double(){
		Scanner userInput = new Scanner(System.in);
		return userInput.nextDouble();
	}

    /**
     * @return user input entered in console
     */
	private int getUserInput_int(){

		Scanner userInput = new Scanner(System.in);
		return userInput.nextInt();
	}

    /**
     * Prompts the user to enter a unit, and returns the parsed value
     * @return the parsed unit
     */
	public UnitType getUnit(){
		System.out.println("Please enter number corresponding to the unit: ");
		List<UnitType> unitTypes = java.util.Arrays.asList(UnitType.values());
		for(int i = 0; i < unitTypes.size(); i++){
			System.out.println("[" + i + "]: " + unitTypes.get(i).toString());
		}
		System.out.print(">");
		int userSelection = getUserInput_int();

		return unitTypes.get(userSelection);
	}

    /**
     * Prompts the user to enter a value, and returns the parsed value
     * @return the parsed value
     */
	public double getValue(){
		System.out.println("Please enter a value: ");
		System.out.print(">");
		return getUserInput_double();
	}
}
