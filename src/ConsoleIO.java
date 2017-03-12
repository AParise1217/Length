import java.util.List;
import java.util.Scanner;

public class ConsoleIO {
	//Handles all user input through the console for getting values for the construction of a length object
	
	private double getUserInput_double(){
		
		Scanner userInput = new Scanner(System.in);
		return userInput.nextDouble();
	}
	
	private int getUserInput_int(){
		
		Scanner userInput = new Scanner(System.in);
		return userInput.nextInt();
	}
	
	public Length.Unit getUnit(){
		System.out.println("Please enter number corresponding to the unit: ");
		List<Length.Unit> unitTypes = java.util.Arrays.asList(Length.Unit.values());
		for(int i = 0; i < unitTypes.size(); i++){
			System.out.println("[" + i + "]: " + unitTypes.get(i).toString());
		}
		System.out.print(">");
		int userSelection = getUserInput_int();

		return unitTypes.get(userSelection);
	}
	
	public double getValue(){
		System.out.println("Please enter a value: ");
		System.out.print(">");
		return getUserInput_double();
	}
}
