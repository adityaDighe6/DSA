/*23-JUL-2026 : The Two Sum problem in Java means finding two unique numbers in an integer array
 *  that add up to a specific target number.
*/
package DSAPractice;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0, -1, 2, -3, 1};
		int target = -2;
		
		TestTwoSum test = new TestTwoSum();
		boolean result = test.twoSum(arr, target);
		
		System.out.println("Result is : "+result);
	}

}
class TestTwoSum{
	public boolean twoSum(int arr[], int target) {
		
		//Sort the array.
		Arrays.sort(arr);
		//End
		
		int left = 0;
		int right = arr.length-1;
		
		while(left < right) {
			int sum = arr[left]+arr[right];
			
			if(sum == target) {
				return true;
			}
			else if(sum < target) {
				left++;
			}
			else {
				right--;
			}
		}
		
		return false;//If nothing is returned
	}
}