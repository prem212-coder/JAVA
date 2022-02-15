import java.util.Scanner;
class Question14{
	public static void main(String[] args) {
		
		double a,area1,area2,area;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the side : ");
        a = input.nextDouble();

        area1 = 3 * Math.pow(3,0.5);
        area2 = (area1/2);
        area  = area2 * (Math.pow(a,2));

        System.out.print("The area of the hexagon " + area);
	}
}