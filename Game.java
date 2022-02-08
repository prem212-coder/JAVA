import java.util.Scanner;
	public class Game{
		public static void main(String[] args) {
			
            int computer = (int)(Math.random() * 3);

            //System.out.println(computer);
			Scanner input = new Scanner(System.in);

			System.out.println("scissor (0) , rock (1) , paper (2) : ");
			int geuss = input.nextInt();
            

            if (computer == 0 && geuss == 0) {
                     
                     System.out.println("The Computer is scissor. You are scissor. Draws ");
            }
            else if (computer == 1 && geuss == 1) {
            	 
            	     System.out.println("The Computer is rock. You are rock. Draws");
            }
            else if (computer == 2 && geuss == 2) {
            	    
            	    System.out.println("The Computer is paper. You are paper. Draws");
            }
            else if (computer == 0 && geuss == 1) {
            	    System.out.println("The computer is scissor. You are rock. You wins");
            }
            else if (computer == 0 && geuss == 2) {
            	    System.out.println("The computer is scissor. You are paper. You lose");
            }

            else if (computer == 1 && geuss == 0) {
            	    System.out.println("The computer is rock. You are scissor. You lose");
            }
            else if (computer == 1 && geuss == 2) {
            	    System.out.println("The computer is rock. You are paper . You wins");
            }
            else if (computer == 2 && geuss == 0) {
            	    System.out.println("The computer is paper. You are scissor. You wins ");
            }
            else if (computer == 2 && geuss == 1) {
            	    System.out.println("The computer is paper. You are rock. You lose");
            }

		}
	}