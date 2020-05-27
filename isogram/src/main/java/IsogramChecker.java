class IsogramChecker {

	 boolean isIsogram(String cphrase) {
		   String phrase=cphrase.toUpperCase();
		   boolean status=true;
		   char c1 = '-', c2 = ' '; 
	       for(int i=0;i<=phrase.length()-1;i++)
	       {
	    	   if((phrase.charAt(i)==c1) || (phrase.charAt(i)==c2)) {
	    		   continue;
	    	   }
	    	   for(int j=i+1;j<=phrase.length()-1;j++)
		       {
		    	   if(phrase.charAt(i)==phrase.charAt(j)) {
		    		   status=false;
		    		   System.out.println(i);
		    		   return status;
		    	   }
		       }
	       }
	       return status;
	    }

}
