package DSAPractice;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {1, 1, 2, 2, 3, 4, 4, 5};
		
		TestRemoveDuplicatesFromSortedArray test = new TestRemoveDuplicatesFromSortedArray();
		int res = test.removeDuplicatesFromArray(arr);
		System.out.println(res);
	}

}
class TestRemoveDuplicatesFromSortedArray {
	public int removeDuplicatesFromArray(int arr[]) {
		
		if(arr == null || arr.length == 0) {
			return 0;
		}
		
		int uniqueIndex = 0;
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] != arr[uniqueIndex]) {
				uniqueIndex++;
				arr[uniqueIndex] = arr[i];
			}
		}

		return uniqueIndex+1;
	}
}