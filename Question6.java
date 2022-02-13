import java.util.Scanner;
class Question6{
	public static void main(String[] args) {
		
		int number,sum,a,b,c,d;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000:  ");

		number = input.nextInt();

		a = number%10;
		b = (number/10)%10;
		c = (number/10)/10%10;
		d = ((number/10)/10)/10;

        sum = a + b + c + d ;
       //int sumtotal = sum%10;

        System.out.println("The sum of the digits is  " + sum );


	}
}