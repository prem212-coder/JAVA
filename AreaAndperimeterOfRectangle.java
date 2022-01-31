import java.util.Scanner;
class AreaAndPerimeterOfRectangle
{
	public static void main(String [] args)
	{
		   double width,area,height,perimeter;

           Scanner input = new Scanner(System.in);
           
           System.out.println("please enter the width : ");
           width = input.nextDouble();
           System.out.print("please enetr the height: ");
           height = input.nextDouble();
           
           perimeter = 2 * (width + height);
           area   = width * height;

		   System.out.println("perimeter is : " + perimeter);
		   System.out.println("Area is : " + area);

	}
}