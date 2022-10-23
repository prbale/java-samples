package DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactoryStrategy.Strategies.fp8;

import DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactoryStrategy.Strategies.AuthStrategy;
import DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactoryStrategy.Country;
import DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactoryStrategy.Strategy;

/**
 * Created by Prashant on 11-07-2017.
 */
public class FP8Strategy extends AuthStrategy {

    public FP8Strategy(Country country) {
        super(country, Strategy.FP8);
    }

    @Override
    protected void construct() { }
}
