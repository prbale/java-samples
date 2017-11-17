package DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactoryStrategy;

/**
 * Created by Prashant on 11-07-2017.
 */

public abstract class AuthStrategy {

    private Country mCountryLocation = null;
    private Strategy strategy = null;

    public AuthStrategy(Country location, Strategy strategy) {
        this.setAuthStrategyLocation(location);
        this.setmStrateyType(strategy);
    }

    public Country getAuthStrategyLocation() {
        return mCountryLocation;
    }

    public void setAuthStrategyLocation(Country mCountryLocation) {
        this.mCountryLocation = mCountryLocation;
    }

    public Strategy getmStrateyType() {
        return strategy;
    }

    public void setmStrateyType(Strategy mStrateyType) {
        this.strategy = mStrateyType;
    }

    protected abstract void construct();

    @Override
    public String toString() {
        return "\nCountry : " + mCountryLocation + "\nAuthentication Strategy Type : " + strategy + "";
    }

}
