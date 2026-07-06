//Day 1 : 06-Jul-2026

package DSAPractice;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Find second largest element in array.
		
		//Approach 1 : Using sort method.
		int arr[] = {55, 10, 8, 90, 43, 87, 95, 25, 50, 12};
		
		System.out.println("Array : "+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Second Largest Element is : "+arr[arr.length-2]);
		//End
		
		//Approach 2 : USing Nested for loops.
		int a;
		for(int i = 0; i<arr.length; i++) {//traversing array
			for(int j = i+1; j<arr.length; j++) {//comparison
				if(arr[i] > arr[j]) {
					a = arr[i];
					arr[i] = arr[j];
					arr[j] = a;
				}
			}
		}
		System.out.println("Second Largest Element is : "+arr[arr.length-2]);
		//End
		
		//Approach 3 : Using stream api
		int secondLargest = Arrays.stream(arr)
							.distinct() //Removes duplicates
							.boxed() //converts int to Integer
							.sorted(Comparator.reverseOrder()) //Sorts in reverse order
							.skip(1) //exclude first element as it is the largest one
							.findFirst() //now whatever is the first element is our second largest one
							.orElse(-1); //Returns -1 if not found.
		
		System.out.println("Second largest element is : "+secondLargest);
		//End
	}

}
