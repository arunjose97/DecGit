package com.greens;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repeated_Program {

	public static void main(String[] args) {
		// "what you think what you become"

		String s = "what you think what you become";
		String[] sp = s.split(" ");
		Map<String, Integer> map1 = new HashMap<>();
		for (String a : sp) {

			if (map1.containsKey(a)) {
				Integer i = map1.get(a);
				map1.put(a, i + 1);
				// System.out.println(map1);
			} else {
				map1.put(a, 1);
			}
		}
		System.out.println(map1);
		Set<Entry<String, Integer>> entrySet = map1.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry);
			}
		}

	}
}
