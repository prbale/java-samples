package InterviewPrograms;

/**
 * This class demonstrate the Palindrome check functionality.
 * @author Prashant
 *
 */
public class PalindromeCheck {

	/**
	 * This method is used to check if provided word is palindrome or not.
	 * @param word
	 * @return boolean value. true if palindrome, else false is returned.
	 */
	public static boolean checkIfPalindrome(String word) {

		String temp = word;
		String first = "";
		String second = "";

		first = temp.substring(0, word.length() / 2);

		// if word length is even, then we can split the string in a normal way. 
		// if lenght is odd then we need to skip the center character. And string will be created by skipping
		// center character.
		if (word.length() % 2 == 0) {
			second = temp.substring(word.length() / 2, word.length());
		} else {
			second = temp.substring(word.length() / 2 + 1, word.length());
		}

		// use StringBuilder as we have inbuilt function for string reversal
		StringBuilder sb = new StringBuilder(second);

		//System.out.println("String to compare : " + first + " & " + second);

		if (first.equalsIgnoreCase(sb.reverse().toString())) {
			return true;
		}
		return false;

	}

	/**
	 * This method is used to find the largest palindrome in the provided string.
	 * @param word
	 * @return largest palindrome string.
	 */
	public static String getMaxLengthPalindrome(String word) {
		
		int maxLengthPalindrome = 0;
		String palindromeString = "";
		
		for( int i = 0 ; i < word.length() ; i++ ) {
		
			//System.out.println("Words to scan :");
			for( int j = i; j < word.length() ; j++ ) {
					
				String temp = word.substring(i, j+1);
				
				if(temp.length() != 1) {
				
					//System.out.println("\n" + temp);
					
					if( checkIfPalindrome(temp) ) {
						if( maxLengthPalindrome < temp.length() ) {
							maxLengthPalindrome = temp.length();
							palindromeString = temp;
						}
					}
				}
			}
			
		}
		return palindromeString;
	}
	
	
	public static void main(String[] args) {

		String strToCheck = "Life is Happy yppah si efilaaa";

		if (checkIfPalindrome(strToCheck)) {
			System.out.println("Yes.. ! " + strToCheck + " is a palindrome string.");
		} else {

			System.out.println("No... ! " + strToCheck + " is not a palindrome. ");
			
			System.out.println("But it has max palindrome in a word : " + getMaxLengthPalindrome(strToCheck));

		}
		
		
		
	}
}
