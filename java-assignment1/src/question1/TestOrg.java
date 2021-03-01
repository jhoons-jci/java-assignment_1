package question1;

import java.util.Collections;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;



	public class TestOrg	{ 

			    public static void main(String args[])
			    {	         
			    	//Organization details
			    	Depart o=new Depart();
			    	String a=o.getOrgaName();
			    	String b=o.getOrgId();
			    	System.out.println("Organization name is: "+a+" And Organization Id is: "+b);
			    	
			    	
			    	
			        List<Employee> employeeList = Employee.getEmployeeList(); 
			   
			       Collections.sort(employeeList,new Compare()); 
					HashMap<String,Double>map=new HashMap<String,Double>();
					System.out.println();
                      for(Employee e:employeeList) {
                    	  if(!map.containsKey(e.deptid)) {
                    		  map.put(e.deptid, e.salary);
                    	  }
                    		  
                      }
                     System.out.println(map);
			       
                     
                     Scanner sc=new Scanner(System.in);
                     
			       //get department ID
                     try {
            		Depart obj1=new Depart();
            		System.out.println("Enter the name of department {HR,Technical,Finance,Training} to get depatment ID");
            		
            		String name=sc.next();
            		String id=obj1.getDepart(name);
            		System.out.println("Department ID is: "+id);
                     }
                     catch(Exception m) {
                    	 System.out.println("Exception Occoured : "+m);
                     }
sc.close();
		}

				
}	


