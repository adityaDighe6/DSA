//20-JUL-2026 : Remove Duplicate character from string.
package DSAPractice;

import java.util.LinkedHashSet;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Aditya";
		
		TestRemoveDuplicatesFromString test = new TestRemoveDuplicatesFromString();
		String result = test.removeDuplicatesFromString(str);
		
		System.out.println("Modifiled String is : "+result);
	}

}

class TestRemoveDuplicatesFromString {
	public String removeDuplicatesFromString(String str) {
		
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		
		for(char c : str.toLowerCase().toCharArray()) {
			set.add(c);
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(char c : set) {
			sb.append(c);
		}
		
		return sb.toString();
	}
}