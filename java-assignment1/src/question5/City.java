package question5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class City extends Address
{
	
	HashMap<String,List<String>>list=new HashMap<String,List<String>>();
	
	public void city() 
	{
	list.put("chandigarh", Arrays.asList("{Restaurant: dominos Address: 32 krishan nagar} " , "{Restaurant: Italian Restro Address: 55 Rajpur Road} " , "{Restaurant: dark bite Address: kaulagarh road}" ));
	list.put("dehradun", Arrays.asList( "{Restaurant: Pizza Hub Address: Ballupur Road} ", "{Restaurant: dominos Address: sector 17} ", "{Restaurant: Chicago pizza Address: 18 Jakkhan}" ));
	list.put("rohtak",Arrays.asList("{Restaurant: Italiano Address: Kishan road} ", "{Restaurant: Pizza Hut Address: Sector 15} ", "{Restaurant: Dominik Address: Karanpur road}"));
	list.put("delhi", Arrays.asList( "{Restaurant: yum pizza Address: Sector 20} ", "{Restaurant: crunchy bite Address: Ambience Mall} ", "{Restaurant: pizza place Address: Connaught Place}" ));
	super.address();
	}
	

}
