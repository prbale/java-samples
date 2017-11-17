package DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstratFactoryPattern;

public class SedanCar extends Car {

	public SedanCar(Location location) {
		super(CarType.SEDAN, location);
		
		construct();
	}

	@Override
	protected void construct() {
		
		System.out.println("Constructing Sedan Car");
	}

}
