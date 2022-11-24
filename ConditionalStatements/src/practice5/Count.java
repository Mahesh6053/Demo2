package practice5;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi mahesh, choose a number to count to:");
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		System.out.println("Great! here how it is done ");
		for (int i = 0; i <=inp; i++)
			System.out.print(i+" ");
		sc.close();

	}

}
