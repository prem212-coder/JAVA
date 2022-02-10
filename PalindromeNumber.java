import java.util.Scanner;
	public class PalindromeNumber{
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);

		    System.out.print("Enter the number :  ");
		    int number = input.nextInt();

		    int a,b,c;

		    a = number % 10;
		    b =(number % 10 )/10;
		    c =((number % 10)/10)/10;

		    System.out.print(a+"'"+b+","+c);

		/*   String palindrome = "";

		    palindrome += a;
		    palindrome += b;
		    palindrome += c; 

           int i = Integer.parseInt(palindrome);

		    if (i == number ) {

		    	System.out.println( number + " is a Palindrome");
		    	
		    }
		    else 
		    	System.out.println(number + " is not Palindrome"); */
		}
	}