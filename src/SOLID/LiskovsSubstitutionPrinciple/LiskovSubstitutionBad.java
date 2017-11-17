package SOLID.LiskovsSubstitutionPrinciple;

public class LiskovSubstitutionBad {

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
				System.out.println("Can not start Tesla. Not Charged... hu hu :(");
			}
		}
		
		
		public void chargeTesla() {
			System.out.println("Tesla : Charging : Started");
			isCharged = true;
			System.out.println("Tesla : Charging : Done ");
		}
	}
	
	
	public static void letsStartEngine(Car car) {

		if(car instanceof Tesla ) {
			Tesla t = (Tesla) car;
			if(t.isCharged == false) {
				t.chargeTesla();
			}
			
			t.startEngine();
		}
		else if(car instanceof Ferrari ) {
			car.startEngine();
		}
		
	}
	
	public static void main(String[] args) {
		
		LiskovSubstitutionBad instance = new LiskovSubstitutionBad();
		Ferrari ferrari = instance.new Ferrari();
		Tesla tesla = instance.new Tesla(false);

		letsStartEngine(ferrari);
		letsStartEngine(tesla);
		
	}
	
}
