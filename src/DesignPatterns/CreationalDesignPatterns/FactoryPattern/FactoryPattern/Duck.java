package DesignPatterns.CreationalDesignPatterns.FactoryPattern.FactoryPattern;

abstract class Duck {

	private String duckName;
	private String duckQuak;

	private String getDuckName() {
		return duckName;
	}

	void setDuckName(String duckName) {
		this.duckName = duckName;
	}

	public String getDuckQuak() {
		return duckQuak;
	}

	public void setDuckQuak(String duckQuak) {
		this.duckQuak = duckQuak;
	}
	
	void swim() {
		System.out.println(getDuckName() + " is Swimming");
	}
	
}
