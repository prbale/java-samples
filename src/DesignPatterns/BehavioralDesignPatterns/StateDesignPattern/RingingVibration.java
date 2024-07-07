package DesignPatterns.BehavioralDesignPatterns.StateDesignPattern;

public class RingingVibration implements MobileAlertState {

    @Override
    public void alert(AlertStateContext context) {
        System.out.println("Ringing... and Vibrating...");
    }
}
