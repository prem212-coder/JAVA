import java.util.Scanner;
	public class QuadraticEquation{
		public static void main(String[] args) {
                                                              //r1 = -b + 2b2 - 4ac 2a
        double r1,r2,x;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value for a and b and c : ");
        
        double a = input.nextInt();
        double b = input.nextInt();
        double c = input.nextInt();

        x  = b * b - 4 * a * c;

        if (x > 0) {

        	r1 = ( -b + (Math.pow(b * b - 4 * a * c,0.5)))/2 * a;
        	r2 = ( -b - (Math.pow(b * b - 4 * a * c,0.5)))/2 * a;

        	System.out.println(" The eqution has two real root : " + r1 + "and" + r2 );

        }

        else if (x == 0 ) {

        	r1 = ( -b + (Math.pow(b * b - 4 * a * c,0.5)))/2 * a;
        
            System.out.println(" The eqution has one real root : " + r1);
        	
        }

        else 

        	System.out.println(" The eqution has no real root  ");

	   }

	}