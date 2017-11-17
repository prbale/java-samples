package DesignPatterns.CreationalDesignPatterns.BuilderPattern;

public class MainClass {
	
    public static void main(String[] args) {
 
    	AlertDialog dialog = new AlertDialog.Builder()
    					.setTitle("Hello")
    					.setSubTitle("Prashant Bale")
    					.setMessage("How are you?")
    					.setFirstButtonText("Fine")
    					.setSecondButtonText("Not Good")
    					.Build();
    	
    	dialog.show();
    	
    	System.out.println("---------------------------------------");

    	AlertDialog dialog2 = new AlertDialog.Builder()
				.setTitle("Hello")
				.setSubTitle("Prashant Bale")
				.Build();

    	dialog2.show();
    
    }
}