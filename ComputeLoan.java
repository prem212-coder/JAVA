import java.util.Scanner;
   public class ComputeLoan{
   	public static void main(String[] args) {
   		
   		//Create scanner
   		Scanner input = new Scanner(System.in);


   		//prompt the user to enter annualinterest rate.
   		System.out.print("Enter annual interest rate, e.g., 7.25%: ");
   		double annualinterestRate = input.nextDouble();

   		//obtain monthly interest rate 
   		double monthlyInterestRate = annualinterestRate / 1200;

   		System.out.print("Enter number of years as an integer, e.g., 5: ");
   		int numberOfYears = input.nextInt();

   		//Enter loan amount
   		System.out.print("Enter loan amount, e.g., 120000.95: ");
   		double loanAmount = input.nextDouble();

       //CALCUlate payment
   		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));

       //total payment
       double totalPayment = monthlyPayment * numberOfYears * 12;


       //Display results
       System.out.println("The monthly Payment is $ " + (int)(monthlyPayment * 100) / 100.0);
       System.out.println("The total payment is $ " + (int)(totalPayment * 100) / 100.0);
   			
   	
   	}
   }