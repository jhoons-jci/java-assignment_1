package question2;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

	public class DateAndTime 
	{
	    public void calc() throws NullPatternException
	    {
	        Date date = Calendar.getInstance().getTime();
	     String pattern="MM-dd-yyyy hh:mm:ss.sss";
	     if(pattern==null) {
	    	 throw new NullPatternException("Pattern is null");
	     }
	     
	        DateFormat formatter = new SimpleDateFormat(pattern);
	        String newFormat = formatter.format(date);
	      
	        System.out.println(newFormat);
	        
	        formatter = new SimpleDateFormat("dd MMM,yyyy hh:mm a");
	        newFormat = formatter.format(date);
	        System.out.println(newFormat);
	        

	}
	}
