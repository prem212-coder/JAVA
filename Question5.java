import java.util.Scanner;
class Question5{
	public static void main(String[] args) {
		double subtotal,gratuityrate,gratuity,total;

        Scanner input = new Scanner(System.in);
		System.out.print("Enter the subtotal and  a gratuity rate : ");
      
        subtotal = input.nextDouble();
        gratuity = input.nextDouble();

        
        gratuityrate = subtotal * (gratuity/100);
        total = gratuityrate + subtotal;

        System.out.print("The gratuity is $" + gratuityrate + "and total is $" + total);

	}
}