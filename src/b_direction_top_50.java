import java.util.Scanner;

public class b_direction_top_50 {

	public static final char[] VOWELS = { 'a', 'e', 'i', 'o', 'u', 'y' };
	public static final String KER = "ker";

	/*
	 * extracted from @see <a href=
	 * "https://github.com/2019-2020-IUT/M313-Algorithmique-avancee/blob/master/src/TP1/Palindrome.java"
	 * >M313's palindrome methods</a>
	 */
	static boolean isPalindromeRec(String str, int s, int e) {
		if (s == e)
			return true;
		if ((str.charAt(s)) != (str.charAt(e)))
			return false;
		if (s < e + 1)
			return isPalindromeRec(str, s + 1, e - 1);
		return true;
	}

	/*
	 * extracted from @see <a href=
	 * "https://github.com/2019-2020-IUT/M313-Algorithmique-avancee/blob/master/src/TP1/Palindrome.java"
	 * >M313's palindrome methods</a>
	 */
	static boolean isPalindrome(String str) {
		int n = str.length();
		if (n == 0)
			return true;
		return isPalindromeRec(str, 0, n - 1);
	}

	public static boolean isvowel(char c) {
		boolean ret = false;
		for (int i = 0; i < VOWELS.length; i++) {
			if (c == VOWELS[i]) {
				ret = true;
			}
		}
		return ret;
	}

	public static int countNamePoint(String s) {
		int vCount = 0;
		int cCount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (isvowel(s.charAt(i))) {
				vCount++;
			} else {
				cCount++;
			}
		}
		return (vCount * 2) - cCount;
	}

	public static boolean checkKerName(String s) {
		return s.contains(KER);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		int score = countNamePoint(input);

		if (checkKerName(input)) {
			score += 5;
		}

		if (isPalindrome(input)) {
			if (score > 0) {
				score *= 2;
			}
		}

		System.out.println(score);

		sc.close();
	}

}
