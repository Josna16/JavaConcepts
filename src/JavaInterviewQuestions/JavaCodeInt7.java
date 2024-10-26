package JavaInterviewQuestions;

// program to check if a list of integers contains only odd numbers

public class JavaCodeInt7 {
	static boolean checkIfOddNumberInList(int[] array) {
		for (int i : array) {
			if (i % 2 == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 8 };
		if (checkIfOddNumberInList(arr)) {
			System.out.println("List contains only odd numbers");
		} else {
			System.out.println("List contains even numbers");
		}
	}
}
