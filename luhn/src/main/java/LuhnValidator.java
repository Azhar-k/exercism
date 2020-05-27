class LuhnValidator {

boolean isValid(String candidate) {
		
        
        candidate=candidate.replace(" ", "");
        if(!candidate.matches("[0-9]+")){
        	return false;
        }
        if(candidate.length()<=1 ) {
        	return false;
        }
        
        int formattedSum=0;
        int j=0;
        for(int i=candidate.length()-1;i>=0;i--) {
        	
        	int current;
        	if(j%2 !=0) {
        		current=Integer.parseInt(String.valueOf(candidate.charAt(i)))*2;
        		if(current>9) {
        			current-=9;
        		}
        	}
        	else {
        		current=Integer.parseInt(String.valueOf(candidate.charAt(i)));
        	}
        	
        	System.out.println(current);
        	formattedSum+=current;
        	j++;
        }
        if(formattedSum%10 == 0) {
        	return true;
        }
        //System.out.println(formattedSum);
        
		return false;
    }
}
