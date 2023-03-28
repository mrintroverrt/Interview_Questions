package org.sam;

import java.util.ArrayList;
import java.util.List;

public class Replace {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(200);
		l.add(600);
		l.add(100);
		l.add(700);
		l.add(900);

		for (int i = 0; i < l.size(); i++) {
			if (l.get(i) == 100) {
				l.set(i, 150);

			}

		}
		System.out.println(l);
	}

}
