package DSAPractice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestReverseString test = new TestReverseString();
		//Approach : 1
		System.out.println("Approach 1 : "+test.reversed);
		//End
		
		//Approach : 2
		String reversedString = test.reverseString();
		System.out.println("Approach 2 : "+reversedString);
		//End
	}

}

class TestReverseString {
	//Approach 1 : Using Stringbulder
	String original = "Aditya";
	
	//give input to stringbuilder, reverse it and convert back to string again.
	String reversed = new StringBuilder(original).reverse().toString();
	//End
	
	//Approach 2 : Using for loop
	public String reverseString() {
		
		String input = "Aditya";
		String output = "";
		
		for(int i = input.length()-1; i>=0; i--) {
			//output += input.charAt(i);
			output = new StringBuilder(input).reverse().toString(); //improved performance
		}
		
		return output;
	}
	//End
}