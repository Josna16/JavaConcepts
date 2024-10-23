package JavaInterviewQuestions;

//Write a Java program to print a Fibonacci sequence using for loop and without using recursion.
public class JavaCodeInt3 {
	static void fibonacciSequence(int count) {
		int a = 0;
		int b = 1;
		int c = 1;
		for (int i = 0; i < count; i++) {
			System.out.println(a + ",");
			a = b;
			b = c;
			c = a + b;
		}
	}

	public static void main(String[] args) {
		fibonacciSequence(6);
	}

}
