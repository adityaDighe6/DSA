//28-JUL-2026 : Find missing number from array.

package DSAPractice;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,4,5,6};
		int n = 6; //Range is 6
		
		TestMissingNumberInArray test = new TestMissingNumberInArray();
		int missingNumber = test.missingNumberInArray(arr, n);
		
		System.out.println("Missing Number is : "+missingNumber);
	}

}
class TestMissingNumberInArray {
	public int missingNumberInArray(int arr[], int n) {
		
		//Need to find expected sum and actual sum.
		
		int expectedSum = n*(n+1)/2;
		int actualSum = 0;
		
		for(int a : arr) {
			actualSum += a;
		}
		
		//The difference between them is the missing number.
		return expectedSum-actualSum;
	}
}