import java.util.Scanner;
class Question12{
	public static void main(String[] args) {
		
		double weight,height,bmi1,bmi2,bmi;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter weight in pounds: ");
		weight = input.nextDouble();

		System.out.print("Enter height in  inches: ");
		height = input.nextDouble();

        bmi1 =  703 * weight;
        bmi2 =  (Math.pow(height,2));
        bmi  = bmi1/bmi2;

        
        System.out.println("BMI is " + bmi );

	}
}