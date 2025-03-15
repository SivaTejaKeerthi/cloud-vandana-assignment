package Cloud_Vandana;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram_Check{
    public static boolean isAnagram(char[] charArray1, char[] charArray2) {
    	
    	if(charArray1.length != charArray2.length)
    		return false;
    	
    	Arrays.sort(charArray1);
    	Arrays.sort(charArray2);
    	
    	System.out.println("Sorted First Word : " + Arrays.toString(charArray1));
    	System.out.println("Sorted second Word : " + Arrays.toString(charArray2));
    	
    	return Arrays.equals(charArray1, charArray2);
    }
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter the first word: ");
		String sample_word1 = scanner.next();
		
		System.out.println("enter the second word: ");
		String sample_word2 = scanner.next();
		
		 char[] char1 = (sample_word1.toLowerCase()).toCharArray();
	     char[] char2 = (sample_word2.toLowerCase()).toCharArray();
		
	     
		if(isAnagram(char1, char2)) {
			System.out.println(" --- This word is Anagram --- ");
		}else {
			System.out.println(" -- not Anagram word -- ");
		}
		
		scanner.close();
		
	}

}
