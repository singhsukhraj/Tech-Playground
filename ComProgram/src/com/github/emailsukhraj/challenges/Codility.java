package com.github.emailsukhraj.challenges;

public class Codility {
	public static int solution(int N) {
		int count = 0;
		int maxCount = 0;
		String a = Integer.toBinaryString(N);
		int last = a.lastIndexOf('1');
		int first = a.indexOf('1');

		if (last == -1||last == first) {
			return count;
		}  else {

			char[] array = a.toCharArray();

			


			for (int i=first; i<last-first; i++) {
				count = array[i] == '0' ? count + 1 : 0;
				if (count > maxCount) {
					maxCount = count;
				}
			}
		}

		return maxCount;
	}

	public static void main(String[] args) {
		int result=solution(529);
		System.out.println(result);
	}
}
