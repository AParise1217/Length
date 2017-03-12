
public class Client {
	//Test Class used to QA Classes defined in Project
	
	
	
	public static void main(String[] args){
		
		ConsoleIO userInput = new ConsoleIO();
		
		System.out.println("Length 1: ");
		
		Length.Unit len1_Unit = userInput.getUnit();
		double len1_Value = userInput.getValue();
		
		System.out.println("Length 2: ");
		Length.Unit len2_Unit = userInput.getUnit();
		double len2_Value = userInput.getValue();
		
		Length len1 = new Length(len1_Value, len1_Unit);
		Length len2 = new Length(len2_Value, len2_Unit);

		Length.ComparisonResult compareResult = len1.compareTo(len2);
		System.out.println(len1.toString() + " (Length 1) is " + compareResult.toString() + " " + len2.toString() + " (Length 2)");
	}

}
