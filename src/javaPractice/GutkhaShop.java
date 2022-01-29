package javaPractice;

import java.util.Scanner;

public class GutkhaShop {

	static String rajniGandha = "RajniGandha";
	static String vimal = "Vimal";
	static String sikhar = "Sikhar";

	public static void main(String[] args) {
		System.out.println("Khooshboo came to shop");
		Scanner sc = new Scanner(System.in);
		System.out.println("what you want");
		String selectedOption = sc.next();
		buyingOption(selectedOption);
	}

	public static void buyingOption(String selectedOption) {

		if (selectedOption.equalsIgnoreCase(rajniGandha)) {
			System.out.println("she found " + selectedOption);
		} else if (selectedOption.equalsIgnoreCase(vimal)) {
			System.out.println("she found " + selectedOption);
		} else if (selectedOption.equalsIgnoreCase(sikhar)) {
			System.out.println("she found " + selectedOption);
		} else {
			System.out.println("she dint find any thing " + selectedOption);
		}

	}

}
