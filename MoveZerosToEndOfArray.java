package DSAPractice;

import java.util.Arrays;

public class MoveZerosToEndOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0, 1, 0, 3, 12};
		
		TestMoveZerosToEndOfArray test = new TestMoveZerosToEndOfArray();
		test.moveZerosToEndOfArray(arr);
		
		System.out.println(Arrays.toString(arr));
	}

}
class TestMoveZerosToEndOfArray {
	public void moveZerosToEndOfArray(int arr[]) {
		
		int insertPos = 0;// Track position for the next non-zero element
		
		// Shift all non-zero elements forward
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] != 0) {
				arr[insertPos] = arr[i];
				insertPos++;
			}
		}
		
		while(insertPos < arr.length) {
			arr[insertPos] = 0;
			insertPos++;
		}
	}
}