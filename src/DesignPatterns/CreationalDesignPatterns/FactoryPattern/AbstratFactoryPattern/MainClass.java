package DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstratFactoryPattern;

public class MainClass {
	
    public static void main(String[] args) {
    	
    	Car car1 = CarFactory.buildCar(CarType.HATCHBACK, Location.INDIA);
    	Car car2 = CarFactory.buildCar(CarType.SEDAN, Location.CHINA);
    	Car car3 = CarFactory.buildCar(CarType.HATCHBACK, Location.USA);
    	Car car4 = CarFactory.buildCar(CarType.SEDAN, Location.USA );
    	Car car5 = CarFactory.buildCar(CarType.LUXURY, Location.INDIA);
    	
    	System.out.println(car1);
    	System.out.println(car2);
    	System.out.println(car3);
    	System.out.println(car4);
    	System.out.println(car5);
    	
    }
}