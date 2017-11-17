package DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactoryStrategy;

import DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactoryStrategy.Strategies.IDnV.IDnVStrategy;
import DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactoryStrategy.Strategies.Mock.MockStrategy;
import DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactoryStrategy.Strategies.fp8.FP8Strategy;

public class AuthStrategyFactory {

	public static AuthStrategy buildAuthStrategy(Country location) {

		AuthStrategy authStrategy = null;
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
