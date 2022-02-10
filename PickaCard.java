import java.util.Scanner;
	public class PickaCard{
		public static void main(String[] args) {
			
			
			Scanner input = new Scanner(System.in);
			System.out.print("Pick a Card input number 1 to 52: ");
			int card = input.nextInt();
			int cardNumber = card % 13;
			String cardName = "";

			if(cardNumber == 1) {
				cardName = "Ace";
			}
			else if (cardNumber == 11) {
				cardName = "Jack";
			}
			else if (cardNumber == 12) {
				cardName = "Queen";
			}
			else if (cardNumber == 0) {
				cardName = "King";
			}
			else {
				cardName = "" + cardNumber;
			}

			int category = card / 14;

			if(category == 0) {
				System.out.println("The card you picked is "+cardName+" of Clubs");
			}
			else if(category == 1) {
				System.out.println("The card you picked is "+cardName+" of Diamonds");
			}
			else if(category == 2) {
				System.out.println("The card you picked is "+cardName+" of Hearts");
			}
			else {
				System.out.println("The card you picked is "+cardName+" of Spades");
			}
		}
	}