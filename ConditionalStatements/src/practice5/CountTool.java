package practice5;

import java.util.Scanner;

public class CountTool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("I hear you like to count by 3 times");
		System.out.println("It depends on users wish: ");
		System.out.println("oh ok");
		
		System.out.println("1.pick a num to count by:");
		Scanner sc= new Scanner(System.in);
		int countbynum=sc.nextInt();
		System.out.println("2.pick a num to start counting from");
		int picknum=sc.nextInt();
		System.out.println("3.pick a num to count to:");
		int countTo=sc.nextInt();
		for(int i=picknum;i<=countTo;i+=countbynum)
		{
			System.out.print(i+" ");
		}
		
		sc.close();
		
		
		

	}

}
