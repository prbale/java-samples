package DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstratFactoryPattern;

public class IndianCarFactory {

	public static Car buildCar(CarType model) {
		
		Car car = null;
		
		switch(model) {
		
			case HATCHBACK:
				car = new HatchBackCar(Location.INDIA);
				break;
		
			case SEDAN:
				car = new SedanCar(Location.INDIA);
				break;
				
			case LUXURY:
				car = new LuxuryCar(Location.INDIA);
				break;	
		}
		
		return car;
		
		
	}
}
