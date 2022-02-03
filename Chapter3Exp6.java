import java.util.Scanner;
  public class Chapter3Exp6{
	public static void main(String[] args) {

		
		//1. genrate tow dingle digit randdom number 
		int number1 = (int)(Math.random() * 20);
		int number2 = (int)(Math.random() * 20);
        
        //2. If number1 < number2 swap number1 with number2
		if(number1 < number2 ){
		   int temp = number1;
            number1 = number2;
            number2 = temp;
         }
		//3.promt the user  to answer "What is number1 - number2 ?"
       System.out.println("What is " + number1 + " - " + number2 + " ? ");
       
       Scanner input = new Scanner(System.in);
       double answer = input.nextInt();
       
       // 4. gread the answer and display the result
       if(number1 - number2 == answer)
         System.out.println("Your answer is correct");
       else{
       	 System.out.println("Your answer is worng");
       	 System.out.println(number1 + " - " + number2 + " Your answer should be  : " + (number1 - number2));
       }

	}
}