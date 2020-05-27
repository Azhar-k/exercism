class NaturalNumber {
 Classification res;	
 public NaturalNumber(int number){
	 if(number<=0) {
		 throw new IllegalArgumentException("You must supply a natural number (positive integer)");
	 }
	 else {
		 int sum=0;
		 for(int i=1;i<number;i++) {
			 if(number%i==0) {
				 sum+=i;
			 }
		 }
		 if(sum==number) {
			 res=Classification.PERFECT;
		 }
		 else if(sum>number) {
			 res=Classification.ABUNDANT;
		 }
		 else if(sum<number) {
			 res=Classification.DEFICIENT;
		 }
	 }
 }
 
 public Classification getClassification() {
	 return res;
 }
}