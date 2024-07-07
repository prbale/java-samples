package DesignPatterns.CreationalDesignPatterns.FactoryPattern.FactoryAnother1;

abstract class Laptop {
    public void switchOn() {
        System.out.println("Switching ON !!!");
    }

    public void switchOff() {
        System.out.println("Switching OFF !!!");
    }

    abstract void startSound();
}
