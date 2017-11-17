package TrickyQuestions.GuitarInventorySystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

	private List guitars;
	
	public Inventory() {
		guitars = new LinkedList<Guitar>();
	}	
	
	public void addGuitar(Guitar guitar) {
		guitars.add(guitar);
	}
	
	
	public Guitar getGuitar(final String serialNumber) {
		
		Iterator iter = guitars.iterator();
		while( iter.hasNext() ) {
			
			Guitar obj = (Guitar)iter.next();
			if(obj.getSerialNumber().equalsIgnoreCase(serialNumber)) {
				return obj;
			}
		}
		
		return null;
		
	}
	
	
	public ArrayList<Guitar> search(GuitarSpec searchGuitar) {
	
		ArrayList<Guitar> listOfGuitars = new ArrayList<>();
		
		Iterator iter = guitars.iterator();
		while( iter.hasNext() ) {
			
			Guitar guitar = (Guitar)iter.next();
			GuitarSpec obj = guitar.getGuitarSpec();
			
			// Note : We don't add check for serial number.

			if( searchGuitar.getBuilder() != obj.getBuilder() ) {
				continue;
			}
			
			if( searchGuitar.getBackWood() != obj.getBackWood() ) {
				continue;
			}
			
			if( searchGuitar.getTopWood() != obj.getTopWood() ) {
				continue;
			}
			
			if( searchGuitar.getType() != obj.getType() ) {
				continue;
			}
			
			String model = searchGuitar.getModel();
			
			if( (model != null) && ( !model.equals("")) && (!model.equalsIgnoreCase(obj.getModel())) )
				continue;
			
			
			listOfGuitars.add(guitar);
			
		}
		
		return listOfGuitars;
	}

}