//31-JUL-2026 : Merge sorted arrays.

/*
Both arrays are already sorted.

We use two pointers (i for arr1, j for arr2) and compare elements.

The smaller element is placed into the result array.

Once one array is exhausted, the remaining elements of the other array are copied directly.

The final result is a sorted merged array.
*/

package DSAPractice;

import java.util.Arrays;

public class MergeSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {7, 5, 3, 1};
		int arr2[] = {2, 10, 6, 8, 4};
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		TestMergeSortedArrays test = new TestMergeSortedArrays();
		
		int mergedArrays[] = test.mergeSortedArrays(arr1, arr2);
		
		System.out.println("Merged Array is : "+Arrays.toString(mergedArrays));
		
	}

}
class TestMergeSortedArrays {
	public int[] mergeSortedArrays(int arr1[], int arr2[]) {
		
		int n1 = arr1.length;
		int n2 = arr2.length;
		
		int result[] = new int[n1+n2];
		
		int i = 0, j = 0, k = 0;
		
		// Merge elements while both arrays have remaining items
		while(i<n1 && j<n2) {
			if(arr1[i] <= arr2[j]) {
			   result[k++] = arr1[i++];
			}
			else {
			   result[k++] = arr2[j++];
			}
		}
		
		// Copy remaining elements from arr1
		while(i<n1) {
			result[k++] = arr1[i++];
		}
		
		// Copy remaining elements from arr2
		while(j<n2) {
			result[k++] = arr2[j++];
		}
		return result;
	}
}