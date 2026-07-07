/* Note : If I would have used void as return type then I will print the result in my function itself.
 * If I would have used any other return type then I will return the value in function first and then in main method,
 * will store the result in a variable and then print it. Our function call itself is calculation/output.
*/
package DSAPractice;

import java.util.Arrays;

public class Trying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {55, 10, 8, 90, 43, 87, 95, 25, 50, 12};
		int result = secondLargest(arr);
		System.out.println(result);
	}
	
	public static int secondLargest(int arr[]) {
		
		Arrays.toString(arr);
		Arrays.sort(arr);
		//System.out.println("Second largest element is : "+arr[arr.length-2]);
		return arr[arr.length-2];
		
	}
	
	/*
	 * public static void secondLargest(int arr[]) {
	 * 
	 * Arrays.toString(arr); Arrays.sort(arr);
	 * System.out.println("Second largest element is : "+arr[arr.length-2]);
	 * //return arr[arr.length-2];
	 * 
	 * }
	 */	

}
