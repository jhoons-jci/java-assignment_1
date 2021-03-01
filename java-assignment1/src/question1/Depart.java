package question1;

import java.util.HashMap;
import java.util.Map;

class Depart extends Organization 
	{
		String departmentName;
		
			 static HashMap<String,String>list1=new HashMap<String,String>();
			 public static void  keepData() {
				 	list1.put("1","HR");
					list1.put("2","Technical");
					list1.put("3","Finance");
					list1.put("4","Training");
			 }
			public String getDepart(String str)throws NoSuchDepartmentException
			{
				if(str==null) {
					throw new NoSuchDepartmentException("No such Department found");
				}
		        keepData();
				for(Map.Entry<String, String>e:list1.entrySet()) {
					if(e.getValue().equals(str)) {
				return e.getKey();
					}
				}
				return  "Not Present";
			}
	
//super org
			public String getOrgaName()
				{
				return super.orgName();	      
				}
			public String getOrgId()
				{
				return super.orgId();
				}
		}






