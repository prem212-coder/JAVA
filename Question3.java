import java.util.Scanner;
class Question3{
		public static void main(String[] args) {
		
		double feet,meters;

	 	Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for feet: ");

        feet = input.nextDouble();
        meters = feet/3.2808;

        System.out.println(feet + "feet is " + meters + " meters ");

	}
}