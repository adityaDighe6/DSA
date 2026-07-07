//07-Jul-2026 : Count unique Values in array.

package DSAPractice;

import java.util.Arrays;

public class CountUniqueValuesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 2, 3, 4, 4, 4, 5};
		
		TestCountUniqueValuesInArray test = new TestCountUniqueValuesInArray();
		
		int result = test.countUniqueValuesInArray(arr);
		System.out.println("Count of unique numbers is : "+result);
		
		//Approach 2 : Using stream api
		long countUnique =  Arrays.stream(arr).distinct().count();
		System.out.println("Using Stream API : "+countUnique);
		//End
	}

}

class TestCountUniqueValuesInArray {
	public int countUniqueValuesInArray(int arr[]) {
		
		Arrays.sort(arr);
		
		int uniqueCount = arr.length > 0 ? 1 : 0;
		
		for(int i = 1; i<arr.length; i++) {
			if(arr[i] != arr[i-1]) {
				uniqueCount++;
			}
		}
		
		return uniqueCount;
	}
}