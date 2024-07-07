package DesignPatterns.CreationalDesignPatterns.FactoryPattern.FactoryAnother1;

public class MainClass {

    public static void main(String[] args) {
        Laptop wlaptop = LaptopFactory.getLaptop("windows");
        Laptop mlaptop = LaptopFactory.getLaptop("mac");

        wlaptop.switchOn();
        wlaptop.startSound();
        wlaptop.switchOff();

        mlaptop.switchOn();
        mlaptop.startSound();
        mlaptop.switchOff();

    }
}
