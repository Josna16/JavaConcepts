package JavaInterviewQuestions;

//Method to reverse two numbers in variables without using a third variable
public class JavaCodeInt4 {
	static void swapTwoNumbers(int a, int b) {
		System.out.println("Before conversion");
		System.out.println("first number is " + a);
		System.out.println("second number is " + b);
		b = b - a;
		a = a + b;
		b = a - b;
		System.out.println("After conversion");
		System.out.println("First number is " + a);
		System.out.println("Second number is " + b);
	}

	public static void main(String[] args) {
		swapTwoNumbers(6,5);
	}

}
