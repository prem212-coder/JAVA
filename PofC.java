import java.util.Scanner;
class PofC
{
	public static void main(String [] args)
	{
		   double pi = 3.14,area,perimeter;

           Scanner input = new Scanner(System.in);
           
           System.out.println("please enter the radius : ");
           double radius = input.nextDouble();

           perimeter = 2 * radius * pi;
           area   = radius * radius * pi;

		   System.out.println("perimeter is : " + perimeter);
		   System.out.println("Area is : " + area);

	}
}