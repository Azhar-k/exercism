class ResistorColorDuo {
	private static final String[] my_colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
	
	 int value(String[] colors) {
		 String code="";
		 for(int j=0;j<2;j++) 
		 {
			 for(int i=0;i<my_colors.length;i++) 
			 {
			    	if(my_colors[i].equals(colors[j])) 
			    	{
			    		code+=String.valueOf(i);
			    		break;
			    	}
			 }
		 }
		    
		 return Integer.parseInt(code);
	}
}
