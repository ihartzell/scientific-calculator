import java.util.Scanner;
public class ScientificMemoryCalculator extends MemoryCalculatorBluePrint	// This class is an extension of the MemoryCalculatorBluePrint class.
{																			// It inherits all public methods allowing me to make it so I only have
	public static int displayMenu()											// to add new aspects of the program. Namely, the power method and the
	{																		// logarithm method, as well as adding two new menu options.
		Scanner input = new Scanner(System.in);
		
		int numberChoice;
		System.out.println("Menu");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("5. Power ");
		System.out.println("6. Logarithm ");
		System.out.println("7. Clear ");
		System.out.println("8 Quit \n");
		System.out.print("What would you like to do? Pick a number 1-6:");
		numberChoice = input.nextInt();
			
		while (numberChoice < 1 || numberChoice > 8)
		{
			System.out.println("I'm sorry," + numberChoice + " wasn't one of the options.\n");
			System.out.println("Menu");
			System.out.println("1. Add");
			System.out.println("2. Subtract");
			System.out.println("3. Multiply");
			System.out.println("4. Divide");
			System.out.println("5. Power ");
			System.out.println("6. Logarithm ");
			System.out.println("7. Clear ");
			System.out.println("8 Quit \n");
			System.out.print("What would you like to do? Pick a number 1-6:");
			numberChoice = input.nextInt();
		}	
		return numberChoice;
	}
		
	public void power(double operand2)										// power method
	{
		operand2 = getOperand("What is the second number?");
		setCurrentValue(Math.pow(getCurrentValue(), operand2));	
	}
	public void logarithm (double operand2)									// natural logarithm method
	{
		setCurrentValue( Math.log(getCurrentValue()));
	}
	
}
