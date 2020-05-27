class ReverseString {
	
	   String reverse(String inputString) {
	    	 char[] strarray = inputString.toCharArray(); 
	    	 char[] output =new char[strarray.length]; 
	   
	         for (int i = strarray.length-1; i>=0; i--) 
	             output[strarray.length-1-i]=strarray[i];
	         return String.valueOf(output);
	    }
  
}