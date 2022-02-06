import java.util.Scanner;
	public class ComputePerimeterOfTriangle{
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);

			System.out.print("Give input for (a) , (b) , (c) : ");
			int a = input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();

			int sum1 = a + b;
			int sum2 = a + c;
			int sum3 = b + c;

			if ((sum1 > c & sum2 > b) & sum3 > a){
				System.out.println("Your input is valid ");
			}
			else
			    System.out.println("Your input is invalid "); 
		}       
	}