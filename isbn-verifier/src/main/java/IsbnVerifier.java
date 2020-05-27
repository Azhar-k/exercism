class IsbnVerifier {
	boolean isValid(String stringToVerify) {
		String[] formattedArray=stringToVerify.split("-");
		String formatted=String.join("",formattedArray);
		int weightedSum=0;
		if(!(formatted.length()<=10 && formatted.length()>9)) {
			return false;
		}
		for(int i=0;i<formatted.length();i++) {
			int digit=1;
			if(formatted.charAt(i)=='X') {
				if(i!=formatted.length()-1) {
					return false;
				}
				digit=10;
			}
			else {
				try {
					digit=Integer.parseInt(String.valueOf(formatted.charAt(i)));
				}
				catch(Exception e) {
					return false;
				}
				
			}
			
			weightedSum+=digit*(10-i);
		}
		if(weightedSum % 11 ==0) {
			return true;
		}
		return false;
	}

}
