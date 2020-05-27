import java.util.List;
import java.util.ArrayList;

class Sieve {
	int maxPrime;
	List<Integer> marked=new ArrayList<Integer>(); 
	
	Sieve(int maxPrime) {
	   this.maxPrime=maxPrime;    
	}
	
	private void mark(int num) {
		
		int i=2;
		int mul=i*num;
		while(mul<=maxPrime){
			if(!marked.contains(new Integer(mul))) {
				marked.add(new Integer(mul));
				System.out.println(mul);
			}
			

			i++;
			mul=i*num;
		}
		
	}
	
	List<Integer> getPrimes() {
	   List<Integer> primes=new ArrayList<Integer>();  
	   
	   for(int i=2;i<=maxPrime;i++) {
		   if(!(marked.contains(new Integer(i)))) {
			   mark(i);
		   }
	   }
	   
	   for(int i=2;i<=maxPrime;i++) {
		   if(!(marked.contains(new Integer(i)))) {
			   primes.add(new Integer(i));
		   }
	   }
	   return primes; 	
	}

	 
}
