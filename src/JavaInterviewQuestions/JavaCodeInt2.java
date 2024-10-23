package JavaInterviewQuestions;

//Method to find if the given string contains a vowel

public class JavaCodeInt2 {

	static void vowelinString(String str) {
//		char[] vowel = { 'a', 'e', '1', 'o', 'u' };
//		char[] array = str.toCharArray();
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < 5; j++) {
//				if (vowel[j] == array[i]) {
//					System.out.println("Vowel \"" + vowel[j] + "\" is present in the string \"" + str + "\"");
//				}
//			}
//		}
		if (str.toLowerCase().matches(".*[aeiou].*")) {
			System.out.println("String contains vowel");
		} else {
			System.out.println("String does not contain vowel");
		}
	}

	public static void main(String[] args) {
		vowelinString("vghf");
		// Alternate way to iterate through an array
		char[] JavaCharArray = { 'a', 'b', 'c', 'd', 'e' };
		for (char c : JavaCharArray) {
			System.out.println(c);

		}
	}
}
