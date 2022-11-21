package strings.com;

import java.util.Scanner;

public class AsciiValue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input: ");
		
		char ch = sc.next().charAt(0);
		
		int output = (int) ch;
		
		System.out.println(ch+" character integer value is: "+output);
		sc.close();
	}

}
