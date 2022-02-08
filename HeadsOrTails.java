import java.util.Scanner;
	public class HeadsOrTails{
		public static void main(String[] args) {

			int number = (int)(Math.random() * 10);

			//System.out.println(Math.random() * 10);
			System.out.println(number);
			
			Scanner input = new Scanner(System.in);

			System.out.println("Guess the it is (heads = 0  or tails = 1) : ");
			int guess = input.nextInt();

            if (number == guess) {
           		System.out.println("Your guess is correct");
            	
            } 

            else
            	System.out.println("Your guess is incorrect");
		}
	}