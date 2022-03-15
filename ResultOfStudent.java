import java.util.Scanner;
	public class ResultOfStudent{
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);

            System.out.print("Hindi : ");
			float hindi = input.nextFloat();
			
            System.out.print("English : ");
			Float english = input.nextFloat();
			
            System.out.print("Maths : ");
			float math = input.nextFloat();
			
            System.out.print("Physics : ");
			float physics = input.nextFloat();
			
            System.out.print("Chemistry : ");
			float chemistry = input.nextFloat();
			

			float toatlmarks = (hindi + english + math + physics + chemistry);
			System.out.println("Toatl Marks = " + toatlmarks + "/500");

			float precentage = (toatlmarks/500) * 100;
            

            boolean status = false;
            String resultStatus = "";
            String failIn = "";
            String dectension = "";

			if(hindi < 30){
				status = true;
				failIn += "Hindi";
            }

			if(english < 30){
				status = true;
				failIn += ", English";
            }
			if(math < 30){
				status = true;
				failIn += ", English";
            }
			if(physics < 30){
			    status = true;
				failIn += ", English";
            }
			if(chemistry < 30){
			    status = true;
				failIn += ", Chemestry";
            }

            if(status)
            	resultStatus = "Fail";
			else if (precentage >= 75)
				resultStatus = "Honors";
			else if(precentage >= 60)
				resultStatus = "1st Rank";
            else if (precentage >= 45)
            	resultStatus = "2nd Rank";
            else if(precentage >= 30)
            	resultStatus = "3rd Rank";
            else 
            	resultStatus = "Fail";


            if (hindi >= 75) {
            	dectension += "Hindi";
            }
            if (english >=75) {
            	dectension += ",English";
            }
            if (math >= 75) {
            	dectension += ",math";
            }
            if (physics >= 75) {
            	dectension += ",Physics";
            }
            if (chemistry >= 75) {
            	dectension += ",Chemistry";
            }
            
            	
            System.out.println("Result Status = " + resultStatus);
            System.out.println("Fail In = " + failIn);
            System.out.println("Dectensoin In = " + dectension);
				
   		}
	}