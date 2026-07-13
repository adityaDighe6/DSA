package DSAPractice;

public class FindVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World";
		
		TestFindVowels test = new TestFindVowels();
		test.findVowels(str);
	}

}

class TestFindVowels {
	public void findVowels(String str) {
		
		String lower = str.toLowerCase();
		
		for(int i = 0; i<lower.length(); i++) {
			 char ch = lower.charAt(i);
			 
			 
			 if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				 System.out.println(str.charAt(i));
			 }
		}
		
	}
}
