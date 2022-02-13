import java.util.Scanner;
class Question4{
	public static void main(String[] args) {
		
		double pounds,kilograms;

		Scanner input = new Scanner(System.in);
		System.out.print(" Enter a number in pounds: ");


        pounds = input.nextDouble();
        kilograms = pounds / 2.2046;

        System.out.println( pounds + " pounds is "  + kilograms  + " kilograms " );
	}
}