import java.util.Scanner;
 public class Chapter3Exp4{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");

        int number = input.nextInt();

        if(number % 2 == 0)
        	System.out.print(number + " is even.");
        else
        	System.out.print(number + "is odd.");



        if (number % 2 == 0)
        	System.out.print(number + " is even.");
        
        	System.out.print(number + " is odd.");

	}
}