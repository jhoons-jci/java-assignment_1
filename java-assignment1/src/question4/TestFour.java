package question4;

public class TestFour {
	
	    public static void main(String[] args) {
	    	try {
	        String str = "000034000";
	        TrailingZeros t=new TrailingZeros();
	        
	        System.out.println(t.removeLeadingZeros(str));
	    }
	    	 catch(Exception m)
	    	{
		        	
		        		System.out.println("Exception occured: " + m);
		        	  
		        	}

	}
} 