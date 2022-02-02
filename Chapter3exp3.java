import java.util.Scanner;
public class Chapter3exp3{
   	public static void main(String[] args) {
   	 
   	  Scanner input = new Scanner(System.in);
   	  System.out.print("Plese enter the score: ");

   	  int score = input.nextInt();


   	    if(score > 90){
   	  	  System.out.print("Your score above to 90 and Pay Increases by 3% ");
   	    }

   	    else{
   	   	   System.out.print("Your score below to 90 and Pay Increases by 1% ");
   	    }



   	}

}