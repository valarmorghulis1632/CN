package HashMap;

import java.util.HashMap;
import java.util.Map;

import HashMap.customhashmap.CustomHashMap;

public class HashMapUsage {
	public static void main(String[] args) {
		System.out.println(maxFreqWord("hi hi hi hello  hello j j j j  ij ij ij ij kkk ij"));
//		CustomHashMap<Integer, String> map = new CustomHashMap<>();
//		map.put(5, "Sumit");
//		map.put(9, "Amit");
//		map.put(20, "Sam");
//		map.put(9, "Rahul");
//		System.out.println(map.get(9));
//
//		System.out.println(map.get(20));
//		System.out.println(map.get(40));
		// System.out.println(map.size());
		// for(Integer x: map.keySet()){
		// System.out.println(x);
		// }
		// for(String str:map.values()){
		// System.out.println(str);
		// }
		//
		// for(Map.Entry<Integer,String> entry: map.entrySet()){
		// System.out.println(entry.getValue()+"  "+entry.getKey());
		// }
	}

	public static String maxFreqWord(String input) {

		HashMap<String, Integer> map = new HashMap<>();
		String arr[] = input.split(" ");
		for (String currentString : arr) {
			if (map.containsKey(currentString)) {
				map.put(currentString, map.get(currentString) + 1);
			} else {
				map.put(currentString, 1);
			}
		}

		int maxFreq = Integer.MIN_VALUE;
		String maxFreqWord = "";
		for (Map.Entry<String, Integer> currentEntry : map.entrySet()) {
			if (currentEntry.getValue() > maxFreq) {
				maxFreqWord = currentEntry.getKey();
				maxFreq = currentEntry.getValue();
			}
		}
		return maxFreqWord;
	}


}
