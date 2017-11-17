package TrickyQuestions.GuitarInventorySystem;

public enum Wood {

	INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHIGANY, MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;

	public String toString() {
		
		switch (this) {

		case INDIAN_ROSEWOOD: return "Indian Rosewood";
		case BRAZILIAN_ROSEWOOD: return "Brazilian Rosewood";
		case MAHIGANY: return "Mahigany";
		case MAPLE: return "Maple";
		case COCOBOLO: return "Cocobolo";
		case CEDAR: return "Cedar";
		case ADIRONDACK: return "Adirondack";
		case ALDER: return "Alder";
		case SITKA : return "Sitka";
		
		default:
			return "No such type";
		}
		
	};
	
}