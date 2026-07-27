package DSAPractice;

import java.util.HashMap;

public class MaximumOccuringCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "sample string";
		
		TestMaximumOccuringCharacter test = new TestMaximumOccuringCharacter();
		char maxchar = test.maximumOccuringCharacter(str);
		
		System.out.println("Maximum occuring character is : "+maxchar);
	}

}
class TestMaximumOccuringCharacter{
	public char maximumOccuringCharacter(String str) {
		
		// create HashMap to store frequency of every character
		HashMap<Character, Integer> map = new HashMap<>();
		
		//to store length of string
		int n = str.length();
		
		//to store answer
		char ans = 0;
		
		// to check count of answer character is less or greater
        // than another elements count
		int count = 0;
		
		//traverse the string
		for(int i = 0; i<n; i++) {
			 // push element into map and increase its frequency 
			char ch = str.charAt(i);
			
			map.put(ch, map.getOrDefault(ch, 0) + 1);
			
			if(count < map.get(ch)) {
                ans = ch;
                count = map.get(ch);
            }
			
		}
		return ans;
	}
}