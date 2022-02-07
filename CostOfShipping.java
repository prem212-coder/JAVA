import java.util.Scanner;
	public class CostOfShipping{
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);

			System.out.print("Enter the Weight of package : ");
			int weight = input.nextInt();

			if (weight > 0 & weight <= 1) {
				System.out.println("Your Shipping cost 3.5 $ ");
			 } 
 			else if (weight > 1 & weight <= 3) {
 				System.out.println("Your Shipping cost 5.5 $ ");
 			}
 			else if (weight > 3 & weight <= 10) {
 				System.out.println("Your Shipping cost 8.5 $ ");
 			}
 			else if (weight > 10 & weight <= 20) {
 				System.out.println("Your Shipping cost 10.5 $ ");
 			}
 			else if (weight > 20 & weight <= 30) {
 				System.out.println("Your Shipping cost 12.5 $ ");
 			}
 			else if (weight > 30 & weight <= 40) {
 				System.out.println("Your Shipping cost 14.5 $ ");
 			}
 			else if (weight > 40 & weight <= 50) {
 				System.out.println("Your Shipping cost 16.5 $ ");
 			}
 			else
 				
 				System.out.println("  The Package cannot be shipped  ");
 				
		}
	}