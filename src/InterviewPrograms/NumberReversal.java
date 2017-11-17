package InterviewPrograms;

/**
 * Reverse Number without using StringBuffer in Java
 * @author Prashant
 */

public class NumberReversal {

	public static int reverseNumber ( int originalNumber , boolean isSimpleApproach ) {
		
		if( isSimpleApproach ) {
			
			String str = originalNumber + "";
			StringBuffer strB = new StringBuffer(str);
			String revString = strB.reverse().toString();
			int result = Integer.valueOf(revString);
		
			return result;		
		}
		else {
			
			int result = 0;
			int reminder;
			while(originalNumber>0) {
				
				reminder = originalNumber % 10;
				originalNumber = originalNumber / 10;
				result = result * 10 + reminder;
			}
			return result;
		}
		
	}
	
	
	public static void main( String[] args ){
		
		int i = 102;
		System.out.println("Reverse of " + i + " is : " + reverseNumber(i,true));
		System.out.println("\n");
		
		i = 12345;
		System.out.println("Reverse of " + i + " is : " + reverseNumber(i, false));
		System.out.println("\n");
		
			
	}
}
