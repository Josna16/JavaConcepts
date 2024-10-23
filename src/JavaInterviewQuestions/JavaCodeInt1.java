package JavaInterviewQuestions;

import java.util.Arrays;

public class JavaCodeInt1 {
	// Method to reverse strings
	static String reverseString(String r) {
		char[] array = r.toCharArray(); // convert string to char array
		int strLength = r.length();
		String rev = "";
		for (int i = strLength - 1; i >= 0; i--) {
			rev = rev + array[i];
		}
		return rev;
	}

	static String reverseStringUsingWhile(String str) {
		char[] arr = str.toCharArray();
		int left_pointer = 0;
		int right_pointer = arr.length - 1;
		while (left_pointer < right_pointer) {
			char temp = arr[left_pointer];
			arr[left_pointer] = arr[right_pointer];
			arr[right_pointer] = temp;
			left_pointer += 1;
			right_pointer -= 1;
		}
		return Arrays.toString(arr);
	}

	public static void main(String[] args) {
		//String str1 = "Josna";
		//System.out.println(str1.length());
		System.out.println(reverseString("BreakFast"));
		System.out.println(reverseStringUsingWhile("BreakFast"));
	}

}
