class Proverb {
	String[] words;
    Proverb(String[] words) {
    	   this.words=words;
    		
    }

    String recite() {
    	String result="";
        for(int i=0;i<words.length;i++) {
        	if(i==words.length-1) {
        		result+="And all for the want of a "+words[0]+".\n";
        		break;
        	}
        	result+="For want of a "+words[i]+" the "+words[i+1]+" was lost.";
        	
        }
    	return result;
    }

}
