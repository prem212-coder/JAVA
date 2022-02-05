import java.util.Scanner;
public class Chapter3Test{
     public static void main(String[] args) {
        int x,y,z;	
     
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of x and y: ");

        x = input.nextInt();
        y = input.nextInt();

     	if(x > 2) {                       // x = 3,2
     		if(y > 2){                     // y = 2,4,
     			z = x + y;
     			System.out.println("z is " + z);
     		}
     	}
        else
        	System.out.println("x is " + x);
     }
}