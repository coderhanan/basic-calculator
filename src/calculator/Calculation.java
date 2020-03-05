package calculator;

import java.util.Scanner;

public class Calculation {
	
	public static void maincalculations() {
		
	//Adding
	
	Scanner useraddnum1 = new Scanner (System.in);
	System.out.println("Enter a number for addition");
	
	float addnum1 = useraddnum1.nextFloat();
	
	Scanner useraddnum2 = new Scanner (System.in);
	System.out.println("Enter another number for addition");
	
	float addnum2 = useraddnum2.nextFloat();
	
	float addition = addnum1+addnum2;
	
	System.out.println("Your sum is "+addition);
	
	//Substracting
	
	Scanner usersubnum1 = new Scanner (System.in);
	System.out.println("Enter a number for substraction");
	float subnum1 = usersubnum1.nextFloat();
	
	Scanner usersubnum2 = new Scanner (System.in);
	System.out.println("Enter another number for substraction");
	float subnum2 = usersubnum2.nextFloat();
	
	float substraction = subnum1 - subnum2;
	
	System.out.println("Your substraction gives "+substraction);
	
	
	//division 
	
	Scanner userdivnum1 = new Scanner (System.in);
	System.out.println("Enter a number for dividing");
	float divnum1 = userdivnum1.nextFloat();
	
	Scanner userdivnum2 = new Scanner (System.in);
	System.out.println("Enter another number for dividing");
	float divnum2 = userdivnum2.nextFloat();
	
	float divide = divnum1 / divnum2;
	
	System.out.println("Division of your numbers give us "+divide);
	
	//multiplication
	
	Scanner usermultinum1 = new Scanner (System.in);
	System.out.println("Enter a number for multiplicaiton");
	float mutlinum1 = usermultinum1.nextFloat();
	
	Scanner usermultinum2 = new Scanner (System.in);
	System.out.println("Enter another number for multiplication");
	float multinum2 = usermultinum2.nextFloat();
	
	float multiplication = mutlinum1 * multinum2;
	
	System.out.println("Multiplication of your number gives us "+multiplication);
	
	
	}
	
	
	
}
