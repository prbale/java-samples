package TrickyQuestions.GuitarInventorySystem;

import java.util.ArrayList;

/**
 * Previous Implementation issues:
 * We have added so many string comparisions which we can avoid. 
 * We should use constants or Enums to solve this problem.
 * 
 * @author Prashant
 *
 */

public class FindGuitarTester {

	public static void main(String[] args) {
		
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
	
		GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Model 1", Type.ELECTRIC, Wood.ALDER, Wood.ADIRONDACK);
		
		ArrayList<Guitar> guitarList = inventory.search(whatErinLikes);
		
		if(guitarList == null ){
			System.out.println("Sorry, Erin, We have nothing for you !");
		}
		else if(guitarList != null && guitarList.size() == 0){
			System.out.println("Sorry, Erin, We have nothing for you !");
		}
		else {
		
			System.out.println("Erin, You might like this :\n\n");
			
			for( Guitar guitar : guitarList ) {
				System.out.println("We have a " + guitar.getGuitarSpec().getBuilder() + " " + guitar.getGuitarSpec().getModel() + " " + guitar.getGuitarSpec().getType() + " guitar :\n" +
						guitar.getGuitarSpec().getBackWood() + " back and sides,\n" + 
						guitar.getGuitarSpec().getTopWood() + " top.\n" + 
						"You can have it for only $ " + guitar.getPrice() + " !\n");
			}
		}
	}

	// Add Guitars to Inventory
	private static void initializeInventory(Inventory inventory) {
		
		// Create Guitar Specs first
		GuitarSpec guitarSpec1 = new GuitarSpec(Builder.FENDER, "Model 1", Type.ELECTRIC, Wood.ALDER, Wood.ADIRONDACK);
		GuitarSpec guitarSpec2 = new GuitarSpec(Builder.COLLINGS, "Model 2", Type.ELECTRIC, Wood.ALDER, Wood.ADIRONDACK);
		GuitarSpec guitarSpec3 = new GuitarSpec(Builder.GIBSON, "Model 3", Type.ACCOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD);
		GuitarSpec guitarSpec4 = new GuitarSpec(Builder.MARTIN, "Model 4", Type.ACCOUSTIC, Wood.INDIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD);
		GuitarSpec guitarSpec5 = new GuitarSpec(Builder.OLSON, "Model 5", Type.ELECTRIC, Wood.INDIAN_ROSEWOOD, Wood.SITKA);
		
		
		
		Guitar guitar0 = new Guitar("1234ABC", 1230, guitarSpec1 );
		Guitar guitar1 = new Guitar("SFS2323", 3224, guitarSpec2 );
		Guitar guitar2 = new Guitar("AS12331", 433,  guitarSpec2 );
		Guitar guitar3 = new Guitar("ECZSREE", 5454, guitarSpec1 );
		Guitar guitar4 = new Guitar("3AF2324", 233,  guitarSpec3 );
		Guitar guitar5 = new Guitar("ASDASD1", 111,  guitarSpec1 );
		Guitar guitar6 = new Guitar("HGHGF33", 654,  guitarSpec5 );
		Guitar guitar7 = new Guitar("HDGHG33", 1345, guitarSpec5 );
		
		inventory.addGuitar(guitar0);
		inventory.addGuitar(guitar1);
		inventory.addGuitar(guitar2);
		inventory.addGuitar(guitar3);
		inventory.addGuitar(guitar4);
		inventory.addGuitar(guitar5);
		inventory.addGuitar(guitar6);
		inventory.addGuitar(guitar7);
		
	}
}
