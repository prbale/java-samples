package DesignPatterns.BehavioralDesignPatterns.StateDesignPattern;

/**
 * Created by Prashant on 11-10-2017.
 */
public class Silent implements MobileAlertState {

    @Override
    public void alert(AlertStateContext context) {
        System.out.println("Silent...");
    }
}
