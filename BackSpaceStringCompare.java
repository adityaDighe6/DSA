//30-JUL-2026
//To check if two strings containing backspace characters (#) are equal in Java.
//This approach reads both strings from right to left. 
//It counts backspaces on the fly to skip deleted characters without using extra memory.

package DSAPractice;

public class BackSpaceStringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ee#quaal#";
		String t = "equ#ual";
		
		TestBackSpaceStringCompare test = new TestBackSpaceStringCompare();
		boolean result = test.backspaceStringCompare(s, t);
		
		System.out.println("Result is : "+result);
	}

}
class TestBackSpaceStringCompare {
	public boolean backspaceStringCompare(String s, String t) {
		
		int i = s.length()-1;
		int j = t.length()-1;
		
		int skipS = 0;
		int skipT = 0;
		
		while(i>=0 || j>=0) {
			// Find the next valid character in string S
			while(i>=0) {
				if(s.charAt(i) == '#') {
					skipS++;
					i--;
				}
				else if(skipS > 0) {
					skipS--;
					i--;
				}
				else {
					break;
				}
			}
			// Find the next valid character in string T
			while(j>=0) {
				if(t.charAt(i) == '#') {
					skipT++;
					j--;
				}
				else if(skipT > 0) {
					skipT--;
					j--;
				}
				else {
					break;
				}
			}				
			// If one string finishes and the other has a valid character, they aren't equal
			if((i>=0) != (j>=0)) {
				return false;
			}
			// Compare the actual characters
            if (i >= 0 && j >= 0 && s.charAt(i) != t.charAt(j)) {
                return false;
            }
            	
            i--;
            j--;			
		}
		return true;
	}
}