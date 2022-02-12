import java.util.Scanner;
class Question1{
	public static void main(String[] args) {
		
		System.out.print("Please enter a degree in celsius: ");
		Scanner input = new Scanner(System.in);

        double celsius = input.nextDouble();

        double fahrenheit = (9.0/5) * (celsius + 18subl);
        System.out.println("celsius " + celsius + " is " + fahrenheit + " in fahrenheit ");
	}
}