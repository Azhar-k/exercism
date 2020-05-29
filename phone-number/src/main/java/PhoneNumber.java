
class PhoneNumber{
	String result;
	
	PhoneNumber(String input){
		
		if(input.matches(".*[a-zA-Z]+.*")) {
			throw new IllegalArgumentException("letters not permitted");
		}
		else if(input.matches(".*[!?@:]+.*")) {
			throw new IllegalArgumentException("punctuations not permitted");
		}
		
		
		input=input.replaceAll("\\D", "");
		
		
		if(input.length()<10) {
			throw new IllegalArgumentException("incorrect number of digits");
		}
		else if(input.length()>11) {
			throw new IllegalArgumentException("more than 11 digits");
		}
		if(input.length()==11) {
			if(input.charAt(0)=='1') {
				input = input.substring(1);
			}
			else {
				
				throw new IllegalArgumentException("11 digits must start with 1");
			}
		}
		
		
		if(input.charAt(0)=='0') {
			throw new IllegalArgumentException("area code cannot start with zero");
		}
		if(input.charAt(0)=='1') {
			throw new IllegalArgumentException("area code cannot start with one");
		}
		if(input.charAt(3)=='0') {
			throw new IllegalArgumentException("exchange code cannot start with zero");
		}
		if(input.charAt(3)=='1') {
			throw new IllegalArgumentException("exchange code cannot start with one");
		}
		
		
		result=input;
	}
	
	String getNumber(){
		
		return result;
	
	}
}