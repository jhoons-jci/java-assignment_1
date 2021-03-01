package question4;

import question3.NullStringException;

public class TrailingZeros {

    public  String removeLeadingZeros(String str) throws NullStringException {
    	 if(str==null)
		   {
			   throw new NullStringException("String is null");
		   } 
    	 else
    	 {
        String regex = "^0+";
      
        str = str.replaceAll(regex,"");
     
       
        char[] chars = str.toCharArray();
        int length, i;
        length = str.length();
        
        for (i = length - 1; i >= 0; i--) {
            if (chars[i] != '0') {
                break;
            }
        }
      
        return (i == length - 1) ? str : str.substring(0, i +1);

    }
  }
}



