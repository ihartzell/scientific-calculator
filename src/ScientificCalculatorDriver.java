// Hartzell Isaac
// March 28, 2017
// This program demonstrates the use of inheritance via classes.

import java.util.Scanner;
public class ScientificCalculatorDriver 
{
	public static void main(String[] args) 
	{
		int numberChoice = 0;
		double operand2 = 0;	
		
		ScientificMemoryCalculator primaryProgramObj = new ScientificMemoryCalculator();	// primaryProgramObj variable is an object or a 		
																							// instance of the ScientificMemoryCalculator class
		do																					
		{
			System.out.println("The current value is " + primaryProgramObj.getCurrentValue() + "\n");
			
			numberChoice = primaryProgramObj.displayMenu();			// Since promaryProgramObj is an object I can call for methods from my classes.
				
			if (numberChoice == 1)
			{
				primaryProgramObj.add(operand2);					// Add
			}
				
			else if (numberChoice == 2)
			{
				primaryProgramObj.subtract(operand2);				// Subtract
			}
				
			else if (numberChoice == 3)								// Multiply
			{
				primaryProgramObj.multiply(operand2);
			}
				
			else if (numberChoice == 4)								//Divide
			{
				primaryProgramObj.divide(operand2);
			}
			else if(numberChoice == 5)	// power					// Raise a number to a power
			{
				primaryProgramObj.power(operand2);
			}
			else if (numberChoice == 6)	// Logarithm				// Get natural Log
			{
				primaryProgramObj.logarithm(operand2);
			}	
			else if (numberChoice == 7)
			{
				primaryProgramObj.clear();							// Clear the current number
			}
				
			else if (numberChoice == 8)								// Exit	
			{
				System.out.println("Goodbye! Thank you for using Isaac's calculator.");	
			}
				
		}while(numberChoice >=1 && numberChoice <= 7);

	}

}
