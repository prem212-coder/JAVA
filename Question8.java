import java.util.Scanner;
class Question8{
	public static void main(String[] args) {
		
		//velocity befine by v nad time is define by t
		float v0,v1,t,acceleration;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter v0 and v1  and t:  ");

        v0 = input.nextFloat();
        v1 = input.nextFloat();
        t  = input.nextFloat();

        acceleration = (v1 - v0)/t;

        System.out.println("The average acceleration is " + acceleration );
	}
}