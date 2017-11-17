package TrickyQuestions.GuitarInventorySystem;

public class Guitar {

	private String serialNumber;
	private double price;
	private GuitarSpec guitarSpec;
	
	public Guitar(String serialNumber, double price, GuitarSpec guitarSpec) {
		this.setSerialNumber(serialNumber);
		this.setPrice(price);
		this.setGuitarSpec(guitarSpec);
	}	

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}


	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public GuitarSpec getGuitarSpec() {
		return guitarSpec;
	}

	public void setGuitarSpec(GuitarSpec guitarSpec) {
		this.guitarSpec = guitarSpec;
	}
}