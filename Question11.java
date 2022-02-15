import java.util.Scanner;
class Question11{
	public static void main(String[] args) {
	
	double saveamount,first,second,third,fourth,fiveth,sixth;

	Scanner input = new Scanner(System.in);
	System.out.print("Enter the monthly saving amount : ");

	saveamount = input.nextDouble();

	first =  saveamount * (1 + 0.00417);

    second = (saveamount + first) * (1 + 0.00417);

    third  = (saveamount + second) * (1 + 0.00417);

    fourth = (saveamount + third) * (1 + 0.00417);

    fiveth = (saveamount + fourth) * (1 + 0.00417);

    sixth  = (saveamount + fiveth) * (1  + 0.00417);


    System.out.print("After the sixth mouth, the account value is " + sixth);


		
	}
}