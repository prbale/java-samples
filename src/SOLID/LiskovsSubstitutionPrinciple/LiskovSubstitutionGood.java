package SOLID.LiskovsSubstitutionPrinciple;

import SOLID.LiskovsSubstitutionPrinciple.LiskovSubstitutionGood.Car;
import SOLID.LiskovsSubstitutionPrinciple.LiskovSubstitutionGood.Ferrari;
import SOLID.LiskovsSubstitutionPrinciple.LiskovSubstitutionGood.Tesla;

public class LiskovSubstitutionGood {

	public interface Car {
		public void startEngine();
	}
	
	public class Ferrari implements Car {

		@Override
		public void startEngine() {
			System.out.println("Starting Ferrari... Druuum Druuum... :)");
		}
	}
	
	public class Tesla implements Car {

		private boolean isCharged = false;
		
		public Tesla(boolean isCharged) {
			this.isCharged = isCharged;
		}
		
		@Override
		public void startEngine() {
			
			if(isCharged) {
				System.out.println("Starting Tesla... Druuum Druuum... :)");
			}
			else {
				System.out.println("Tesla. Not Charged... hu hu :(");
				chargeTesla();
				System.out.println("Starting Tesla... Druuum Druuum... :)");
			}
		}
		
		
		public void chargeTesla() {
			System.out.println("Tesla : Charging : Started");
			isCharged = true;
			System.out.println("Tesla : Charging : Done ");
		}
	}
	
	
	public static void letsStartEngine(Car car) {
		car.startEngine();
	}
	
	public static void main(String[] args) {
		
		LiskovSubstitutionGood instance = new LiskovSubstitutionGood();
		Ferrari ferrari = instance.new Ferrari();
		Tesla tesla = instance.new Tesla(false);

		letsStartEngine(ferrari);
		letsStartEngine(tesla);
		
	}
	
}
