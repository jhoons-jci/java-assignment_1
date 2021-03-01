package question3;
public class ReverseString 
{
	public String revrse_String(String s)throws NullStringException {
		if(s==null) 
		{
			throw new NullStringException("String is null"); 
		}
		StringBuilder s1=new StringBuilder(s);
		s1.reverse();
		return s1.toString();
				
	}
 
	

}



