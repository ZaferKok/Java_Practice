package gokDar;

public class OddEven {

	public static void main(String[] args) {
		System.out.println(OddOrEven(93));
		WithIf(56);
	}

	public static String OddOrEven(int n) {
		return n % 2 == 0 ? "Even" : "Odd";
	}

	public static void WithIf(int a) {
		if (a % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}
}