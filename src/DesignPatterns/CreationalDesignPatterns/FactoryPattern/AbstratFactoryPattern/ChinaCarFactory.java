package DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstratFactoryPattern;

public class ChinaCarFactory {

	public static Car buildCar(CarType model) {
		
		Car car = null;
		
		switch(model) {
		
			case HATCHBACK:
				car = new HatchBackCar(Location.CHINA);
				break;
		
			case SEDAN:
				car = new SedanCar(Location.CHINA);
				break;
				
			case LUXURY:
				car = new LuxuryCar(Location.CHINA);
				break;	
		}
		
		return car;
		
		
	}
}
