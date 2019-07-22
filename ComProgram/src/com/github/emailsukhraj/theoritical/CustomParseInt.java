package com.github.emailsukhraj.theoritical;

/**
 * 
 * Simple implementation for complexity theory check
 * https://www.geeksforgeeks.org/string-to-integer-in-java-parseint
 * 
 * @author developer
 *
 */
public class CustomParseInt {

	static Integer customParseInt(String number) {

		int num = 0;
		for (int i = 0; i < number.length(); i++) {
			if (((int) number.charAt(i) >= 48) && ((int) number.charAt(i) <= 59)) {
				num = num * 10 + ((int) number.charAt(i) - 48);
			} else {
				throw new NumberFormatException();
			}

		}
		return num;

	}

	public static void main(String[] args) {
		String number = "12345";

		System.out.println(customParseInt(number).toString());
	}
}
