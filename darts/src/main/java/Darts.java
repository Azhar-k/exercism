class Darts {

	int score=0;
	Darts(double x, double y) {
		
		 double d=Math.sqrt(x*x+y*y);
		  if(d<=10) 
		  {
			  if(d<=5) 
			  {
				  if(d<=1)
				  {
					  score=10;
				  }
				  else 
				  {
					  score=5;
				  }
			  }
			  else 
			  {
				  score=1;
			  }
		  }
		  else 
		  {
			  score=0;
		  }
   }

   int score() {
    return score;
   }
	
}
