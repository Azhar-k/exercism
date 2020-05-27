class Yacht {

	private int score=0;
	   
	   private int getCount(int[] dice,int item) {
		   int count=0;
		   for(int i=0;i<dice.length;i++) {
			   if(dice[i]==item) {
				   count++;
			   }
		   }
		   return count;
	   }
		
	public Yacht(int[] dice, YachtCategory yachtCategory) {
		int flag1=0,flag2=0;
        switch(yachtCategory) {
        
        case ONES:
        	int count=getCount(dice,1);
        	score=1*count;
        	break;
        case TWOS:
        	count=getCount(dice,2);
        	score=2*count;
        	break;
        case THREES:
        	count=getCount(dice,3);
        	score=3*count;
        	break;
        case FOURS:
        	count=getCount(dice,4);
        	score=4*count;
        	break;
        case FIVES:
        	count=getCount(dice,5);
        	score=5*count;
        	break;
        case SIXES:
        	count=getCount(dice,6);
        	score=6*count;
        	break;
        case FULL_HOUSE:
        	flag1=0;
        	flag2=0;
        	for(int i=1;i<7;i++) {
        		count=getCount(dice,i);
        		if(count==3) {
        			flag1=1;
        			score+=i*3;
        		}
        		if(count==2) {
        			flag2=1;
        			score+=i*2;
        		}
        		if(flag1==1 && flag2==1) {
        			break;
        		}
        	}
        	if(flag1==1 && flag2==1) {
    		
    		}
        	else {
        		score=0;
        	}
        	
        	break;
        case FOUR_OF_A_KIND:
        	for(int i=1;i<7;i++) {
        		count=getCount(dice,i);
        		if(count>=4) {
        			score=i*4;
        			break;
        		}
        	}
        	break;
        case LITTLE_STRAIGHT:
        	flag1=0;
        	for(int i=0;i<6;i++) {
        		
        		if(dice[i]!=(i+1)) {
        			flag1=1;
        			break;
        		}
        	}
        	if(flag1==1) {
        		score=0;
        	}
        	else {
        		score=30;
        	}
        	
        	break;
        case BIG_STRAIGHT:
        	for(int i=0;i<6;i++) {
        		if(dice[i]!=(i+2)) {
        			flag1=1;
        			break;
        		}
        	}
        	if(flag1==1) {
        		score=0;
        	}
        	else {
        		score=30;
        	}
        	
        	break;
        case CHOICE:
        	for(int i=0;i<5;i++) {
        		score+=dice[i];
        	}
        	break;
        case YACHT:
        	for(int i=0;i<3;i++) {
        		count=getCount(dice,dice[i]);
        		if(count>=5) {
        			score=50;
        			break;
        		}
        	}
        	break;
        default:
        	break;
        }
	    }

	    public int score() {
	    	
	        return this.score;
	    }
	    

}
