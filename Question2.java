import java.util.Scanner;
class Question2{
	public static void main(String[] args) {
    
    double PI = 3.14159,volume,area;
		
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the radius and length of a cylinder : ");
	double radius = input.nextDouble();
	double length = input.nextDouble();

    area = radius * radius * PI;
    volume = area * length;

    System.out.println("The area is " + area );
    System.out.println("The volume is " + volume);


	}
}