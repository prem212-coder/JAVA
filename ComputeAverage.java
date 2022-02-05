import java.util.*;  // Scanner is in java.util package
    class ComputeAverage{
    	public static void main(String[] args){
            
            //prompt the user to enter three numbers
    		System.out.print("Please enter the value 3 numbers : ");
    		Scanner input = new Scanner(System.in);  // create a scanner  object

            double number1 = input.nextDouble();
            double number2 = input.nextDouble();
            double number3 = input.nextDouble();

            //compute average
            double average = (number1 + number2 + number3) / 3;

            //disply the result
            System.out.println("The average of " + number1 + " " + number2 + " " + number3 + " is " + average);

    	}
    }
