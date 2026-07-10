//10-JUL-2026 :if two words are Anagram or not

package DSAPractice;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestAnagram test = new TestAnagram();
		
		boolean anagram = test.isAnagram("Means", "Manes");
		System.out.println("Is anagram : "+anagram);
	}

}

class TestAnagram {
	
	public boolean isAnagram(String str1, String str2) {
		
		if(str1 == null && str2 == null && str1.equals("") && str2.equals("") && 
				str1.length() != str2.length()) {
			return false;
		}
		
		char arr1[] = str1.toLowerCase().toCharArray();
		char arr2[] = str2.toLowerCase().toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		return Arrays.equals(arr1, arr2);
	}
}
