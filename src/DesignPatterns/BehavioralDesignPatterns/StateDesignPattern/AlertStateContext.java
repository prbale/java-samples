package DesignPatterns.BehavioralDesignPatterns.StateDesignPattern;

/**
 *
 * @author Prashant
 */
public class AlertStateContext {

    private MobileAlertState currentState;

    public AlertStateContext() {
        currentState = new Ringing();
    }

    public void setState(MobileAlertState state) {
        currentState = state;
    }

    public void alert() {
        currentState.alert(this);
    }
}
