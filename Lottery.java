import java.util.Scanner;
    public class Lottery{
     	public static void main(String[] args) {
     	

     	int lottery = (int)(Math.random() * 100);

     	int lotteryDigitOne = lottery / 10;
     	int lotteryDigitTwo = lottery % 10;
    
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the guess number (in two digits): ");
        int guess = input.nextInt();
     	
     	int guessDigitNumberOne = guess / 10;
     	int guessDigitNumberTwo = guess % 10;

     	System.out.println("The lottery number is : " + lottery);

        if(guess == lottery)
        	System.out.println("Your guess number exect matche , You win $10,000");
     	
     	else if (lotteryDigitOne == guessDigitNumberOne && lotteryDigitTwo == guessDigitNumberTwo)  
           System.out.println("Your guess number match all digit in the lottery digit , You win $3000 ");

        else if ((lotteryDigitOne == guessDigitNumberOne || lotteryDigitTwo == guessDigitNumberTwo ) || (lotteryDigitOne == guessDigitNumberTwo || lotteryDigitTwo == guessDigitNumberOne))
        	System.out.println("Your guess number matche a didgit in lottery number , you win $1000 ");

        else 
        	System.out.println("Sorry, no matche ");
        }
     }
