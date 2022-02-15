import java.util.Scanner;
class Question13{
	public static void main(String[] args) {
		
		double x1,y1,x2,y2,a,b,c,distence;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter x1 and y1 : ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();

        System.out.print("Enter x2 and y2 : ");
        x2 = input.nextDouble();
        y2 = input.nextDouble();

        a = x2 - x1;
        a = (Math.pow(a,2));

        b = y2 - y1;
        b = (Math.pow(b,2));
        
        c = a + b;

        distence = (Math.pow(c,0.5));

        System.out.print("the distence between the two points is " + distence );

	}
}