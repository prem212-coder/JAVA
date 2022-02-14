import java.util.Scanner;
class Question7{
	public static void main(String[] args) {
		
	int  years,minutes,days;

	
	Scanner input = new Scanner(System.in);                              //years = minutes ÷ 525,600
	System.out.print("Enter the number of minutes : ");

	minutes = input.nextInt();

    years = (minutes / 60 / 24) / 365;
    days =  (minutes / 60 / 24) % 365;


    System.out.print("1000000000 minutes is approximately " + years  + " years and "  + days  +" days ");



	}
}