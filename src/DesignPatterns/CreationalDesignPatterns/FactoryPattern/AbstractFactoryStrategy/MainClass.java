package DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactoryStrategy;

import DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactoryStrategy.Strategies.AuthStrategy;

public class MainClass {
	
    public static void main(String[] args) {

    	// India
    	AuthStrategy indiaAuthStrategy = AuthStrategyFactory.buildAuthStrategy(Country.INDIA);
		// Canada
    	AuthStrategy canadaAuthStrategy = AuthStrategyFactory.buildAuthStrategy(Country.CANADA);
		// US
    	AuthStrategy usaAuthStrategy = AuthStrategyFactory.buildAuthStrategy(Country.USA);
		// Mock
    	AuthStrategy mockAuthStrategy = AuthStrategyFactory.buildAuthStrategy(Country.DEFAULT);

    	System.out.println(indiaAuthStrategy);
    	System.out.println(canadaAuthStrategy);
    	System.out.println(usaAuthStrategy);
    	System.out.println(mockAuthStrategy);

    }
}