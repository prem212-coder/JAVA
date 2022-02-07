import java.util.Scanner;
	public class DayOfTheWeek{
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);

			System.out.print("Enter the year: (e.g., 2020):  ");
			int year = input.nextInt();
			int years = (year % 100);
			int century = (year/100);

			System.out.print("Enter the month: 1 - 12 : ");
			int month = input.nextInt();

			System.out.print("Enter the day of the month: 1-31:  ");
			int days = input.nextInt();

			int h =(days +(26 * (month + 1)/10) + years + years/4 + century/4 + 5 * century) % 7;


			switch(h){
                case 0: System.out.println("Day of the week is Saturday ");
                break;
                case 1: System.out.println("Day of the week is Sunday ");
                break;
                case 2: System.out.println("Day of the week is Monday ");
                break;
                case 3: System.out.println("Day of the week is Tuseday ");
                break;
                case 4: System.out.println("Day of the week is Wednesday");
                break;
                case 5: System.out.println("Day of the week is  Thursday ");
                break;
                case 6: System.out.println("Day of the week is Friday ");
                break;
                default : System.out.println("invalid");

            }
		}
	}