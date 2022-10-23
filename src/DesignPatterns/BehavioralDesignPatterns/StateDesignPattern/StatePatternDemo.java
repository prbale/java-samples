package DesignPatterns.BehavioralDesignPatterns.StateDesignPattern;

/**
 * Created by Prashant on 11-10-2017.
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        AlertStateContext stateContext = new AlertStateContext();
        stateContext.alert();
        stateContext.alert();
        stateContext.setState(new Silent());
        stateContext.alert();
        stateContext.alert();
        stateContext.setState(new Vibration());
        stateContext.alert();
        stateContext.alert();
        stateContext.alert();
        stateContext.setState(new RingingVibration());
        stateContext.alert();
        stateContext.alert();
        stateContext.alert();
    }
}
