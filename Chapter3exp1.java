import java.util.Scanner;
  public class Chapter3exp1{
  	public static void main(String[] args) {
  		
  	    Scanner input = new Scanner(System.in);
  	    System.out.print("Enter the radius: ");

  	    double radius = input.nextDouble();
       
        if (radius < 0) {
           System.out.print("Incorrect input");
        	
        }
          else {
           double area = radius * radius * 3.14159;
            System.out.println("Area is " + area);
          }

  		
  	}
  }