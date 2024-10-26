package JavaInterviewQuestions;

// program to check if a string is palindrome

public class JavaCodeInt8 {
	static boolean checkPalindrome(String s) {
		String input = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			if (input.charAt(i) != input.charAt(s.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "malayalam";
		if (checkPalindrome(s)) {
			System.out.println("Given string is palindrome");
		} else {
			System.out.println("Given string is not palindrome");
		}

	}

}
