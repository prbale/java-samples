package DesignPatterns.CreationalDesignPatterns.FactoryPattern.FactoryPattern;

/**
 * Factory Pattern :
 * 1. Is used when we have a super class with multiple sub-classes and based on input, we need to
 * 		return one of the sub class.
 * 2. We can apply a singleton pattern on the factory class or make a factory method static.
 * 3. Factory pattern makes the code more robust, less coupled and easy to extend.
 */

class DuckFactory {
	static Duck getDuck(String type) {
		switch (type.toLowerCase()) {
			case "p": return new PlasticDuck();
			case "r": return new RealDuck();
			default: 	return new RealDuck();
		}
	}
}
