package question5;
import java.util.*;

import question3.NullStringException;
public class Pizza extends City
{

	public  void value()
	{
	super.city();
	}
	

	List<String> getPizzaShop(String str) throws NullStringException
 	{
		 if(str==null)
		   {
			   throw new NullStringException("String is null");
		   }   
		   else
		   {
    	 value();
     
	if(list.containsKey(str)) 
	{
	  return list.get(str);
	}
	}
	
  ArrayList<String>A1=new ArrayList<String>();
  A1.add("Not Present");
  return A1 ;
 	}

	
	
public ArrayList<String> location(String str)
{
   	 value();

   	ArrayList<String>list2=new ArrayList<String>();
for(Map.Entry<String,String> e: list1.entrySet()) 
{
	
	String A1=e.getValue();
	if(A1.contains(str)) 
	{
		list2.add(e.getKey());
	}
}
if(!list2.isEmpty()) {
return list2;
}
ArrayList<String>A1=new ArrayList<String>();
A1.add("Not Present");
return A1 ;

    }

}
