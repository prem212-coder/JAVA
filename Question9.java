import java.util.Scanner;
class Question9{
	public static void main(String[] args) {
		
		//energy define by Q AND water define by M AND temperatures are in degree celsius

		float q,m,finaltemp,initialtemp;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the amountof water in kilogram: ");
        m = input.nextFloat();


        System.out.print("Enter the initial temperature: ");
        finaltemp = input.nextFloat();

		
		System.out.print("Enter the final temperature: ");
		initialtemp = input.nextFloat();

		
	
		q = m * ( initialtemp - finaltemp ) * 4184;

		System.out.print("The energy needed is  " + q );

	}
}