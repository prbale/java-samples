package DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactoryStrategy.Strategies;

import DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactoryStrategy.Country;
import DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactoryStrategy.Strategy;

/**
 * Created by Prashant on 11-07-2017.
 */

public abstract class AuthStrategy {

    private Country mCountryLocation = null;
    private Strategy strategy = null;

    public AuthStrategy(Country location, Strategy strategy) {
        this.setAuthStrategyLocation(location);
        this.setStrategyType(strategy);
    }

    private void setAuthStrategyLocation(Country mCountryLocation) {
        this.mCountryLocation = mCountryLocation;
    }
    private Country getAuthStrategyLocation() {
        return mCountryLocation;
    }

    private void setStrategyType(Strategy mStrateyType) {
        this.strategy = mStrateyType;
    }
    private Strategy getStrategyType() {
        return strategy;
    }

    protected abstract void construct();

    @Override
    public String toString() {
        return "\nCountry : " +
                getAuthStrategyLocation() +
                "\nAuthentication Strategy Type : " +
                getStrategyType() +
                "";
    }

}
