package DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactoryStrategy.Strategies.IDnV;

import DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactoryStrategy.Strategies.AuthStrategy;
import DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactoryStrategy.Country;
import DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactoryStrategy.Strategy;

/**
 * Created by Prashant on 11-07-2017.
 */
public class IDnVStrategy extends AuthStrategy {

    public IDnVStrategy(Country location) {
        super(location, Strategy.IDnV);
    }

    @Override
    protected void construct() {
    }
}
