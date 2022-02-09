import java.util.Scanner;
    public class LeapYear{
    	public static void main(String[] args) {
    		
            // A year is a leap year if it is divisible by 4 but not by 100, or if it is divisible by 400

    		Scanner input = new Scanner(System.in);
            System.out.println("Enter a year: ");
    		int year = input.nextInt();

    	    boolean	isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0); 

           System.out.println(year + " is a leap year ? " + isLeapYear);
    	}
    }