import java.util.Scanner;
class Question10{
	public static void main(String[] args) {
		
		//take off speed define by v and acceleration speed define a
		
		double v,a,length;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter speed and acceleration : ");

		v = input.nextDouble();
		a = input.nextDouble();

		length = (Math.pow(v,2))/(2*a);

		System.out.print("The minimum runway length for this airplane is  " + length);
	}
}