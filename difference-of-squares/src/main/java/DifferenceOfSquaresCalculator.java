class DifferenceOfSquaresCalculator {


	 int computeSquareOfSumTo(int input) {
	        int squareSum,sum;
	        sum=input*(input+1)/2;
	        squareSum=sum*sum;
	        return squareSum;
	    }

	    int computeSumOfSquaresTo(int input) {
	    	int sumSquare;
	    	sumSquare=input*(input+1)*(2*input+1)/6;
	    	
	    	return sumSquare;
	    }

	    int computeDifferenceOfSquares(int input) {
	    	int difference=computeSquareOfSumTo(input)-computeSumOfSquaresTo(input);
	    	return difference;
	  
	    }

}
