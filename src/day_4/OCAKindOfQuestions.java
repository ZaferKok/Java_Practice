package day_4;

public class OCAKindOfQuestions {

	public static void main(String[] args) {

		// Oracle Certified associate

		int num = 10;
		do {
			// 10 -1 9
			System.out.print(num-- + " " + num);

		} while (num == 0);

		/*
		 * What is the result? A) 9876543210 B) 9 C) 421 D) 10 E) Nothing is printed
		 */

		String str = "M ";
		str = str.concat("E ");
		String add = "S ";
		str = str.concat(add);
		str.replace("S", "T");
		str = str.concat(add);
		str.replace("M", "Y");
		System.out.println(str);

	}

}
