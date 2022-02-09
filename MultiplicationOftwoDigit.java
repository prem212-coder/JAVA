import java.util.Scanner;        // import class file
class MultiplicationOftwoDigit{    
	public static void main(String[] args) {    // create amin method 
		
		int a,b,c,d,e,digit1,digit2,multiplication;     // declare variables

		System.out.println("Please enter the 4 digit number: "); // take input for 3 digit
		Scanner one = new Scanner(System.in);                    // create object for input
        System.out.println("Please enter the 3 digit number: "); // take input for 4 digit
        Scanner two = new Scanner(System.in);

        int number1 = one.nextInt();
        int number2 = two.nextInt();

        a =  number1%10;                    // logic begins here for number1 digits
        b = (number1/10)%10;
        c = (number1/10)/10 ;
        digit1 = ((number1/10)/10)/10;
        
        d =       number2%10;             // logic begins here for number2 digits
        digit2 =  (number2/10)%10;

        
        multiplication =  digit1 * digit2;

        System.out.print(multiplication);



	}
}