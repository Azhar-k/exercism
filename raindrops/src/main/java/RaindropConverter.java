class RaindropConverter {

	String convert(int number) {
	    String res="";
	    int flag=0;
	    if(number%3==0) {
	    	flag=1;
	    	res+="Pling" ;
	    }
	    
	    if(number%5==0) {
	    	flag=1;
	    	res+="Plang" ;
	    }
	    	
	    if(number%7==0) {
	    	flag=1;
	    	res+="Plong";
	    }
	    	
	    if(flag==0){
	    	res+=String.valueOf(number);
	    }
	    return res;
	}
}
