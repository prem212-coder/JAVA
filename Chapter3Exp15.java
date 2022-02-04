import java.util.Scanner;
	public class Chapter3Exp15{
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			double x = input.nextDouble();
			double y = input.nextDouble();
			double z = input.nextDouble();
            int ages = input.nextInt();

			System.out.println((x < y && y < z) ? "sorted" : "not sorted");
			System.out.println((ages >= 16) ? "ticketPrice = 20" : "ticketPrice = 10");
		}
	}