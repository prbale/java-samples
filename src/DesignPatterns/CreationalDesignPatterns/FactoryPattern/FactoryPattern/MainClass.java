package DesignPatterns.CreationalDesignPatterns.FactoryPattern.FactoryPattern;

public class MainClass {
	
    public static void main(String[] args) {
    	
    	DuckFactory df = new DuckFactory();
    	Duck d1 = df.getDuck("p");
    	Duck d2 = df.getDuck("r");
    	    		
    	d1.swim();
    	d2.swim();
    }
}