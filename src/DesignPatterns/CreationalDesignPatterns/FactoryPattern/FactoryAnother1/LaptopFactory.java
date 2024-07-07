package DesignPatterns.CreationalDesignPatterns.FactoryPattern.FactoryAnother1;

public class LaptopFactory {

    // Instance not required
    private LaptopFactory() {}

    public static Laptop getLaptop(String type) {
        switch (type) {
            case "windows":
                return new WindowsLaptop();
            case "mac":
                return new MacLaptop();
            default:
                return new WindowsLaptop(); // Default implementation
        }
    }

}
