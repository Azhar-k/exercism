import java.util.List;
import java.util.ArrayList;

class DiamondPrinter {

	List<String> printToList(char a) {
        ArrayList<String> diamond =new ArrayList<String>();
        int sideLim=(int) a - (int) 'A';
    	int middleLim=-1;
    	int range=sideLim*2;
    	char letter=(char)(65);
    	
        for(int i=0;i<=range;i++) {
        	
        	String temp="";
        	
        	//print spaces in starting
        	for(int j=0;j<sideLim;j++) {
        		temp+=" ";
        	}
        	
        	//print letter for the first time
        	temp+=letter;
        	
        	//print spaces in middle
        	for(int j=0;j<middleLim;j++) {
        		temp+=" ";
        	}
        	
        	//print the letter agin if it is not the first and last iteration
        	if(i!=0&&i!=range) {
        		temp+=letter;
        	}
        	
        	//print spaces in ending
        	for(int j=0;j<sideLim;j++) {
        		temp+=" ";
        	}
        	
        	//Break the line for next iteration
        	System.out.print("\n");
        	
        	//This logic reverse the pattern from the middle of the iteration
        	if(i<=((range/2)-1) ) {
        		sideLim-=1;
        		middleLim+=2;
        		letter=(char) (65+i+1);
        	}
        	else {
        		sideLim+=1;
        		middleLim-=2;
        		letter=(char) ((int)letter-1);
        	}
            diamond.add(temp);
        	
        }
        
        return diamond;
    }

}
