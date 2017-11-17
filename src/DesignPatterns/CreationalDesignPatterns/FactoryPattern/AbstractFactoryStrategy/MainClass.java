package DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactoryStrategy;

public class MainClass {
	
    public static void main(String[] args) {
    	
    	AuthStrategy indiaAuthStrategy = AuthStrategyFactory.buildAuthStrategy(Country.INDIA);
		AuthStrategy canadaAuthStrategy = AuthStrategyFactory.buildAuthStrategy(Country.CANADA);
		AuthStrategy usaAuthStrategy = AuthStrategyFactory.buildAuthStrategy(Country.USA);
		AuthStrategy mockAuthStrategy = AuthStrategyFactory.buildAuthStrategy(Country.DEFAULT);

    	System.out.println(indiaAuthStrategy);
    	System.out.println(canadaAuthStrategy);
    	System.out.println(usaAuthStrategy);
    	System.out.println(mockAuthStrategy);

    }
}