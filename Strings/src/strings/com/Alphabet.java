package strings.com;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input ");
		char ch= sc.next().charAt(0);
		if((ch>='A' && ch<='Z') || (ch>='a'&& ch<='z'))
		{
			System.out.println(ch+" is an alphabet");
		}

		else
			System.out.println(ch+" is not an alphabet");
		sc.close();
	}

}
