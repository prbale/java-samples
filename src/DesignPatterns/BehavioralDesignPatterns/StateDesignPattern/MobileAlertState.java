package DesignPatterns.BehavioralDesignPatterns.StateDesignPattern;

/**
 * This interface represents the different states involved.
 * All states whould implement this state.
 *
 * @author Prashant
 */
public interface MobileAlertState {
    public void alert(AlertStateContext context);
}
