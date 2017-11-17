package DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstratFactoryPattern;

// Abstract as we can not create instance if this class
public abstract class Car {

	private CarType mCarType = null;
	private Location mCarLocation = null;
	
	public Car(CarType type, Location location) {
		this.setmCarLocation(location);
		this.setmCarType(type);
	}

	public CarType getmCarType() {
		return mCarType;
	}

	public void setmCarType(CarType mCarType) {
		this.mCarType = mCarType;
	}

	public Location getmCarLocation() {
		return mCarLocation;
	}

	public void setmCarLocation(Location mCarLocation) {
		this.mCarLocation = mCarLocation;
	}
	
	protected abstract void construct();
	
	@Override
	public String toString() {
		return "Car: Type : " + mCarType.toString() + " Country : " + mCarLocation.toString();
	}
}
