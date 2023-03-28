package org.sam;

public class ReversetheString {
	public static void main(String[] args) {
		String str1 = "Inmakes Infotech PVT LTD";
		String emty = "";
		for (int i = str1.length() - 1; i > 0; i--) {
			emty += str1.charAt(i);

		}
		System.out.println(emty);
	}

}
