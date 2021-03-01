package question1;

import java.util.Comparator;
 
	class Compare implements Comparator<Employee>
	{
		@Override
		public int compare(Employee o1, Employee o2) {

	                      if( o1.salary>o2.salary  ) {
	                    	  return -1;
	                      }
	                    	  
	                      return 1;
	                      
		}
		
	}

