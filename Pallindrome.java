package DSAPractice;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "Madam";
		
		TestPallindrome test = new TestPallindrome();
		//Approach 1 : Using conventional logic.
		boolean result = test.isPallindrome(word);
		
		System.out.println("Pallindrome : "+result);
		//End
		
		//Approach 2 : Using StringBuilder()
		boolean result1 = test.isPallindromeUsingStringBuilder(word);
		
		System.out.println("Using StrinBuilder : "+result1);
		//End
	}

}

class TestPallindrome {
	
	public boolean isPallindrome(String word) {
		
		if(word == null) {
			return false;
		}
		
		String cleanword = word.toLowerCase();
		
		int left = 0;
		int right = cleanword.length()-1;
		
		while(left < right) {
			if(cleanword.charAt(left) != cleanword.charAt(right)) {
				return false; //mismatch found, not a pallindrome
			}
			
			left++;
			right--;
		}
		
		return true;
	}
	
	public boolean isPallindromeUsingStringBuilder(String word) {
		
		if(word == null) {
			return false;
		}
		
		String cleanword = word.toLowerCase();
		
		String reversed = new StringBuilder(cleanword).reverse().toString();
		
		return cleanword.equals(reversed);
	}
}