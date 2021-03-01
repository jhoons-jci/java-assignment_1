package question3;

import java.util.Scanner;

public class TestThree 
{

		    public static void main(String[] args) {
		         
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the string");
		        String str;
		        str = sc.nextLine();
		      
		        	ReverseString r=new ReverseString();
		        	try {
		        	String rev=r.revrse_String(str);
		        	System.out.println("Reverse String is->");
		        	System.out.println(rev);
		        	}
		        	catch(Exception m) {
		        		System.out.println("Exception occured: " + m);
		        	}
		        
		        sc.close();
		    }

		}

