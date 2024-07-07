package DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactoryStrategy.Strategies.Mock;

import DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactoryStrategy.Strategies.AuthStrategy;
import DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactoryStrategy.Country;
import DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactoryStrategy.Strategy;

/**
 * Created by Prashant on 11-07-2017.
 */
public class MockStrategy extends AuthStrategy {
    public MockStrategy(Country location) {
        super(location, Strategy.MOCK);
    }

    @Override
    protected void construct() {
    }
}
