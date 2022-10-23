package DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactoryStrategy;

import DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactoryStrategy.Strategies.AuthStrategy;
import DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactoryStrategy.Strategies.IDnV.IDnVStrategy;
import DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactoryStrategy.Strategies.Mock.MockStrategy;
import DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactoryStrategy.Strategies.fp8.FP8Strategy;

/**
 * Factory class which will generate AuthStrategy instance
 */
public class AuthStrategyFactory {

	// Business logic which decides which strategy to build instance on.
	// Country and its strategy will be defined here
	public static AuthStrategy buildAuthStrategy(Country location) {

		AuthStrategy authStrategy;

		switch(location) {

			case USA:
				authStrategy = new FP8Strategy(Country.USA);
				break;

			case INDIA:
				 authStrategy = new IDnVStrategy(Country.INDIA);
				break;

			case CANADA:
				authStrategy = new FP8Strategy(Country.CANADA);
				break;

			default:
				authStrategy = new MockStrategy(Country.DEFAULT);

		}
		
		return authStrategy;
		
		
	}
}
