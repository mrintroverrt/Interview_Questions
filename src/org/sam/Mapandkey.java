package org.sam;

import java.util.HashMap;
import java.util.Map;

public class Mapandkey {
	public static void main(String[] args) {
		Map<Integer, String> v = new HashMap<Integer, String>();
		v.put(10, "Java");
		v.put(20, "Sql");
		v.put(30, "Oops");
		v.put(40, "Selenium");

		for (Map.Entry<Integer, String> a : v.entrySet()) {
			System.out.println(a.getKey());
			System.out.println(a.getValue());

		}
	}

}
