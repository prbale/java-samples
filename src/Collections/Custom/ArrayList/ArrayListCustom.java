package Collections.Custom.ArrayList;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author Prashant
 * This class provides custom implementation of ListCollection ( without using Java api )
 * Insertion order of objects is maintained
 * Implementation allows you to store null as well.
 * 
 * Reference : http://www.javamadesoeasy.com/2015/02/arraylist-custom-implementation.html
 */
public class ArrayListCustom<E> {

	/**
	 * Default Initial capacity is set to ten.
     */
	private static final int INITIAL_CAPACITY = 10;

	private Object elementData[] = {};

	/**
	 * The size of the ListCollection (the number of elements it contains).
	 */
	private int size = 0;

	/**
	 * Constructs an empty list with an initial capacity of ten.
	 */
	public ArrayListCustom() {
		elementData = new Object[INITIAL_CAPACITY];
	}
	// Note: We can have multiple constructor with the initial capacity or other collection to set the Arraylist
	// 		 But this is out of scope for now.

	/**
	 * Ensure capacity of custom/your own ListCollection.
	 * Increases the capacity of this <tt>ListCollection</tt> instance by making it double.
	 */
	private void ensureCapacity() {
		int newIncreasedCapacity = elementData.length * 2; // Double it !
		elementData = Arrays.copyOf(elementData, newIncreasedCapacity); // Copy older data to new array
	}

	/**
	 * Appends the specified element to the end of this list.
	 *
	 * @param e element to be appended to this list
	 * @return <tt>true</tt> (as specified by {@link Collection#add})
	 */
	public boolean add(E e) {
		if(size == elementData.length) {
			ensureCapacity();
		}
		elementData[size++] = e;
		return true;
	}

	public void add(int index, E element) {
		rangeCheckForAdd(index);
		if(size == elementData.length) {
			ensureCapacity();
		}
		System.arraycopy(elementData, index, elementData, index + 1, size - index);
		elementData[index] = element;
		size++;
	}

	/**
	 * A version of rangeCheck used by add and addAll.
	 */
	private void rangeCheckForAdd(int index) {
		if (index > size || index < 0)
			throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
	}

	/**
	 * Constructs an IndexOutOfBoundsException detail message.
	 * Of the many possible refactorings of the error handling code,
	 * this "outlining" performs best with both server and client VMs.
	 */
	private String outOfBoundsMsg(int index) {
		return "Index: "+index+", Size: "+size;
	}


	public E get(int index) {
		
		if( index < 0 || index >= size ) {
			throw new IndexOutOfBoundsException("Index : " + index + " , Size : " + size);
		}
		
		return ((E) elementData[index]);
	}
	
	
	public Object remove(int index) {
		
		if( index < 0 || index >= size ) {
			throw new IndexOutOfBoundsException("Index : " + index + " , Size : " + size);
		}
		
		Object removedObject = elementData[index];
		
		for(int i = index ; i < size  ; i++) {
			elementData[i] = elementData[i+1];
		}
		size--;
		
		return removedObject;
	}
	
	public void display() {
		System.out.println("Displaying List : ");
		for(int i = 0; i < size; i++) {
			System.out.println("[" + i + "] -> " + elementData[i] + "");
		}
	}
}
