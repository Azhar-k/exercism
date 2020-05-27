class Scrabble {
	int score=0;
	 Scrabble(String word) 
	 {
		 	 word=word.toUpperCase();
			 for(int i=0;i<word.length();i++) 
			 {
				 char ch=word.charAt(i);
				 switch(ch)
				 {
				 case 'A': case 'E' :case 'I':case 'O':case 'U':case 'L':case 'N':case 'R':case 'S':case 'T':
					 this.score+=1;
					 break;
				 case 'D':case 'G':
					 this.score+=2;
					 break;
				 case 'B':case 'C':case 'M':case 'P':
					 this.score+=3;
					 break;
				 case 'F':case 'H':case 'V':case 'W':case 'Y':
					 this.score+=4;
					 break;
				 case 'K':
					 this.score+=5;
					 break;
				 case 'J':case 'X':
					 this.score+=8;
					 break;
				 case 'Q':case 'Z':
					 this.score+=10; 
					 break;
					 
				 }
			 }
	     
	 }

	 int getScore() {
	         return this.score;
	 }
	    
	    

}
