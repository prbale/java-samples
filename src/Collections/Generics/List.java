package Collections.Generics;

public class List<T> {
	
	private T[] dataSource;
	private int size;
	private int pos;

	public List(int numOfElements) {
		size = numOfElements;
		pos = 0;
		dataSource = (T[]) new Object[size];
	}
	
	public void add(T obj) {
		dataSource[pos++] = obj;
	}
	
	public String toString() {
		
		String elements = " [ ";
		for(int i=0; i<pos; i++) {
		
			elements += dataSource[i].toString() + "";
			
			if(i < pos - 1){
				elements += " , ";
			}
		}
		elements += " ] ";
		return elements;
	}
}