package DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstratFactoryPattern;

public class CarFactory {

	private CarFactory() {
		// Can not create instance of this.
	}

	public static Car buildCar(CarType type, Location location) {

		Car car = null;

		if (location == Location.INDIA) {
			car = IndianCarFactory.buildCar(type);
		} else if (location == Location.CHINA) {
			car = ChinaCarFactory.buildCar(type);
		} else if (location == Location.USA) {
			car = USACarFactory.buildCar(type);
		}

		return car;
	}

}
