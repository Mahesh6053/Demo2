package strings.com;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter the user input: ");
		Scanner sc = new Scanner(System.in);
		char inp = sc.next().charAt(0);

		if (inp == 'a' || inp == 'e' || inp == 'i' || inp == 'o' || inp == 'u' ||inp=='A' ||inp=='E' || inp=='I' ||inp=='O' || inp=='U') {
			System.out.println("vowel");

		} else
			System.out.println("consonant");

		sc.close();

	}

}
