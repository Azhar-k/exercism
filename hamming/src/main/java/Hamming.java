class Hamming {
	String leftStrand,rightStrand;
	
    Hamming(String leftStrand, String rightStrand) {
    	if(leftStrand.equals(rightStrand)) {
     		  
        	}
    	else {
    		if(leftStrand.length()==0) {
         		 throw new java.lang.IllegalArgumentException("left strand must not be empty.");
         	 }
         	 if(rightStrand.length()==0) {
         		 throw new java.lang.IllegalArgumentException("right strand must not be empty.");
         	 }
       	
       	if (leftStrand.length() != rightStrand.length()) 
               throw new java.lang.IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
       	
    		
    	}
    	 
      	 
        this.leftStrand=leftStrand;
        this.rightStrand=rightStrand;
    }

    int getHammingDistance() {
      	 int distance=0;
      	
      	
      	 for(int i=0;i<leftStrand.length();i++) {
      		 if(leftStrand.charAt(i)!=rightStrand.charAt(i)) {
      			 distance+=1;
      		 }
      	 }
      	 return distance;
      }

}
