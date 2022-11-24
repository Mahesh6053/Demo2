package practice5;

import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number b/w 1 to 5:");
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			
			int inp=sc.nextInt();
			int i=inp;
			if(i==3) {
			System.out.println("You got it");
			break;
			}
			else {
				System.out.print("guess Again: ");
			}
			
			
		}
		
sc.close();
	}

}
