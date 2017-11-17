package InterviewPrograms;

/**
 * Reverse String without using StringBuffer in Java
 * @author Prashant
 * 
 */

public class StringReversal {


	/**
	 * This method is used to reverse the string.
	 * @param originalString String which needs to be reversed.
	 * @return Reversed String
	 * Logic : We will start traversing from start and from end and keep on replacing till 
	 * both i and j meets at the center.
	 */
	public static String reverseString( String originalString ) {
		
		char[] array = originalString.toCharArray();
		
		for(int i=0, j=originalString.length()-1; i <= j ; i++, j-- ) {
			
			char ch = array[i];
			array[i] = array[j];
			array[j] = ch;
		}
		
		return new String(array);
	}
	
	
	public static void main( String[] args ){
		
		String str = "PRASHANT BALE";
		String revStr = reverseString(str);
		System.out.println("Reverse of " + str + " is : " + revStr);
		
		System.out.println("\n");
		
		str = "I am happy";
		revStr = reverseString(str);
		System.out.println("Reverse of " + str + " is : " + revStr);
		
	}
}
