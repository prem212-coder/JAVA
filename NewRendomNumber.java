import java.util.Scanner;
	public class NewRendomNumber{
		public static void main(String[] args) {
			
			int number1 = (int)(Math.random() * 100);
			int number2 = (int)(Math.random() * 100);

            int guess = number1 + number2;

			System.out.println(number1 + " + " + number2  + " = " + "?");

			Scanner input = new Scanner(System.in);
			System.out.print("Enter the total of two number : ");

			int total = input.nextInt();

            if(total == guess)
            	System.out.println("YOU WIN");
            else
            	System.out.print("YOU LOSE");

		}
	}