package DSAPractice;

import java.util.Arrays;

public class OneMore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {55, 10, 8, 90, 43, 87, 95, 25, 50, 12};
		Aditya aditya = new Aditya();
		
		//Approach One
		aditya.secondLargestApproachOne(arr);
		//End
		
		//Approach Two
		int result = aditya.secondLargestApproachTwo(arr);
		System.out.println("Second largest element is : "+result);
		//End
	}
}

class Aditya{
	 //Approach 1 : Using Arrays.sort
	 public int secondLargestApproachOne(int arr[]) { 
		 Arrays.toString(arr); Arrays.sort(arr);
		 System.out.println("Second largest element is : "+arr[arr.length-2]);
		 return arr[arr.length-2]; 
	  }
	 //End
	 
	 //Approach 2 : Using nested for loops
	  int a;
	  public int secondLargestApproachTwo(int arr[]) { 
		  for(int i = 0; i<arr.length; i++) {//traversing array
			  for(int j = i+1; j<arr.length; j++) {//comparison
				  if(arr[i] > arr[j]) { 
					  a = arr[i]; 
					  arr[i] = arr[j]; 
					  arr[j] = a; } 
				  } 
			  }
	  return arr[arr.length-2]; 
	  }
}