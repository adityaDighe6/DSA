package DSAPractice;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 12345;
		
		TestReverseNumber test = new TestReverseNumber();
		
		int result = test.reverseNumber(number);
		
		System.out.println("Reversed number is : "+result);
	}

}

class TestReverseNumber {
	public int reverseNumber(int number) {
		
		int reverse = 0;
		
		while(number != 0) {
			int digit = number % 10;//get the last digit
			
			reverse = reverse * 10 + digit;//Append it to reversed.
			
			number/=10;//remove last digit.
		}
		
		return reverse;
	}
}