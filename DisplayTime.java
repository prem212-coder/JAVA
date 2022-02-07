import java.util.Scanner;

public class DisplayTime{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Prompt the user for input
		System.out.print("Enter the integer for second: ");
		int seconds = input.nextInt();

		int minutes = seconds / 60; // find mints in seconds
		int remainingSeconds = seconds % 60; // Seconds remaining
		System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds ");

	}
}