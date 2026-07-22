package DSAPractice;

import java.util.Arrays;

public class FlattenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{3,4,5},{2,4},{6}};
		
		//Approach 1 : Using Stream API
		int flatarr[] = Arrays.stream(arr).flatMapToInt(Arrays::stream).toArray();
		
		System.out.println("Using Stream API Flatten Array is : "+Arrays.toString(flatarr));
		//End
		
		//Approach 2 : Using nested for loops
		TestFlattenArray test = new TestFlattenArray();
		String result = test.flattenArray(arr);
		
		System.out.println("Using nested loops Flatten array is : "+result);
		//End
	}

}
class TestFlattenArray{
	public String flattenArray(int arr[][]) {
		
		int totalLength = 0;
		
		//Need to find total length of 2D array so that similar length new array can be formed to store.
		for(int row[] : arr) {
			totalLength += arr.length;
		}
		
		int flattenarr[] = new int[totalLength];
		
		int index = 0;
		
		for(int row[] : arr) {
			for(int element : row) {
				flattenarr[index++] = element;
			}
		}
			
		return Arrays.toString(flattenarr);
	}
}