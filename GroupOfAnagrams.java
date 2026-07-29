//29-JUL-2026 : Merge sorted array

package DSAPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupOfAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
		
		TestGroupOfAnagrams test = new TestGroupOfAnagrams();
		 List<List<String>> groupOfAnagrams = test.groupOfAnagrams(words);
		
		System.out.println("Group of anagrams : "+groupOfAnagrams);
	}

}
class TestGroupOfAnagrams {
	public List<List<String>> groupOfAnagrams(String[] words) {
		
		if(words == null || words.length == 0) {
			return new ArrayList<>();
		}
		
		Map<String, List<String>> map = new HashMap<>();
		
		for(String word : words) {
			int count[] = new int[26];
			
			// Count occurrences of each character
			for(char c : word.toCharArray()) {
				count[c - 'a']++;
			}
			
			// Convert array to a unique string key (e.g., "[1, 0, 1,...]")
			String key = Arrays.toString(count);
			
			map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
		}
		
		
		return new ArrayList<>(map.values());
	}
}