
class Matrix {

	int[][] row,column;
	
    Matrix(String matrixAsString) {
		
        String[] rows=matrixAsString.split("\n");
        
        column=new int[rows[0].split(" ").length][rows.length];
        row=new int[rows.length][rows[0].split(" ").length];
       
        
        for (int i=0;i<rows.length;i++) {
        	String elements[]=rows[i].split(" ");
        	
        	for(int j=0;j<elements.length;j++) {
        		
        		column[j][i]=row[i][j]=Integer.parseInt(elements[j]);
        	}
        }
        
    }

    int[] getRow(int rowNumber) {
    	
        return row[rowNumber-1];
    }

    int[] getColumn(int columnNumber) {
        return column[columnNumber-1];
    }
}
