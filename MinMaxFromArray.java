// Day 3 : 08-Jul-2026 : Find Maximum and Minimum number into array 

package DSAPractice;

import java.util.Arrays;

public class MinMaxFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, 1234, 45, 67, 1};
		
		TestMinMaxFromArray test = new TestMinMaxFromArray();
		
		//Approach 1
		test.findMinMaxFromArrayApproachOne(arr);
		//End
		
		//Approach 2
		test.findMinMaxFromArrayApproachTwo(arr);
		//End
		
		//Approach 3 : Using stream APIS
		int minnum = Arrays.stream(arr).min().getAsInt();
		int maxnum = Arrays.stream(arr).max().getAsInt();
		
		System.out.println("Approach 3 : Minimum is : "+minnum+" & "+" Maxmimum is : "+maxnum);
		//End
	}

}

class TestMinMaxFromArray {
	//Approach 1 : Using Arrays.sorted();
	public void findMinMaxFromArrayApproachOne(int arr[]) {
		
		Arrays.sort(arr);
		
		int min = arr[0];
		int max = arr[arr.length-1];
		
		System.out.println("Approach 1 : Minimum is : "+min+" & "+" Maximum is : "+max);
		
		return;
	}
	//End
	
	//Approach 2 : Using nested for loops
	public void findMinMaxFromArrayApproachTwo(int arr[]) {
		
		//check if array is null or empty
		if(arr == null && arr.length == 0) {
			System.out.println("Array is empty");
			return;
		}
		
		//if current element is < min then update or else if current element > max then update;
		int min = arr[0];
		int max = arr[0];
		
		for(int i = 0; i< arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
			else if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("Approach 2 : Minimumn is : "+min+" & "+" Maximum is : "+max);
		return;
	}
	//End
}
