package DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstratFactoryPattern;

public class HatchBackCar extends Car {

	public HatchBackCar(Location location) {
		super(CarType.HATCHBACK, location);
		
		construct();
	}

	@Override
	protected void construct() {
		
		System.out.println("Constructing HatchBack Car");
	}

}
