package SOLID.DependencyInversionPrinciple;

/**
 * @author Prashant
 * Dependency inversion principle says that...
 * << Definition >>
 */
public class DependencyInversionBad {

	class Program {
		
		private String programName;
		public Program(String programName) {
			this.programName = programName;
		}
		public void work() {
			System.out.println(this.programName + " Work Started..");
		}
	}
	
	
	class Engineer {
		
		// Issue : Coupling at Concrete level. 
		// Solution : Coupling must be at abstract level.
		private Program program;
		
		public void setProgram(Program p) {
			program = p;
		}
		
		public void manage() {
			program.work();
		}
	}
	
	public static void main(String[] args) {
		
		DependencyInversionBad instance = new DependencyInversionBad();
		Engineer e = instance.new Engineer();
		e.setProgram(instance.new Program("Development"));
		e.manage();

		// If I want to have any Super work that needs to be assigned to Engineer like Manager
		// then we need to add extra method like superWork in Program class is tightly coupled 
		Engineer e2 = instance.new Engineer();
		e2.setProgram(instance.new Program("Management"));
		e2.manage();
		
	}
}
