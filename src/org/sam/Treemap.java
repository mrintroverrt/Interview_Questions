package org.sam;

import java.util.Map.Entry;
import java.util.TreeMap;

public class Treemap {
	public static void main(String[] args) {
		TreeMap<Integer, Integer> a = new TreeMap<Integer, Integer>();
		a.put(10, 10);
		a.put(20, 20);
		a.put(30, 30);
		a.put(40, 40);
		a.put(50, 50);
		a.put(60, 60);
		a.put(10, 10);
		a.put(50, 50);
		a.put(40, 40);

		for (Entry<Integer, Integer> entry : a.entrySet()) {
			System.out.println(entry.getKey());

		}
	}

}
