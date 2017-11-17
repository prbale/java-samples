package DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstratFactoryPattern;

public class USACarFactory {

	public static Car buildCar(CarType model) {
		
		Car car = null;
		
		switch(model) {
		
			case HATCHBACK:
				car = new HatchBackCar(Location.USA);
				break;
		
			case SEDAN:
				car = new SedanCar(Location.USA);
				break;
				
			case LUXURY:
				car = new LuxuryCar(Location.USA);
				break;	
		}
		
		return car;
		
		
	}
}
