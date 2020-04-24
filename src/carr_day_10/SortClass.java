package carr_day_10;

import java.util.Arrays;

public class SortClass {

	public static void main(String[] args) {

		// String names[] = new String[4];
		String names[] = { "Selami", "Betul", "Bahadır", "Akif" };

//			names[0] = "ALI";
//			names[1] = "VELI";
//			names[2] = "CAN";
//			names[3] = "MURAT";

		Arrays.sort(names);
		System.out.println(Arrays.toString(names));

		char firstName[] = names[0].toCharArray();
		Arrays.sort(firstName);
		System.out.println(Arrays.toString(firstName));

	}
}
