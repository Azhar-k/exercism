import java.util.ArrayList;

class SumOfMultiples{
	private int number,sum=0;
	private int[] set;
	SumOfMultiples(int number, int[] set) {
       this.number=number;
       this.set=set;
    }

    int getSum() {
    	ArrayList<Integer> myList =new ArrayList<Integer>();
    	
    	for(int j=0;j<set.length;j++) {
    		int i=1;
    		while(true) {
    			if(set[j]*i>=number) {
       				break;
    			}
    			int num=set[j]*i;
    			if(!myList.contains(new Integer(num))) {
    				//System.out.println(num);
    	    		myList.add(num);
    			}
    			i++;
    		}
    	}
    	for(Integer val:myList) {
    		sum+=(int) val;
    	}
    	return sum;
    }
}