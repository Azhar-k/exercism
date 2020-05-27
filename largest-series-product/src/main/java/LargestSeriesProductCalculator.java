class LargestSeriesProductCalculator {
	String inputNumber;
    LargestSeriesProductCalculator(String inputNumber) {
        this.inputNumber=inputNumber;
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {
    	if(!(inputNumber.matches("[0-9]*"))) {
    		throw new IllegalArgumentException("String to search may only contain digits.");
    	}
    	if(numberOfDigits==0) {
        	
    		//	throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
    		return 1;
    	}
    	if(inputNumber.length()<numberOfDigits) {
    		throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
    	}
    	if(!(inputNumber.matches("[0-9]*"))) {
    		throw new IllegalArgumentException("String to search may only contain digits.");
    	}
    	if(numberOfDigits<0) {
    		throw new IllegalArgumentException("Series length must be non-negative.");
    	}
    	
    	long big=-1;
    	for(int i=0;i<=inputNumber.length()-numberOfDigits;i++) {
    		long prd=1;
    		//System.out.println(inputNumber.substring(i,i+2));
    		for(int j=i;j<i+numberOfDigits;j++) {
    			long digit=Long.parseLong(""+inputNumber.charAt(j));
    			prd=prd*digit;
    		}
    		if (prd>big) {
    			big=prd;
    		}
    		//long num=Long.parseLong(inputNumber.substring(i,i+2));
    		
    	}
        return big;
    }
}
