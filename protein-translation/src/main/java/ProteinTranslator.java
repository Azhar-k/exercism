import java.util.List;
import java.util.ArrayList;

class ProteinTranslator {

	 String getProtien(String input) {
		 String protien="";
		 switch(input) {
		 case "AUG":
			 protien="Methionine";
			 break;
		 case "UUU":case "UUC":
			 protien="Phenylalanine";
			 break;
		 case "UUA":case "UUG":
			 protien="Leucine";
			 break;
		 case "UCU":case "UCC":case "UCA":case "UCG":
			 protien="Serine";
			 break;
		 case "UAU":case "UAC":
			 protien="Tyrosine";
			 break;
		 case "UGU":case "UGC":
			 protien="Cysteine";
			 break;
		 case "UGG":
			 protien="Tryptophan";
			 break;
		 case "UAA":case "UAG":case "UGA":
			 protien="STOP";
			 break;
		 default:
			 protien="STOP";
			 break;
		 
		 }
		 return protien;
	 }
	  List<String> translate(String rnaSequence) {
	      List<String> aminoAcids=new ArrayList<String>();
	      List<String> splitRna=new ArrayList<String>();
	      int start=0,end=3;
	      
	      while(end<=rnaSequence.length()) {
	    	  splitRna.add(rnaSequence.substring(start, end));
	    	  start=end;
	    	  end=end+3;
	      }
	      for(int i=0;i<splitRna.size();i++) {
	    	  String protien=getProtien(splitRna.get(i));
	    	  if(protien.equals("STOP")) {
	    		  break;
	    	  }
	    	  aminoAcids.add(protien);
	      }
	      
	      return aminoAcids;
	    }
}
/*Codon	Protein
AUG	Methionine
UUU, UUC	Phenylalanine
UUA, UUG	Leucine
UCU, UCC, UCA, UCG	Serine
UAU, UAC	Tyrosine
UGU, UGC	Cysteine
UGG	Tryptophan
UAA, UAG, UGA	STOP*/
