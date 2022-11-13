package day11;

import java.util.HashMap;

public class OddTImeAppear {
	public static void main(String args[]) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 100, 400, 15, 15, 15, 15, 15, 15, 15, 15, 5 };
		findOddTimeAppearNum(arr);
	}

	public static void findOddTimeAppearNum(int[] arr) {
		HashMap<Integer, Integer> intMap = new HashMap<Integer, Integer>();
		Integer count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			count = intMap.get(arr[i]);
			if(count == null) {
				intMap.put(arr[i], 1);
			}
			else {
				intMap.put(arr[i], count + 1);
			}
		}
		
		for (Integer i  : intMap.keySet()) {
			if (intMap.get(i) %2 != 0) {
				System.out.println("key: " + i + " appear " + intMap.get(i) + " times.");
			}
			
		}
	}
}
