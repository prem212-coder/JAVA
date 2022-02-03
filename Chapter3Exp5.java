import java.util.Scanner;
public class Chapter3Exp5{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the score: ");

		int score = input.nextInt();


		if(score >= 90)
		    System.out.println("You Get Grade A ");
		else if(score >= 80) 
			System.out.println("You get Grade B ");
        else if(score >= 70)
            System.out.println("You Get Grade C ");
        else if(score >= 60)
            System.out.println("you get Grade F ");
        else 
            System.out.println("You Are fail in this semester ");     	
			
		    

      

	}
}