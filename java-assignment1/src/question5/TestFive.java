package question5;

import java.util.List;
import java.util.Scanner;

	public class TestFive {

		public static void main(String[] args) {
			
	        Pizza obj=new Pizza ();
	       
	       Scanner sc = new Scanner (System.in);
				System.out.println("Enter the City from the following");
				System.out.println("chandigarh , dehradun , rohtak , delhi ");
				String place=sc.nextLine(); //null;
try {
				List<String>shops= obj.getPizzaShop(place);
				System.out.println(shops);
				System.out.println();
}
catch(Exception m){
	
	System.out.println("Exception occured: " + m);
}  
				System.out.println("Enter the Restraunt:");
				String Restrau=sc.nextLine();
				List<String>location= obj.location(Restrau);
				System.out.println(location);
				sc.close();

			}
		

		}

	
	 
