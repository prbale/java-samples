package SOLID.DependencyInversionPrinciple;

/**
 * @author Prashant
 * This demonstrate the dependency Inversion Principle. We have seen in {@link DependencyInversionBad}, that 
 * How dependency on child class of parent class. Any change required in child implementation cause change
 * in parent class. This shows the tight coupling between the modules. 
 */
public class DependencyInversionGood {

	interface IProgram {
		public void work();
	}
	
	class Program implements IProgram {
		
		private String programName;
		public Program(String programName) {
			this.programName = programName;
		}
		@Override
		public void work() {
			System.out.println("Normal : " + this.programName + " Work Started..");
		}
	}
	
	class SuperProgram implements IProgram {

		private String programName;
		public SuperProgram(String programName) {
			this.programName = programName;
		}

		@Override
		public void work() {
			superWork();
		}

		private void superWork() {
			System.out.println("Super : " + this.programName + " Work Started..");			
		}
	}
	
	class CriticleProgram implements IProgram {
		
		private String programName;
		
		public CriticleProgram(String name) {
			programName = name;
		}
		
		@Override
		public void work() {
			System.out.println("Critical : " + this.programName + " Work started...");
		}
	}
	
	class Engineer {
		
		private IProgram program;
		
		public void setProgram(IProgram p) {
			program = p;
		}
		
		public void manage() {
			program.work();
		}
	}
	
	public static void main(String[] args) {
		
		DependencyInversionGood instance = new DependencyInversionGood();
		Engineer e = instance.new Engineer();
		e.setProgram(instance.new Program("Development"));
		e.manage();
		
		Engineer e2 = instance.new Engineer();
		e2.setProgram(instance.new SuperProgram("Management"));
		e2.manage();
		
		Engineer e3 = instance.new Engineer();
		e3.setProgram(instance.new CriticleProgram("Admin"));
		e3.manage();
		
	}
}
