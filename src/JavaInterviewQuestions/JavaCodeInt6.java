package JavaInterviewQuestions;

//program to print fibonacci sequence using recursion

public class JavaCodeInt6 {
	static int fibonacci(int count) {
		if (count <= 1) {
			return count;
		} else {
			return fibonacci(count - 1) + fibonacci(count - 2);
		}
	}

	public static void main(String[] args) {
		int length = 10;
		for (int i = 0; i < length; i++) {
			System.out.println(fibonacci(i) + " ");
		}

	}

}
