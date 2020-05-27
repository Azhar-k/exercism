class ResistorColor {
	private static final String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
	int colorCode(String color) {
	int code=0;
    for(int i=0;i<colors.length;i++) {
    	if(colors[i].equals(color)) {
    		code=i;
    		break;
    	}
    }
    return code;
}

String[] colors() {
    return this.colors;
}
}
