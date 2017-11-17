package DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstratFactoryPattern;

public class LuxuryCar extends Car {

	public LuxuryCar(Location location) {
		super(CarType.LUXURY, location);
		
		construct();
	}

	@Override
	protected void construct() {
		
		System.out.println("Constructing Luxury Car");
	}

}
